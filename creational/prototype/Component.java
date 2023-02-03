public class Component {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Component clone() {
        Component clone = new Component();
        clone.setDescription(this.getDescription());
        return clone;
    }
}
