package springMVCFlightSearchApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springMVCFlightSearchApp.Dao.UsersDaoImpl;
import springMVCFlightSearchApp.model.Users;

@Service
public class UsersService {

	@Autowired
	private UsersDaoImpl usersDao;

	public boolean isValidUser(Users loginuser) {

		try {

			if (usersDao.validUser(loginuser)) {
				return true;
			} else {
				return false;
			}

		} catch (NullPointerException e) {

			return false;

		}

	}
}
