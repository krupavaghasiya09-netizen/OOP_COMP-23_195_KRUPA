import java.util.*;

class Payment{
    void process(int amt){
        System.out.println("Paid "+amt);
    }
}

class Card extends Payment{
    void process(int amt){
        System.out.println("Credit Card "+amt);
    }
}

class UPI extends Payment{
    void process(int amt){
        System.out.println("UPI "+amt);
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        int amt=sc.nextInt();

        Payment p;
        if(ch==1) p=new Card();
        else p=new UPI();

        p.process(amt);
    }
}
