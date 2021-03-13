package nl.andalu    ;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Variabelen toevoegen
        int firstDigit;
        int secondDigit;
        int thirdDigit;

        int puntenTotaal = 0;

        int maximum = 9;

        for (int i = 1; i <= 3; i++)  {
              Random randomizer = new Random();

            firstDigit = randomizer.nextInt(maximum)+1;
            secondDigit = randomizer.nextInt(maximum)+1;
            thirdDigit = randomizer.nextInt(maximum)+1;

            //  System.out.println("De waarde van het eerste getal is "+ firstDigit);
            //  System.out.println("De waarde van het tweede getal is "+ secondDigit);
            //  System.out.println("De waarde van het derde getal is "+ thirdDigit);

            int sumOfDigits = firstDigit + secondDigit + thirdDigit;
            int productOfDigits = firstDigit * secondDigit * thirdDigit;

            System.out.println("De som der getallen is: " + sumOfDigits);
            System.out.println("Het product van de getallen is: "+ productOfDigits);

            //  Oplossing van de gebruiker opvragen
            Scanner input = new Scanner(System.in);

            System.out.println("geef het eerste getal op:");
            int guessA = input.nextInt();

            System.out.println("geef het tweede getal op:");
            int guessB = input.nextInt();

            System.out.println("geef het derde getal op:");
            int guessC = input.nextInt();

            int sumOfInputs = guessA + guessB + guessC;
            int productOfInputs = guessA * guessB * guessC;

        // Win-conditie toevoegen
            if (sumOfDigits == sumOfInputs && productOfDigits == productOfInputs)   {
                System.out.println("Jaaaaa, dat is het juiste antwoord!");
                puntenTotaal = puntenTotaal + 1;
            }   else    {
                System.out.println("Nee helaas, deze ronde heb je verloren");
            }

            System.out.println("Je puntentotaal na ronde  " + i + " is " + puntenTotaal + ".");
            System.out.println("");

            // Wil de speler doorspelen of niet
            boolean continuePlaying = true;

            System.out.println("Wil je het spel nog eens spelen? Toets y/n");
            String continuePlayingUserChoice = input.nextLine();

            switch(continuePlayingUserChoice)   {
                case "y":   continuePlaying = true;
                    break;
                case "n" :  continuePlaying = false;
                        break;
                default:    continuePlaying = true;
                        break;
            }

        }
        // Meerdere rondes spelen

        System.out.println("Het spel is afgelopen!");

        // Menu toevoegen

    }
}
