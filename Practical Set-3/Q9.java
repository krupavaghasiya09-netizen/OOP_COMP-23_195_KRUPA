import java.util.*;

public class Password {
    static boolean check(String p){
        if(p.length()<8) return false;

        int digit=0;
        for(char c:p.toCharArray()){
            if(!Character.isLetterOrDigit(c)) return false;
            if(Character.isDigit(c)) digit++;
        }
        return digit>=2;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String p=sc.next();
        System.out.println(check(p)?"Valid":"Invalid");
    }
}
