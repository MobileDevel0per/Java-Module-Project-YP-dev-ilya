
import java.util.Scanner;

// Отредачил Класс «Main» +
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        Car[] cars = new Car[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Введите название автомобиля " + (i + 1) + ": ");
            String name = scanner.next();

            int speed = -1;
            while (speed < 0 || speed > 250) {
                System.out.print("Введите скорость автомобиля (0-250 км/ч): ");
                speed = scanner.nextInt();
                if (speed < 0 || speed > 250) {
                    System.out.println("Ошибка: скорость должна быть в диапазоне от 0 до 250.");
                }
            }

            cars[i] = new Car(name, speed);
            race.raceLeader(cars[i]);
        }

        System.out.println("Самая быстрая машина: " + race.getLeaderName());
        scanner.close();
    }
}
