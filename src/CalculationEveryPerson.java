import java.util.ArrayList;

public class CalculationEveryPerson {

    public int expensesFirstPerson(ArrayList<String> array){
        // Здесь и ниже получаем сумму расходов для каждого участника по аналогии с ранее вычисленной суммой всех расходов.

        int sum=0;
        int temp;
        for(String string: array){
            if (string.contains("0")|| string.contains("1")|| string.contains("2")|| string.contains("3")
                    || string.contains("4")|| string.contains("5")|| string.contains("6")|| string.contains("7")
                    || string.contains("8")|| string.contains("9")){
                temp= Integer.parseInt(string);
                sum = sum+temp;
            }
        }
        return sum;
    }

    public int expensesSecondPerson(ArrayList<String> array){
        int sum=0;
        int temp;
        for(String string: array){
            if (string.contains("0")|| string.contains("1")|| string.contains("2")|| string.contains("3")
                    || string.contains("4")|| string.contains("5")|| string.contains("6")|| string.contains("7")
                    || string.contains("8")|| string.contains("9")){
                temp= Integer.parseInt(string);
                sum = sum+temp;
            }
        }
        return sum;
    }
}
