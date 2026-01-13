import java.sql.SQLOutput;
import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        System.out.println("Вас приветствует список покупок!");

        String[] shoppingList = new String[8];
        int productCount = 0;

        Scanner scanner = new scanner(System.in);

        while (true) {
            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Отобразить список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить программу");

            int actionNumber = scanner.nextInt();
            scanner.nextLine();

            if (actionNumber == 1) {
                if (productCount < 8) {
                    System.out.print("Введите название товара: ");
                    String product = scanner.nextLine();
                    shoppingList[productCount] = product;
                    System.out.println(" Товар " + product + " добавлен в список под номером " + (productCount + 1) + ".");
                    productCount++;
                }
                }else {
                    System.out.println("Извините, список полон!");
                }
            } else if (actionNumber == 2) {
            if (productCount == 0) {
                System.out.println("Список пуст. ");
            } else {
                System.out.println("Список покупок. ");
                for (int i = 0; i < productCount; i++) {
                    System.out.println((i + 1) + "." + shoppingList[i]);
                }
            }
            } else if (actionNumber == 3) {
                System.out.println();
            } else if (actionNumber == 4) {
                System.out.println();
            } else {
                System.out.println("Неизвестная команда!");
            }
        }
    }
}
