import java.util.Objects;
import java.util.Scanner;
public class Game {

    private String hidden;
    private String guess;
    private String hint;
    Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }

    public void run() {

        System.out.println("Enter a hidden word with 5 letters.");
        hidden = kb.nextLine();

         while(!Objects.equals(guess, hidden)){
             hint = "";
             System.out.println("Enter a 5 letter guess.");
             guess = kb.nextLine();

            for(int i=0; i<hidden.length(); i++){
                if(hidden.substring(i, i+1).equals(guess.substring(i, i+1)))  {
                   hint += guess.substring(i, i+1);
                }
                else if (hidden.indexOf(guess.substring(i,i+1)) != -1){
                    hint +=("+");
                }
                else{
                    hint += "*";
                }


            }
             System.out.println(hint);
        }
System.out.print("You got it!");

    }

}
