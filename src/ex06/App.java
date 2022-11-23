package ex06;

import ex06.notification.BasicNotifier;
import ex06.notification.EmailNotifier;
import ex06.notification.Notifier;
import ex06.notification.SmsNotifier;

/**
 * 데코레이터 패턴
 */
public class App {
    public static void main(String[] args) {
        Notifier notifier = new BasicNotifier();
        notifier.send();
        System.out.println("__end");

        Notifier emailNotifier = new EmailNotifier(new BasicNotifier());
        emailNotifier.send();
        System.out.println("__end");

        Notifier smsNotifier = new SmsNotifier(new BasicNotifier());
        smsNotifier.send();
        System.out.println("__end");

        Notifier allNotifier = new SmsNotifier(new EmailNotifier(new BasicNotifier()));
        allNotifier.send();
        System.out.println("__end");
    }
}
