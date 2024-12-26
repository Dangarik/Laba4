//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] mass1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] mass2 = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        int[] mass4 = {-1, -2, -3, 4, 5, 6, 7, 8, 9, 10};
        int[] mass5 = null;

        printResults1(mass1);
        printResults1(mass2);
        printResults1(mass4);
        printResults1(mass5);
    }

    public static void printResults1(int[] mass) {
        try {
            double sum = calculateSum(mass);
            System.out.println("Сума від'ємних елементів: " + sum);
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }

    public static double calculateSum(int[] mass) {
        if (mass == null) {
            throw new NullPointerException("Масив не може бути null.");
        }
        if (mass.length == 0) {
            throw new IllegalArgumentException("Масив не може бути порожнім.");
        }

        double sum = 0;
        boolean hasNegative = false;

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 0) {
                sum += mass[i];
                hasNegative = true;
            }
        }

        if (!hasNegative) {
            throw new IllegalArgumentException("Масив не містить від'ємних чисел: " + java.util.Arrays.toString(mass));
        }

        return sum;
    }
}


