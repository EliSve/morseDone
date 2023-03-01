package MorseEnglish;

import java.util.HashMap;

public class Logic {
    public static void main(String[] args) {

    }


    private static HashMap<String, String> engK;
    private static HashMap<String, String> morK;

    public Logic() {

        engK = new HashMap<>();
        morK = new HashMap<>();



        String[] english = new String[]
                {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                        "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
                        "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", ",", "?", " ",
                };


        String[] morse = new String[]
                {"*-", "-***", "-*-*", "-**", "*", "**-*", "--*", "****", "**",
                        "*---", "-*-", "*-**", "--", "-*", "---", "*--*", "--*-", "*-*", "***", "-", "**-",
                        "***-", "*--", "-**-", "-*--", "--**", "*----", "**---", "***--", "****-", "*****", "-****",
                        "--***", "---**", "----*", "-----", "*-*-*-", "--**--", "**--**", "/",
                };


            for (int i = 0; i < english.length; i++) {
            engK.put(english[i], morse[i]);
            morK.put(morse[i], english[i]);
        }

    }


        public boolean check(String input, int numbInput) {

        String[] englishCheck = input.toLowerCase().split("");
        String[] morseCheck = input.toLowerCase().split("\s");
        boolean checkInput = false;

        if (numbInput == 1) {
            for (String engk: englishCheck)
                if (!engK.containsKey(engk) && !engk.equals(" ")) {
                    checkInput = true;
                }
        } else if (numbInput == 2) {
            for (String mork: morseCheck)
                if (!morK.containsKey(mork) && !mork.equals(" ")) {
                    checkInput = true;
                } else
                    break;
        }
        return checkInput;
    }

        public String convertToMorK(String input) {
        String inputEnglish = input.replaceAll("\s", " ").trim();
        String[] charToConverts = inputEnglish.toLowerCase().split("");
        StringBuilder convertedToMorse = new StringBuilder();

        for (int i = 0; i < charToConverts.length; i++) {
            if (i == (charToConverts.length - 1)) {
                convertedToMorse.append(engK.get(charToConverts[i]));
            } else {
                convertedToMorse.append(engK.get(charToConverts[i])).append(" ");
            }
        }
        return convertedToMorse.toString();
    }

    public String convertToEnglish(String input) {

        String[] charToConvert = input.split(" ");
        StringBuilder convertedToEnglish = new StringBuilder();

        for (int i = 0; i < charToConvert.length; i++) {

            convertedToEnglish.append(morK.get(charToConvert[i]));
        }
        return convertedToEnglish.toString();
    }
}