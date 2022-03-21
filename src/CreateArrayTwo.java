import java.util.ArrayList;

public class CreateArrayTwo {

    public int arrayIndex (ArrayList<String> array) {
        // Здесь вытягиваем индекс элемента,
        int count = 0;
        int in = 0;

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).contains("0") || array.get(i).contains("1") || array.get(i).contains("2") ||
                    array.get(i).contains("3") || array.get(i).contains("4") || array.get(i).contains("5") ||
                    array.get(i).contains("6") || array.get(i).contains("7") || array.get(i).contains("8") ||
                    array.get(i).contains("9")) {
                    // Если убрать это условие с пустым телом ифа, то индекс высчитывается неправильно.
            } else if (array.get(i).isEmpty()) {
                // Если убрать это условие с пустым телом ифЭлса, то индекс высчитывается неправильно. Почему - так и не понял.
            } else if (!array.get(i).contains("0") || !array.get(i).contains("1") || !array.get(i).contains("2") ||
                    !array.get(i).contains("3") || !array.get(i).contains("4") || !array.get(i).contains("5") ||
                    !array.get(i).contains("6") || !array.get(i).contains("7") || !array.get(i).contains("8") ||
                    !array.get(i).contains("9")) {
                count++;
                if (count == 2) {
                    in = i;
                    break;
                }
            }
        }
        return in+1;
    }

    public ArrayList<String> arrayTwo (ArrayList<String> array, int index){
        // Здесь формирую новый список, в который входят все строки после второго встреченного имени.
        // Отрезаем все, что идет до индекса + саму строку под индексом. Индекс получил в вышенаписаном методе.

        ArrayList<String> arrayTwo = new ArrayList<>();
        for (int i = index; i<array.size(); i++){
            arrayTwo.add(array.get(i));
        }
        return arrayTwo;
    }
}
