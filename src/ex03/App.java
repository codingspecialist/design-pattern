package ex03;

/*
 * 프록시 패턴
 */
public class App {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
        TigerAdapter ta = new TigerAdapter(new OuterTiger());
        DoorMan dm = new DoorMan();
        dm.쫓아내(m);
        dm.쫓아내(c);
        dm.쫓아내(ta);
    }
}
