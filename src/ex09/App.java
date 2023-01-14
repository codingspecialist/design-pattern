package ex09;

import ex09.pub.Publisher;
import ex09.sub.Sub1;
import ex09.sub.Sub2;

// 옵저버 패턴 (콜백)
public class App {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Sub1 sub1 = new Sub1();
        Sub2 sub2 = new Sub2();

        new Thread(() -> {
            publisher.change("상품 들어왔어요");
        }).start();

        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("상품 들어왔어?");
            } catch (Exception e) {
                // TODO: handle exception
            }
            if (publisher.getValue() != null) {
                sub1.update(publisher.getValue() + "들어왔어요");
                sub2.update(publisher.getValue() + "들어왔어요");
                break;
            } else {
                System.out.println("상품 아직 이야");
            }
        }

    }
}
