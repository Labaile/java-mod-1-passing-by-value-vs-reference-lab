public class SampleImmutable {
    public static void main(String[] args) {
        String myString = "initial value";
        addText(myString, " - adding new text");
        System.out.println("modified text: " + myString);
    }

    public static void addText(String result, String newText) {
        result = result + newText;
    }
}
