//import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Esta es la documentacion de este cacho programa que es capaz de SUMAR 2 numeros por increible que parezca
 */
public class Program{

    public Program(){}

    /**
     * Y esta es la gran funcion que hace todo el trabajo !!!
     */
    public int suma(int op1, int op2){
        return op1+op2;
    }

    public static void main(String [] args){
        int op1=Integer.parseInt(args[0]);
        int op2=Integer.parseInt(args[1]);
        System.out.println(new Program().suma(op1,op2));
    }

//    @Test
    public void sumar5y7(){
        final int expected=12;
        final int actual=new Program().suma(5,7);
//        assertEquals(actual,expected);
    }
}