public final class Instance {

    private static Instance INSTANCE;

    private Instance() { }

    public static Instance getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Instance();
        }
        return INSTANCE;
    }

    public void doStuff() {
        System.out.println("this is the only instance of this class you will get");
    }
}
