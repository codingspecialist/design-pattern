package ex05;

/*
 * 전략 패턴
 */
public class App {
    public static void main(String[] args) {
        DoorMan doorMan1 = new GoodDoorMan();
        doorMan1.일하기(new Cat());
        DoorMan doorMan2 = new AngryDoorMan();
        doorMan2.일하기(new Mouse());
    }
}
