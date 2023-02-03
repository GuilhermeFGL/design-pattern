public class Prototype {

    public static void main(String[] args) {
        Robot robot1 = new Robot();
        robot1.setName("my robot");
        robot1.setVersion(1);
        robot1.getComponent().setDescription("a component");

        Robot robot2 = robot1.clone();
        robot2.getComponent().setDescription("another component");

        System.out.printf("my first robot: %s, v.%d, component: %s%n",
                robot1.getName(), robot1.getVersion(), robot1.getComponent().getDescription());
        System.out.printf("my second robot: %s, v.%d, component: %s%n",
                robot2.getName(), robot2.getVersion(), robot2.getComponent().getDescription());
    }
}
