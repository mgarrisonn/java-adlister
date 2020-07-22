//import models.Config;
//import models.MySQLContactsDao;

public class DaoFactory {
    private static Ads adsDao;
    private static Config config = new Config();
//    private static Contacts contactsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }


//    public static Contacts getContactsDao(){
//        if(contactsDao == null){
//            conactsDao = new MySQLContactsDao(new Config())
//        }
//        return contactsDao;
//    }

}
