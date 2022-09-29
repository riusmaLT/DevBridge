import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //Marius Davidavicius
        ArrayList<String> data = readFile("data.txt");
        selectLines(data);

    }
    public static ArrayList<String> readFile(String file){
        ArrayList<String> result = new ArrayList<String>();
        try{
            File myObj = new File(file);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                result.add(data);
            }
        }catch(FileNotFoundException e){
            System.out.println("Failas nerastas");
        }
        return result;
    }
    public static void selectLines(ArrayList<String> data){
        for(String line : data){
            String[] numbers = line.split("[a-zA-Z]+");
            for(String number : numbers){
                if(number.length()>1 && Integer.parseInt(number)>=10){
                    System.out.println(line);
                    break;
                }
            }
        }
    }
}