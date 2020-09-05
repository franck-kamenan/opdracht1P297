package be.intecbrussel.lambda.opdracht1;

@FunctionalInterface
public interface WordFilter
{
    public abstract boolean isValid(String s);
}
