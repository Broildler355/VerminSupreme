import java.util.*;
public class PerfectPet {
    public static void main(String [] args){
        // Name: Fouad Kadry
        //Date: 10/22/25
        //This is the Vermin Supreeme pet selector that uses your inputs to determine your perfect pet
        Scanner input = new Scanner(System.in);
        //Gets the name input
        System.out.println("give me your name now");
        String name = input.nextLine();
        //Checks the favorite season
        System.out.println("give me your favorite season now(lowercase)");
        String season = input.nextLine();
        //Checks the favorite color
        System.out.println("give me your favorite color now(lowercase)");
        String color = input.nextLine();
        //Checks if the season is valid
        if (color.equals("blue")||color.equals("red")||color.equals("green")) {
            //Checks if the season is valid
            if (season.equals("fall")||season.equals("summer")||season.equals("winter")||season.equals("spring")) {
                //The following uses the given information to determine your pet
                //it chooses by deciding factors, starting with colors
                if (color.equals("blue")) {
                    if (season.equals("fall")) {
                        System.out.println("You get a pet alligator");
                    }
                    else if (season.equals("spring")) {
                        System.out.println("You get a pet ostrich");
                    }
                }
                else if (!"aeiou".contains(name.substring(0,1))) {
                    if (season.equals("winter")&&color.equals("green")){
                        System.out.println("You get a pet giraffe");
                    }
                    else if (color.equals("red")){
                        System.out.println("You get a pet panda");
                    }
                    else if (color.equals("blue")&&(season.equals("spring")||season.equals("winter"))){
                        System.out.println("You get a pet axolotl");
                    }
                }
                else if (color.equals("green")) {
                    if (!season.equals("fall")) {
                        System.out.println("You get a pet dog");
                    }
                }
                else if (color.equals("red")) {
                    System.out.println("You get a pet porcupine");
                }
                else if (season.equals("summer")){
                    System.out.println("You get a pet pony");
                }
                else {
                    System.out.println("You get a pet rock");
                }
        } 
            else {
            System.out.println("invalid season");
        }
        } 
        else {
            System.out.println("invalid color");
        }
    }
}