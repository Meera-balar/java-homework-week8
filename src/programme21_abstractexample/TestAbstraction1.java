package programme21_abstractexample;

public class TestAbstraction1 {
    public static void main(String[] args){
        Shape s = new Circle1();
        Shape s1 = new Rectangle();
        s.draw();
        s1.draw();
    }
}
