public class Shifter {



    public static String reverseWords(final String original)
    {
        String result = "";
        String[] array = original.split(" ");
        for (String word : array) {
            String reversedWords = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWords += word.charAt(i);
            }
            result = result + " " + reversedWords;
        }
        return original.matches("\\s+") ? original : result.trim();
    }

    public static void main(String[] args) {

        String name = "Andrey Teterin";
        String voteResult = "000110000100001110000000010000000010001010010101010000011110010101000010000100001000010000110000011000000111000000001000100101000110000011000000100000111000111010111000101011101000110001111110011010101001110000001000010000110000110000100001000000100001101001110000111110001111011110111011110101000001100001111000000011111100001110000011111000011111011000000111110000011111001010110101010100111100001010101100100101010010010101111100001001101001010010101001100101110000101101001111f11111111111111111111111@1111111c11111k1111t1111r111@1111m11111p111111111111111111111011111111011111011111";
        int dT = 0;
        int vP = 0;
        String bag = "";
        for (int i = 0; i < voteResult.length(); i++) {
            if (voteResult.charAt(i) == '0') dT++;
            else if (voteResult.charAt(i) == '1') vP++;
            else bag+= voteResult.charAt(i);

        }
        System.out.println(reverseWords(" wewe  "));
        System.out.println(dT);
        System.out.println(vP);
        System.out.println(bag);


    }
}

