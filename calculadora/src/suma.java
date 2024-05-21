public class suma  {
    int a, b, c;
    PadreCalculadora cal = new PadreCalculadora();
        public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void sumar(){

        c=a+b;
    }

    public int getC() {
        return c;
    }
}