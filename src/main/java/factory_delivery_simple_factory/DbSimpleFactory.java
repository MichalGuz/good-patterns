package factory_delivery_simple_factory;


public class DbSimpleFactory extends SimpleFactory {
    private String dbConnection;

    public DbSimpleFactory(String dbConnection) {
        this.dbConnection = dbConnection;
    }

    public String getDbConnection() {
        return dbConnection;
    }
}
