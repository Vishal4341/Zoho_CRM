package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Repository.ContactRepository;
import com.zohocrm.entity.Contact;

@Service
public class ContactServiceIMP implements ContactService {
	@Autowired
	private ContactRepository conrepo;

	@Override
	public void saveContact(Contact leads) {
		// TODO Auto-generated method stub
		conrepo.save(leads);
	}

	@Override
	public List<Contact> getContactById(long id) {
		 List<Contact> contact = conrepo.findAll();
	return contact;
	}

	@Override
	public List<Contact> getAllContact(Contact contact) {
		List<Contact> findAll = conrepo.findAll();
		
		return findAll;
	}

	@Override
	public Contact getContact(long id) {
		
		Optional<Contact> findById = conrepo.findById(id);
		Contact contact = findById.get();
		
		// TODO Auto-generated method stub
		return contact;
	}
}
