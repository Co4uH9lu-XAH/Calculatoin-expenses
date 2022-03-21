
import java.util.ArrayList;

public class CreateArrayOne {

    ArrayList<String> arrayOne = new ArrayList<>();

    public  ArrayList<String> arrayFirstPerson(ArrayList<String> array){
        // Здесь буду формировать список с расходами первого человек

        int count = 0;
        int i = 0;
        while (count<2){
            if (array.get(i).contains("0")|| array.get(i).contains("1")|| array.get(i).contains("2")||
                    array.get(i).contains("3")|| array.get(i).contains("4")|| array.get(i).contains("5")||
                    array.get(i).contains("6")|| array.get(i).contains("7")|| array.get(i).contains("8")||
                    array.get(i).contains("9")){
                arrayOne.add(array.get(i));
                i++;
            } else if (array.get(i).isEmpty()){
                i++;
            } else if (!array.get(i).contains("0")|| !array.get(i).contains("1")|| !array.get(i).contains("2")||
                    !array.get(i).contains("3")|| !array.get(i).contains("4")|| !array.get(i).contains("5")||
                    !array.get(i).contains("6")|| !array.get(i).contains("7")|| !array.get(i).contains("8")||
                    !array.get(i).contains("9")){
                count++;
                i++;
            }
        }
        return arrayOne;
    }
}
