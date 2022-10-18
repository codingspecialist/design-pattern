package ex02;

public class App {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
        DoorManProxy dm = new DoorManProxy(new DoorMan());
        dm.쫓아내(m);
        dm.쫓아내(c);
    }
}
