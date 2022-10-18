import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


       //Coffee Arrays

        String[] drinkNames = new String[5];
        int[] caffeineMG = new int[5];

        drinkNames[0] = "Original Blend Coffee";
        caffeineMG[0] = 205;

        drinkNames[1] = "Creamy Chill";
        caffeineMG[1] = 0;

        drinkNames[2] = "Hot Chocolate";
        caffeineMG[2] = 20;

        drinkNames[3] = "Steeped Tea";
        caffeineMG[3] = 175;

        drinkNames[4]  = "Redeye";
        caffeineMG[4] = 330;


        //Print Menu

        for (int i = 0; i < drinkNames.length; i++) {
            System.out.println(drinkNames[i]);
            System.out.println("     " + caffeineMG[i] + "mg caffeine");
        }

        //Search by caffeine.

        Scanner INPUT = new Scanner(System.in);
        System.out.println("Please enter an amount of caffeine to search our database. ");

        int chosenCaffeine = INPUT.nextInt();
        INPUT.nextLine(); // Squash bug.

        //"The old way"
        /* int whereWasItFound = -1;

        for (int i = 0; i < caffeineMG.length; i++) {

            if( caffeineMG[i] == chosenCaffeine){
                whereWasItFound = i;
            }
        }
*/
        System.out.println("It was found at " + intSearch(caffeineMG,chosenCaffeine));

INPUT.close();

    }

    public static int intSearch(int[] array, int key){

        for (int i = 0; i < array.length; i++) {

            if(array[i] == key){
                return i;
            }
        }

        return -1;


    }








}