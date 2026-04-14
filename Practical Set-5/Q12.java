import java.util.*;

interface Order {
    void placeOrder(String item,int qty);
    void cancelOrder(int id);
    void generateBill();
}

abstract class PartialOrder implements Order {
    String item;
    int qty;

    public void placeOrder(String item,int qty){
        this.item=item;
        this.qty=qty;
        System.out.println("Order placed: "+item+" "+qty);
    }
}

class FinalOrder extends PartialOrder {
    int price=100;

    public void cancelOrder(int id){
        System.out.println("Order cancelled: "+id);
    }

    public void generateBill(){
        System.out.println("Bill = "+(qty*price));
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        FinalOrder f=new FinalOrder();

        f.placeOrder("Item",2);

        int ch=sc.nextInt();

        if(ch==1) f.generateBill();
        else f.cancelOrder(101);
    }
}
