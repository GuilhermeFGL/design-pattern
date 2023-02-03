public class Builder {

    public static void main(String[] args) {
        Car car = Car.builder()
                .setVersion(1.0)
                .setDoor(2)
                .setSeat(4)
                .setDescription("My first car")
                .build();

        System.out.printf("Car: %s v.%.1f, doors: %d, seats: %d%n",
                car.getDescription(), car.getVersion(), car.getDoor(), car.getSeat());
    }

}
