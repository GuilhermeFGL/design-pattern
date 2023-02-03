package implementations;

import interfaces.Button;

public class HtmlButton implements Button {

    public void render() {
        System.out.println("HTML Button");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
