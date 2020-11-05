package ab.met.zensar.exceptionpack.practice.vowels;

public class NotVowelException extends Exception{
    public NotVowelException(String message){
        super(message);
    }

    @Override
    public String toString() {
        return "IT IS NOT VOWEL";
    }
}
