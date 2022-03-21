import java.util.ArrayList;

public class CalculationSum {



    public static int calculationSum(ArrayList<String> array){
        // Здесь вычисляется сумма общих расходов. Проверяется строка, если в ней есть число, то парсится в int. Все int суммируются
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
