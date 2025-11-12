public class C extends B {
     public C(int a, double b, String c){
         super(a,b);
         this.c = c;
     }
     public double sum() {
         return a + b;
     }
     @Override
    public String toString(){
         return "C [a=" + a + ",b=" + b + ",c=" + c + "]";
     }
}
