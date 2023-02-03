package implementations;

import interfaces.Button;
import interfaces.Checkbox;
import interfaces.Factory;

public class WindowsFactory implements Factory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
