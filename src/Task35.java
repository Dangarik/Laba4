public class Task35 {
    public static void main(String[] args) {
        int[] mass1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15};
        int[] mass2 = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 10};
        int[] mass3 = {-1, -2, -3, 4, 5, 6, 7};
        int[] mass4 = null;

        printResults2(mass1);
        printResults2(mass2);
        printResults2(mass3);
        printResults2(mass4);
    }

    public static void printResults2(int[] mass) {
        try {
            double sum = calculateSum2(mass);
            System.out.println("Сума елементів з індексами [5-10]: " + sum);
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }

    public static double calculateSum2(int[] mass) {
        if (mass == null) {
            throw new NullPointerException("Масив не може бути null.");
        }
        if (mass.length < 11) {
            throw new IllegalArgumentException("Масив занадто короткий для індексів 5-10.");
        }

        int[] subArray = new int[6];
        System.arraycopy(mass, 5, subArray, 0, 6);

        double sum = 0;
        for (int value : subArray) {
            sum += value;
        }

        return sum;
    }
}