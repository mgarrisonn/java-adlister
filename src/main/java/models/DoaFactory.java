package models;

// will provide access to our Model data,
// but will not require accessing the ListBurgersDao / ListIngredientDao
// directly -- Instead, we will reference those interfaces
public class DoaFactory {
    private static McBurgers mcBurgersDao;

    public static McBurgers getMcBurgersDao(){
        if(mcBurgersDao == null){
            mcBurgersDao = new ListBurgersDao();
        }
        return mcBurgersDao;
    }

    private static Ingredients ingredientsDao;

    public static Ingredients getIngredientsDao(){
        if(ingredientsDao == null){
            ingredientsDao = new ListIngredientsDao();
        }
        return ingredientsDao;
    }


    public static void main(String[] args) {
        // giving complete access to
//        DoaFactory.mcBurgersDao.findById(2); // this would get the quarter pounder
        Ingredient cheese = DoaFactory.getIngredientsDao().findById(3);
        System.out.println(cheese.getTitle());
    }


}
