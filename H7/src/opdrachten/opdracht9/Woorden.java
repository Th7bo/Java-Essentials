package opdrachten.opdracht9;

public class Woorden {

    public static void main(String[] args) {
        String[][] words = {{"How ", "What’s ", "Let "},
                {"are ", "your ", "me "},
                {"you?", "name?", "try."}};
        for (int i = 0; i < words[0].length; i++) {
            for (String[] word : words) {
                System.out.print(word[i]);
            }
            System.out.println();

        }
    }

}
