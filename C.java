public class C extends B {
    private Character c;
    public C(int a, double b, Character c){
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
