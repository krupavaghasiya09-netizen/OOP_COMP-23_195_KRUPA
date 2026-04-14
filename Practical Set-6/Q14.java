public class Avg {
    static double avg(String[] v) throws Exception{
        double sum=0;

        for(String s:v){
            if(s==null) throw new NullPointerException();
            sum+=Double.parseDouble(s);
        }
        return sum/v.length;
    }

    public static void main(String[] args){
        try{
            String[] a={"10","20","30"};
            System.out.println(avg(a));
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Done");
        }
    }
}
