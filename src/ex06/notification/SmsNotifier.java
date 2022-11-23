package ex06.notification;

public class SmsNotifier implements Notifier {
    Notifier notifier;

    public SmsNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        notifier.send();
        System.out.println("문자 알림");
    }
}
