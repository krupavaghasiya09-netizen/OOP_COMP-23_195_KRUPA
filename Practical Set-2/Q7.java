class Loan {
    void calculateEMI(int p,int t,float r){
        System.out.println((p*r*t)/100);
    }

    void calculateEMI(double p,int t,double r){
        System.out.println((p*r*t)/100);
    }

    void calculateEMI(int p,int t){
        System.out.println((p*10*t)/100);
    }

    public static void main(String[] args){
        Loan l=new Loan();
        l.calculateEMI(100000,2,5f);
        l.calculateEMI(200000.0,3,7.5);
        l.calculateEMI(50000,1);
    }
}
