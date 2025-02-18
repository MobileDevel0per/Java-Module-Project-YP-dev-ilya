// Создал Класс «Гонка» +
public class Race {
    private String leaderName = "";
    private int maxDistance = 0;

    public void raceLeader(Car car) {
        int distance = car.distanceIn24H();
        if (distance > maxDistance) {
            maxDistance = distance;
            leaderName = car.getName();
        }
    }

    public String getLeaderName() {
        return leaderName;
    }
}