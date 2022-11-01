package ex04;

/*
 * 싱글톤 패턴
 */
public class App {
    public static void main(String[] args) {
        DoorMan doorMan = DoorMan.getInstance();
        doorMan.쫒아내(new Cat());
    }
}
