import implementations.MacOSFactory;
import implementations.WindowsFactory;
import interfaces.Button;
import interfaces.Checkbox;
import interfaces.Factory;

public class App {

    public static class Application {
        private final Button button;
        private final Checkbox checkbox;

        public Application(Factory factory) {
            button = factory.createButton();
            checkbox = factory.createCheckbox();
        }

        public void paint() {
            button.paint();
            checkbox.paint();
        }
    }

    private static Application configureApplication() {
        Factory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        return new App.Application(factory);
    }

    public static void main(String[] args) {
        Application app = App.configureApplication();
        app.paint();
    }
}
