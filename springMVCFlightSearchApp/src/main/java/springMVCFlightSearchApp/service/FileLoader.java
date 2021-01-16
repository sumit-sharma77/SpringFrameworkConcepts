package springMVCFlightSearchApp.service;
import java.io.*;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springMVCFlightSearchApp.Constants.Constants;
import springMVCFlightSearchApp.Dao.FlightDataDao;
import springMVCFlightSearchApp.model.FlightData;

@Service
public class FileLoader {

	@Autowired
	private FlightDataDao flightDataDao;
	private BufferedReader br;
  
    /**
     * Data from Files loader function
     */
 
	@PostConstruct
    private void loadFiles() {
       

        File dir = new File(Constants.DIR_PATH);
        File[] files = dir.listFiles(); //stores list of files in given paths
        String line="";

        for(File file : files){
            try {
                br = new BufferedReader(new FileReader(file));
                br.readLine();
                while((line=br.readLine())!=null){

                    String []token=line.split(Constants.DELIMETER);
                    String fileName=file.getName().toUpperCase();

                    FlightData newflight = new FlightData(fileName.substring(0,fileName.lastIndexOf(".")),token[0],token[1],token[2],token[3],token[4],token[5],Double.parseDouble(token[6]),token[7],token[8]);
                    flightDataDao.insertFlightData(newflight);
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
