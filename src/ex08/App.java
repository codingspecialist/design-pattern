package ex08;

import ex08.pub.Publisher;
import ex08.sub.SubScriber;

// 옵저버 패턴 (콜백)
public class App {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        SubScriber sub1 = new SubScriber("홍길동");
        SubScriber sub2 = new SubScriber("임꺽정");
        SubScriber sub3 = new SubScriber("장보고");

        publisher.add(sub1);
        publisher.add(sub2);
        publisher.add(sub3);

        new Thread(() -> {
            publisher.notifyChange("상품 들어왔어요");
        }).start();

    }
}
