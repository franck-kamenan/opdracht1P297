package be.intecbrussel.lambda.opdracht1;

public class Text
{
    private String sentence;

    public Text(String sentence)
    {
        this.sentence = sentence;
    }

    public void printFilteredWords(WordFilter filter)
    {
        for (String w: sentence.split(" "))
        {
            if (filter.isValid(w))
            {
                System.out.println(w);
            }
        }
    }
}
