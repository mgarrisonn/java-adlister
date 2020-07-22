//package models;
//
//import com.mysql.cj.jdbc.Driver;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.List;
//
//public class MySQLContactsDao implements Contacts{
//
//    private Connection connection;
//
//    public MySQLContactsDao(Config config) {
//       try {
//           DriverManager.registerDriver(new Driver());
//           connection = DriverManager.getConnection(
//                   config.getUrl(),
//                   config.getUser(),
//                   config.getPassword()
//           );
//       } catch (SQLException throwables){
//           throwables.printStackTrace();
//       }
//    }
//
//    @Override
//    public long save(Contact contactToSave){
//        long lastInsertedId = 0;
//        String insertQuery = String.format(
//                "INSERT INTO contacts (name, phone_number) Values('%s', '%s')",
//                contactsToSave.getName(),
//                contactToSave.getPhoneNumber()
//        );
//        try {
//            Statement stmt = connection.createStatement();
//            stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
//            ResultSet generatedKeys = stmt.getGeneratedKeys();
//            if (generatedKeys.next()){
//                lastInsertedId = generatedKeys.getLong(1);
//            }
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//        return lastInsertedId;
//    }
//
//    @Override
//    public long save(Contact contactToSave) {
//        return 0;
//    }
//
//    @Override
//    public List<Contact> findAll() {
//        return null;
//    }
//}
