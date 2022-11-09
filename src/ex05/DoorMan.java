package ex05;

// OCP를 지킬 수 없는 경우도 있다.
public abstract class DoorMan {
    public abstract void 지도하기();

    public void 쫒아내(Animal a) {
        System.out.println(a.getName() + " 쫒아내");
    }

    public void 일하기(Animal a) {
        지도하기();
        쫒아내(a);
    }

}
