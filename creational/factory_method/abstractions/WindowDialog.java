package abstractions;

import implementations.WindowButton;
import interfaces.Button;

public class WindowDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
