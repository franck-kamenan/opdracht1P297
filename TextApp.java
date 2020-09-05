package be.intecbrussel.lambda.opdracht1;

public class TextApp
{
    public static void main(String[] args)
    {
        Text text = new Text("Hello this is an example of a sentence containing words.");

        System.out.println("*** Words containing 'e' ***");
        text.printFilteredWords(new WordFilter() {
            @Override
            public boolean isValid(String s)
            {
                return s.contains("e");
            }
        });

    }
}
