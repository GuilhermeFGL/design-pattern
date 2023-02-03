package implementations;

import interfaces.Button;

public class WindowButton implements Button {

    public void render() {
        System.out.println("Window Button");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
