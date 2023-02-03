package implementations;

import interfaces.Button;
import interfaces.Checkbox;
import interfaces.Factory;

public class MacOSFactory implements Factory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
