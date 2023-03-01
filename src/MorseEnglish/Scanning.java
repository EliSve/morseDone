package MorseEnglish;

import java.util.Scanner;

public class Scanning {
    static boolean language = true;
    static Logic l = new Logic();



    public static void main(String[] args) {

        // String för att kunna skriva text
        // int för siffror
        // scanner för att kunna scanna vad som står och skrivas ut
        String input = "";
        int numbInput = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose between 1. Morse or 2 English");


        //numbinput för siffror 1,2 i menyn
        //else if om det första alternativet 1 inte blir valt så blir alternativ 2 valt.
        while (language)
            try {
                numbInput = Integer.parseInt(sc.nextLine());
               if (numbInput == 1) {
                    System.out.println(".-- .-. .. - . / .-- .... .- - . ...- . .-. / -.-- --- ..- / .-- .- -. -");
                    language = false;
                } else if (numbInput == 2) {System.out.println("Write what you want" + "\s");
                     language = false;         }


                }
                catch (Exception e){
                System.out.println("Choose");
                }
        {
                while (l.check(input, numbInput)){
                input = sc.nextLine();
            }
        }
            if (numbInput == 1){
                System.out.print(input + "English:");
                System.out.println(l.convertToMorK(input).replaceAll("\s"," ").trim());
            } else if (numbInput == 2){
                    System.out.println(input + "Morse:");
                    System.out.println(l.convertToEnglish(input).replaceAll("\s"," ").trim());
                }
            }
    }

