package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {

    //lets call this function as a helper function

    //this method will read data from a CSV file, and return as list

    //each element in the list will be an array

    public static List<String[]> read(String file){
        List<String[]> data = new LinkedList<>();
        String dataRow;

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((dataRow = br.readLine()) != null)
                {
                    String[] dataRecords = dataRow.split(",");
                    data.add(dataRecords);
                }

        } catch (FileNotFoundException e) {
            System.out.println("Could not find file");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("could not read file");
            e.printStackTrace();
        }
        return data;

    }
}
