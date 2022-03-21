import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadFile forArraySum = new ReadFile();
        ReadFile rf = new ReadFile();
        MathPayments mp = new MathPayments();

        try {
            System.out.println("Общие расходы за шабаш: " +CalculationSum.calculationSum(forArraySum.readFile()));

        } catch (IOException e) {
            System.out.println("Что-то пошло не так...");
        }
        int result = mp.mathPayments(mp.expensesFirstPerson, CalculationSum.calculationSum(rf.readFile()));
        if (result<0){
            System.out.println("Евгений должен Сергею " + Math.abs(result) + " рублей.");
        } else if (result>0){
            System.out.println("Сергей должен Евгению " + Math.abs(result) + " рублей.");
        } else {
            System.out.println("Никто никому ничего не должен. ");
        }
    }
}
