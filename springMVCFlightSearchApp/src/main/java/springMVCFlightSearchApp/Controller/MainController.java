package springMVCFlightSearchApp.Controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springMVCFlightSearchApp.Utilities.SortData;
import springMVCFlightSearchApp.Utilities.Validators;
import springMVCFlightSearchApp.model.FlightData;
import springMVCFlightSearchApp.model.Users;
import springMVCFlightSearchApp.service.FlightService;
import springMVCFlightSearchApp.service.UsersService;

@Controller
public class MainController {

	@Autowired
	private UsersService userService;
	@Autowired
	private FlightService flightService;

	/**
	 * Mapping to display first page on Startup
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public String loginPage() {
		return "LoginPage";
	}

	/**
	 * Mapping for after Login Validation
	 * 
	 * @param userName
	 * @param userPassword
	 * @param m
	 * @return
	 */
	@RequestMapping(path = "/afterlogin", method = RequestMethod.POST)
	// public String afterLogin( @ModelAttribute Users users, Model m) {

	public String afterLogin(
			@RequestParam("userName") String userName,
			@RequestParam("userPassword") String userPassword, Model m) {

		Users users = new Users(userName, userPassword);

		boolean loginSucess = userService.isValidUser(users);

		if (loginSucess) {
			m.addAttribute("title", "Search Flights");
			return "HomePage";
		}
		m.addAttribute("Error_msg", "Invalid User..!!");
		m.addAttribute("authorized", "false");
		return "LoginPage";
	}

	/**
	 * HomePage Mapping
	 * 
	 * @return
	 */
	@RequestMapping("/homepage")
	public String homepage() {
		return "HomePage";
	}

	/**
	 * Mapping to searching flights
	 * 
	 * @param departure
	 * @param arrival
	 * @param date
	 * @param flightClass
	 * @param sortedBy
	 * @param m
	 * @return
	 */
	@RequestMapping(path = "/search-Flights")
	public String displayFlights(
			@RequestParam("departure") String departure, 
			@RequestParam("arrival") String arrival,
			@RequestParam("date") String date, 
			@RequestParam("flightClass") String flightClass,
			@RequestParam("sortedBy") String sortedBy, Model m) {

		HashMap<String, String> errorMap = Validators.validationChecker(departure, arrival, date, flightClass);

		if (errorMap.isEmpty()) {

			List<FlightData> availableFlights = flightService.searchFlights(departure.toUpperCase(),
																			arrival.toUpperCase(), date, flightClass, sortedBy);
			availableFlights = SortData.sortingData(availableFlights, sortedBy);
			m.addAttribute("flightData", availableFlights);

			return "Display";
		} else {

			m.addAttribute("errorList", errorMap);
			m.addAttribute("departure", departure);
			m.addAttribute("arrival", arrival);
			m.addAttribute("date", date);
			m.addAttribute("flightClass", flightClass);
			m.addAttribute("sortedBy", sortedBy);

			return "HomeErrorPage";
		}
	}

}
