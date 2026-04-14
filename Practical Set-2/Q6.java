class Bill {
    void generateBill(int total){
        System.out.println("Bill = "+total);
    }

    void generateBill(int total, int discount){
        System.out.println("Bill = "+(total-discount));
    }

    void generateBill(int total, double percent){
        System.out.println("Bill = "+(total - total*percent/100));
    }

    public static void main(String[] args){
        Bill b = new Bill();
        b.generateBill(1000);
        b.generateBill(1000,100);
        b.generateBill(1000,10.0);
    }
}
