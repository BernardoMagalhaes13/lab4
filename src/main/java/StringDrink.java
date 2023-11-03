public class StringDrink {
    private String Text;
    public StringDrink(String Text) {
        this.Text = Text;
    }
    public String getText() {
        return Text;
    }
    public void setText(String text) {
        Text = text;
    }
    public interface StringTransformer {
        void execute(StringDrink drink);
    }
}