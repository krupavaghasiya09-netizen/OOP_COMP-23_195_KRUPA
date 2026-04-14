import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amt = sc.nextInt();

        int[] notes = {100, 50, 10, 5, 2, 1};

        for(int n : notes){
            int count = amt / n;
            System.out.println(n + " = " + count);
            amt = amt % n;
        }
    }
}
