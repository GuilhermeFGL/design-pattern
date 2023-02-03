public class Car {

    private double version;
    private int seat;
    private int door;
    private String description;

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static class Builder {

        private final Car INSTANCE;

        private Builder() {
            this.INSTANCE = new Car();
        }

        public Builder setVersion(double version) {
            this.INSTANCE.setVersion(version);
            return this;
        }

        public Builder setSeat(int seat) {
            this.INSTANCE.setSeat(seat);
            return this;
        }

        public Builder setDoor(int door) {
            this.INSTANCE.setDoor(door);
            return this;
        }

        public Builder setDescription(String description) {
            this.INSTANCE.setDescription(description);
            return this;
        }

        public Car build() {
            return this.INSTANCE;
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}