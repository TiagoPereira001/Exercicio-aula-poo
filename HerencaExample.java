import java.util.Scanner;

public class HerencaExample {
    public static void main(String[] args) {
        A a1,a2,a3;
        a1 = new A(1);
        a2 = new B(1,2.2d);
        a3 = new C(1,3.3d,'x');
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        A a;
        Scanner input = new Scanner(System.in);
        int x=input.nextInt();
        if (1==x) a = new A(1);
        else if (2==x) a = new B(1,1.1);
        else a = new C (1,3.3d,'x');

        System.out.println(a.toString() );
        if (a.getClass() == C.class)
            System.out.println("SUM" + ((C)a).sum());
    }
}
