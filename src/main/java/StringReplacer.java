package org.example;

public class StringReplacer implements StringDrink.StringTransformer {
    private char oldchar;
    private char newchar;
    public StringReplacer(char oldchar, char newchar) {
        this.oldchar = oldchar;
        this.newchar = newchar;
    }
    @Override
    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(this.oldchar, this.newchar));
    }
}
