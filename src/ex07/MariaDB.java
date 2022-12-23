package ex07;

public class MariaDB implements DB {

    private String url;

    @Override
    public int execute(String sql) {
        if (sql.equals("select")) {
            System.out.println("query execute : " + url + sql);
            return 1;
        } else {
            System.out.println("query fail : syntax error");
            return -1;
        }
    }

    @Override
    public void setUrl(String url) {
        this.url = url;
    }

}
