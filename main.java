
import java.util.ArrayList;
import dao.Dao;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import model.challenge;
import model.round;


/**
 *
 * @author MuhammadMurtaza
 */
public class main {
    public static void main(String[] args) {
        ArrayList<round> roundList = new ArrayList<round>();
        Dao myDao = new Dao();

        String csvFile = "E:\\University\\Semester 6\\Software Construction\\Labs\\Lab 7\\test_two-anon.csv";
        String line;
        String commaSeparater = ",";

	try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            line = br.readLine();
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                //String[] country = line.split(commaSeparater);
                //int id = Integer.parseInt(country[0]);
                //double latitude = Double.parseDouble(country[5]);
                //double longitude = Double.parseDouble(country[6]);
                
            /**
                City e1=new City();  
                e1.setId(id);  
                e1.setCountry(country[1]);  
                e1.setLongitude(longitude);
                e1.setLatitude(latitude);
                cityList.add(e1);
            **/
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        try{
                round r1 = new round();
                r1.setId(6);
                r1.setUserId("user1");
                r1.setState(false);
                roundList.add(r1);
                myDao.saveRound(roundList);
        }finally{
                myDao.finalize();
        }
    }
}
