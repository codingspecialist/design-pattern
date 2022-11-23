package ex06;

import ex06.notification.EmailNotifier;
import ex06.notification.Notifier;

/**
 * 데코레이터 패턴
 */
public class App {
    public static void main(String[] args) {
        Notifier notifier = new Notifier();
        notifier.send();
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send();
    }
}
