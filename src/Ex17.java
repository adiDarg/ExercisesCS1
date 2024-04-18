import java.util.Random;
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args){
        game();
    }
    public static boolean compareGuessToAnswer(String guess, String answer){
        boolean isCorrect = true;
        if (guess.length() != 5){
            System.out.println("Guesses can only be 5 letters long!");
            isCorrect = false;
        }
        else{
            for (int i = 0; i < 5; i++){
                if (guess.charAt(i) == answer.charAt(i)) {
                    System.out.print("2");
                } else if (answer.contains("" + guess.charAt(i))){
                    isCorrect = false;
                    System.out.print("1");

                }
                else {
                    isCorrect = false;
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        return isCorrect;
    }
    public static String randomWord(){
        Random random = new Random();
        int rnd = random.nextInt(0,10);
        switch (rnd){
            case 0 -> {
                return "grind";
            }
            case 1 -> {
                return "great";
            }
            case 2 -> {
                return "rhino";
            }
            case 3 -> {
                return "shelf";
            }
            case 4 -> {
                return "phone";
            }
            case 5 -> {
                return "water";
            }
            case 6 -> {
                return "bunny";
            }
            case 7 -> {
                return "hippo";
            }
            case 8 -> {
                return "zebra";
            }
            case 9 -> {
                return "yield";
            }
            default -> {
                return "igloo";
            }
        }
    }
    public static void game(){
        Scanner scanner = new Scanner(System.in);
        String answer = randomWord();
        for (int i = 1; i <= 6; i++){
            System.out.println("Input guess");
            String guess = scanner.next();
            if (compareGuessToAnswer(guess,answer)){
                System.out.println("You Won!!");
                break;
            }
            if (i == 6){
                System.out.println("You lost ):");
            }
        }
    }
}
