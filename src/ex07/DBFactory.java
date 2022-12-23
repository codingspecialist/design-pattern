package ex07;

public class DBFactory {

    private static DBFactory instance = new DBFactory();

    private DBFactory() {

    }

    public static DBFactory getInstance() {
        return instance;
    }

    public DB createDB(String protocol) {
        if (protocol.equals("maria")) {
            MariaDB mariaDB = new MariaDB();
            mariaDB.setUrl("jdbc:mariadb://");
            return mariaDB;
        } else if (protocol.equals("oracle")) {
            OracleDB oracleDB = new OracleDB();
            oracleDB.setUrl("jdbc:oracle:thin//");
            return oracleDB;
        } else {
            throw new NullPointerException("db driver not found exception");
        }
    }
}
