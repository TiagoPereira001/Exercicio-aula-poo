public class B extends A {
    protected double b;
    public B(int a,double b) {
        super(a);
        this.b = b;
    }
    @Override
    public String toString(){
        return "B{a =" + this.a + "b=" + b + "]";
    }
}
