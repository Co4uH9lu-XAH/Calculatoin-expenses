import java.io.IOException;

public class MathPayments {
    // Здесь объявляю требуемые переменные. Т.к. методы не статические, каждый раз приходится создавать новый объект нужного класса, чтобы
    // не было повторных считываний файла в один список. Думаю, надо как-то по другому. Считать список один раз и использовать. Но как?
    // Если сделать его static, то все равно не получается.

    CalculationEveryPerson calculationFirstPerson = new CalculationEveryPerson();
    CalculationEveryPerson calculationSecondPerson = new CalculationEveryPerson();
    CreateArrayOne createArrayOne = new CreateArrayOne();
    ReadFile readFile1 = new ReadFile();
    ReadFile readFile2 = new ReadFile();
    ReadFile readFile3 = new ReadFile();
    ReadFile readFile4 = new ReadFile();

    int index;
    int expensesFirstPerson;
    int generalExpenses;
    {
        try {
            CreateArrayTwo createArrayTwo = new CreateArrayTwo();
            index = createArrayTwo.arrayIndex(readFile1.readFile());
            System.out.println("Расходы Сергея: " + (expensesFirstPerson = calculationFirstPerson.expensesFirstPerson(createArrayOne.arrayFirstPerson(readFile2.readFile()))));
            System.out.println("Расходы Евгения: " +(calculationSecondPerson.expensesSecondPerson(createArrayTwo.arrayTwo(readFile3.readFile(), index))));
            generalExpenses = CalculationSum.calculationSum(readFile4.readFile());
        } catch (IOException e) {
            System.out.println("Что-то пошло не так...");
        }
    }



    public int mathPayments(int a, int sum) {
        // Здесь простой математический расчет, кто кому сколько должен
        // На три математических действия 7 классов. Это успех.

        int average = sum/2;
        return average-a;
    }
}
