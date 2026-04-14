class T1 extends Thread{
    int sum=0;

    public void run(){
        for(int i=1;i<=1000;i++) sum+=i;
    }
}

class T2 extends Thread{
    int sum=0;

    public void run(){
        for(int i=1001;i<=2000;i++) sum+=i;
    }
}

public class Main{
    public static void main(String[] args) throws Exception{
        T1 t1=new T1();
        T2 t2=new T2();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t1.sum+t2.sum);
    }
}
