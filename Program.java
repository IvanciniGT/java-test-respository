public class Programa{

    public Programa(){}

    public int suma(int op1, int op2){
        return op1+op2;
    }

    public static void main(String [] args){
        int op1=Integer.parseInt(args[0]);
        int op2=Integer.parseInt(args[1]);
        System.out.println(new Programa.suma(op1,op2));
    }

}