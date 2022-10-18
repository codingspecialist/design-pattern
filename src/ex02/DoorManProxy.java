package ex02;

public class DoorManProxy {

    // 컴퍼지션
    private DoorMan doorMan;

    public DoorManProxy(DoorMan doorMan) {
        this.doorMan = doorMan;
    }

    public void 쫓아내(Animal a) {
        System.out.println("안녕");
        doorMan.쫓아내(a);
    }
}
