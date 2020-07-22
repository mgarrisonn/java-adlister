package models;

import java.util.List;

public interface Contacts {

    long save(Contact contactToSave);
    List<Contact> findAll();

    // create method for delete contact, edit contact, search contact

}
