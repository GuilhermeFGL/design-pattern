package implemantations;

public class CoolingController {

    public void setTemperatureUpperLimit(int defaultCoolingTemp) {
        System.out.printf("CoolingController setTemperatureUpperLimit: %d", defaultCoolingTemp);
    }

    public void run() {
        System.out.println("CoolingController run");
    }

    public void cool(int maxAllowedTemp) {
        System.out.printf("CoolingController cool: %d", maxAllowedTemp);
    }

    public void stop() {
        System.out.println("CoolingController stop");
    }
}
