import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter o for Rock, 1 for Paper, 2 for Scissor");
        int userInput = sc.nextInt();

        Random random = new Random();
        int ComputerInput = random.nextInt(3);

        if(userInput == ComputerInput){
            System.out.println("DRAW");
        } else if(userInput == 0 && ComputerInput == 2 || userInput == 1 && ComputerInput == 0 || userInput == 2 && ComputerInput == 1 ){
            System.out.println("YOU WIN!");
        } else{
            System.out.println("COMPUTER WINS!");
        }
        System.out.println("Computer choice:" + ComputerInput);
    }

}
    

