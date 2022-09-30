import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }



    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guss the Number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();

    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guss it right it was %d\n you gussed it in %d attempts",number,noOfGuesses);
            return true;
        } else if (inputNumber<number) {
            System.out.println("too less ....");
        }
        else if (inputNumber>number) {
            System.out.println("too high ....");
        }

        return false;
    }
}

public class guss {
    public static void main(String[] args) {

        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();

        }
    }

}
