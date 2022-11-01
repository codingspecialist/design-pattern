package ex04;

public class DoorMan {

    public static DoorMan doorMan = new DoorMan();

    public static DoorMan getInstance() {
        return doorMan;
    }

    private DoorMan() {
    }

    public void 쫒아내(Animal a) {
        System.out.println(a.getName() + " 쫒아내");
    }

}
