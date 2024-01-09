public class Decoder {


    public static String decodeVowelSubstitution(String input) {
        return input.replaceAll("a", "1")
                .replaceAll("e", "2")
                .replaceAll("i", "3")
                .replaceAll("o", "4")
                .replaceAll("u", "5");
    }


    public static String decodeConsonantSubstitution(String input) {
        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isLetter(currentChar)) {
                char nextConsonant = findNextConsonant(currentChar);
                decoded.append(nextConsonant);
            } else {
                decoded.append(currentChar);
            }
        }
        return decoded.toString();
    }


    private static char findNextConsonant(char currentChar) {
        String consonants = "bcdfghjklmnpqrstvwxyz";
        int currentIndex = consonants.indexOf(Character.toLowerCase(currentChar));
        int nextIndex = (currentIndex + 1) % consonants.length();
        char nextConsonant = consonants.charAt(nextIndex);
        return Character.isUpperCase(currentChar) ? Character.toUpperCase(nextConsonant) : nextConsonant;
    }

    public static void main(String[] args) {

        String encoded1 = "t2st3ng";
        String encoded2 = "vetviph";


        String decoded1 = decodeVowelSubstitution(encoded1);
        System.out.println("Encoded: " + encoded1);
        System.out.println("Decoded: " + decoded1);


        String decoded2 = decodeConsonantSubstitution(encoded2);
        System.out.println("Encoded: " + encoded2);
        System.out.println("Decoded: " + decoded2);
    }
}
