public class C extends B {
    private Character c;
    public C(int a, double b, Character c){
        super(a,b);
        this.c = c;
    }
    public char getC(){
        return c;
    }
    public double sum() {
        return this.getA() + this.getB();
    }
    @Override
    public String toString(){
        return "C" + super.toString()+ "C " + "C=";
    }
}
