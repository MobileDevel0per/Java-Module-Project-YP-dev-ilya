
// Создал Класс «Автомобиль» +
public class Car {
    private String name;
    private int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int distanceIn24H() {
        return speed * 24;  // Формула: Дистанция = время (24) * скорость (вводит пользователь).
    }
}