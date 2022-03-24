import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

    //Здесь считываем файл в список

    ArrayList<String> array = new ArrayList<>();

    public  ArrayList<String> readFile() throws IOException {

        File file = new File("E:\\javaProjects\\Calculation.txt");
        Scanner scanner = new Scanner(file);
        String string;
        while (scanner.hasNext()){
            string =scanner.nextLine();
            array.add(string);
        }
        scanner.close();
        return array;

    }
}
