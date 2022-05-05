package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entity.Contact;

public interface ContactService {

public	void saveContact(Contact leads);

public List<Contact> getContactById(long id);

public List<Contact> getAllContact(Contact contact);

public Contact getContact(long id);


	
}
