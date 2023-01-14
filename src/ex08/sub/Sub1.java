package ex08.sub;

public class Sub1 implements SubListener {

    @Override
    public void update(String msg) {
        System.out.println("sub1 이 받은 알림 : " + msg);
    }

}
