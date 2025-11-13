public class A extends Object {
    protected int a;
    public A(int a) {
        this.a = a;
    }
    @Override
    public String toString() {
        return "A{" + "a=" + a + '}';
    }
    public int getA() {
        return a;
    }
}