package ex09.pub;

public class Publisher {

    private String value = null;

    public String getValue() {
        return value;
    }

    public void change(String msg) {
        try {
            for (int i = 1; i < 6; i++) {
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        value = "상품";
    }
}
