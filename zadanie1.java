import java.util.Scanner;
import java.util.Arrays;

public class zadanie1 {
    public static void main(String[] args) {
        
        Scanner volodia = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("элементы массива: " + Arrays.toString(numbers));
        System.out.println("выберите действие:");
        System.out.println("1 добавить элемент");
        System.out.println("2 удалить элемент");

        int choice = volodia.nextInt(); //целое число

        if (choice !=1 && choice != 2) {
            System.out.println("неверный выбор");
            return;
        }

        if (choice == 1) {
            System.out.print("введи целое число для добавления: ");
            int newNumber = volodia.nextInt();
            
            int[] newArray = new int[numbers.length + 1];

            for (int i = 0; i < numbers.length; i++) {
                newArray[i] = numbers[i];
            }

            newArray[newArray.length - 1] = newNumber;
            numbers = newArray;
            System.out.println("элемент добавлен. новый массив: " + Arrays.toString(numbers));
        }

        if (choice == 2) {

            System.out.print("введи индекс элемента для удаления (0-" + (numbers.length - 1) + "): ");
            int indexToRemove = volodia.nextInt();

            if (indexToRemove < 0 || indexToRemove >= numbers.length) {
                System.out.println("неверный индекс");
                return;
            }

            int[] newArray = new int[numbers.length - 1];

            for (int i = 0, j = 0; i < numbers.length; i++) {
                if (i != indexToRemove) {
                    newArray[j++] = numbers[i];
                }
            }

            numbers = newArray;
            System.out.println("элемент удален. новый массив: " + Arrays.toString(numbers));
        }

    }
}