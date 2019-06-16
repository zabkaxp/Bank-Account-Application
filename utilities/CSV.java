package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
    //reading data from CSV file and returning as a list
    public static List<String[]> read(String file){
        List<String[]> data = new LinkedList<String[]>();
        String dataRow;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((dataRow = br.readLine()) != null){
            String[] dataRecord = dataRow.split(",");
            data.add(dataRecord);}
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Could not read file");
            e.printStackTrace();
        }
        return data;
    }
}
