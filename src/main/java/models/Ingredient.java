package models;

import java.io.Serializable;

public class Ingredient implements Serializable {
    //============= Class Properties ============//

    // id
    private long id;
    // title
    private String title;
    // quantity
    private int quantity;

    // zero argument constructor  - so java can reserve its space in memory, before we even set the properties with no nul-pointer exceptions
    public Ingredient() {}

    //=============== Getter and Setter ============//

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
