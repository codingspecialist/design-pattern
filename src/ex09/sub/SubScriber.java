package ex09.sub;

public class SubScriber implements SubListener {

    private String name;

    public SubScriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + "이 받은 알림 : " + msg);
    }

}
