package ex01;

/*
 * 전략 패턴
 */
public class App {
    public static void main(String[] args) {
        DoorMan doorMan = new DoorMan();
        doorMan.쫒아내(new Cat());
    }
}
