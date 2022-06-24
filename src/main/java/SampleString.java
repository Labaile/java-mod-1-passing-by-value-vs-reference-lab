public class SampleString {
    public static void main(String[] args) {
        StringContainer myString = new StringContainer();
        myString.text = "initial value";
        addText(myString, " - adding new text");
        System.out.println("modified text: " + myString.text);
    }

    public static void addText(StringContainer result, String newText) {
        result.text = result.text + newText;
    }
}