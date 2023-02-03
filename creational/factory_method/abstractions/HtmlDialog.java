package abstractions;

import implementations.HtmlButton;
import interfaces.Button;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
