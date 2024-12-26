package Singleton;

class DBConnection {
    private static DBConnection DBConnectionObj;

    private DBConnection() {
        System.out.println("Object is created");
    }

    public static DBConnection getDBConnectionInstance() {
        if (DBConnectionObj == null) {
            synchronized (DBConnection.class) {
                if (DBConnectionObj == null) {
                    DBConnectionObj = new DBConnection();
                }
            }
        }
        return DBConnectionObj;

    }
}

public class DoubleCheckedLocking {
    public static void main(String[] args) {
        DBConnection dbConnectionObj = DBConnection.getDBConnectionInstance();
    }
}
