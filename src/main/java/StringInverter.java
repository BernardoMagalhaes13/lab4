package org.example;

public class StringInverter implements StringDrink.StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        StringBuilder str  = new StringBuilder(drink.getText());
        str = str.reverse();
        drink.setText(str.toString());
    }
}
