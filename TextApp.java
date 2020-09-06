package be.intecbrussel.lambda.opdracht1;

public class TextApp
{
    public static void main(String[] args)
    {
        final String c = "e";

        Text text = new Text("Hello this is an example of a sentence containing words.");

        System.out.println("*** Words containing 'e' ***");
        text.printFilteredWords(s -> s.contains(c));

        System.out.println("*** Long words ***");
        text.printFilteredWords(s -> s.length() > 4);

        System.out.println("*** Words containing 'a' ***");
        text.printFilteredWords(s -> s.startsWith("a"));

        System.out.println("*** Words with as a second letter 'e' ***");
        text.printFilteredWords(s -> s.indexOf('e') == 1);

        System.out.println("*** Words containing 2x 'e' ***");
        text.printFilteredWords(s -> s.indexOf("e") != s.lastIndexOf("e"));

        System.out.println("*** Words containing 2x 'e' but no more than that ***");
        text.printFilteredWords(s ->
        {
            int count = 0;
            for (char e : s.toCharArray())
            {
                if (e == 'e')
                    count++;
            }
            return count == 2;
        });
    }
}
