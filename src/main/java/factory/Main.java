package factory;

public class Main {
    public static void main(String[] args) {
        // Тестируем логистику
        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();
    }
}