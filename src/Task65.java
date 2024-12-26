public class Task65 {
    public static void main(String[] args) {
        int[] mass1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15};
        int[] mass2 = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, 10};
        int[] mass3 = {-1, -2, -3, 4, 5, 6, 7};
        int[] mass4 = null;

        printResults3(mass1);
        printResults3(mass2);
        printResults3(mass3);
        printResults3(mass4);
    }
    public static void printResults3(int[] mass) {
        try {
            int[] reversedMass = calculateSum3(mass);
            System.out.print("Перевернутий масив: ");
            for (int i = 0; i < reversedMass.length; i++) {
                System.out.print(reversedMass[i] + " ");
            }
            System.out.println(); 
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }

    public static int[] calculateSum3(int[] mass) {
        if (mass == null) {
            throw new NullPointerException("Масив не може бути null.");
        }
        for (int i = 0; i < mass.length / 2; i++) {
            int temp = mass[i];
            mass[i] = mass[mass.length - i - 1];
            mass[mass.length - i - 1] = temp;
        }
        return mass;
    }
}