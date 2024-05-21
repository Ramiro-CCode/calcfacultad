import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        suma sumamos= new suma();
        resta restamos=new resta();
        divide dividimos=new divide();
        multiplicar multiplicamos=new multiplicar();
        Scanner sc=new Scanner(System.in);
        String operacion= sc.next();
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(operacion.equals("sumar")){
            sumamos.setA(a);
            sumamos.setB(b);
            sumamos.sumar();
            System.out.println(sumamos.getC());
        }else if(operacion.equals("restar")){
            restamos.setA(a);
            restamos.setB(b);
            restamos.restar();
            System.out.println(restamos.getC());
        } else if (operacion.equals("dividir")) {
            dividimos.setA(a);
            dividimos.setB(b);
            dividimos.dividir();
            System.out.println(dividimos.getC());
        } else if (operacion.equals("multiplicar")) {
            multiplicamos.setA(a);
            multiplicamos.setB(b);
            multiplicamos.multiplica();
            System.out.println(multiplicamos.getC());
        }


    }
}
