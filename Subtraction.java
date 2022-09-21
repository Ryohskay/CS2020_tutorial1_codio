import java.util.Scanner;  // this programme requires Scan class

public class Subtraction {
    // A programme to fetch input from stdin and subtract them in order
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);  // System.in is unexplicitly a subclass of java.io.InputStream

        System.out.println("Subtraction calculator programme");
        
        // fetch values from stdin
        System.out.print("Please enter the value to subtract from: ");  // prompt
        int subtractFrom = input.nextInt();

        System.out.print("Please enter the value to subtract: ");  // prompt
        int subtractThis = input.nextInt();

        int answer = subtractFrom - subtractThis;

        System.out.format("%d - %d is %d%n", subtractFrom,subtractThis,answer);
    }
}