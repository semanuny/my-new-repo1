
import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        System.out.println("Вас приветствует список покупок!");

        ... shoppingList = ...;
        ... productCount = ...;

        Scanner scanner = new Scanner(System.in);

        while (...) {
            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Отобразить список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить программу");

            ... actionNumber = ...;

            if (actionNumber == ...) {

            } else if (...) {

            } else if (...) {

            } else if (...) {

            } else {
                System.out.println("Неизвестная команда!");
            }
        }
    }
}
