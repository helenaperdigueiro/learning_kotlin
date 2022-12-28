public class Main {
    public static void main(String[] args) {
        Integer integer = 1;
        double doubleNumber = 1.2;
        int newInteger = (int) doubleNumber;
        System.out.println(newInteger);



    }

    public String isVacationTime(boolean onVacation) {
        return onVacation ? "I'm on vacation!" : "I'm working!";
    }

    public void printNumbers(int[] numbers) {
        for (int number: numbers) {
            System.out.println(number);
        }
    }
}
