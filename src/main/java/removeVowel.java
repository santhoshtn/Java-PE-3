public class removeVowel {
    public static String[] vowelRemover(String[] input) {
        String[] returnString = new String[input.length];
        for (int i = 0; i < input.length; i++)
            returnString[i] = input[i].replaceAll("[aeiou]", "");

        return returnString;
    }

    public static void main(String[] args) {
    String[] input={"India","Austria"};
    String[] print=vowelRemover(input);
    for(int i=0;i<print.length;i++){
        System.out.println(print[i]);
    }
    }
}