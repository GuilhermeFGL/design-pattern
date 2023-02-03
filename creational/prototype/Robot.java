public class Robot {

    public Robot() {
        this.setComponent(new Component());
    }

    private String name;
    private int version;
    private Component component;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public Robot clone() {
        Robot clone = new Robot();

        clone.setName(this.getName());
        clone.setVersion(this.getVersion());
        clone.setComponent(this.getComponent().clone());

        return clone;
    }
}