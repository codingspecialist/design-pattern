package ex07;

public interface DB {
    public void setUrl(String url);

    public int execute(String sql);
}
