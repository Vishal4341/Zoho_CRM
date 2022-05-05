package com.zohocrm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entity.Contact;
import com.zohocrm.services.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService conser;
	
	@RequestMapping("/listallcontact")
	public String displayContact(Contact contact,ModelMap model) {
		List<Contact> allCon = conser.getAllContact(contact);
		model.addAttribute("contact",allCon);
		return "contact_data";
		
	}
	
	
	@RequestMapping("/getContactBYid")
	public String getContact(@RequestParam("id") long id,ModelMap model) {
		List<Contact> contact = conser.getContactById(id);
		model.addAttribute("contact",contact);
		return "contact_info";
	}
	
	@RequestMapping("/billingById")
	public String generateBill(@RequestParam("id") long id,ModelMap model) {
		Contact contact = conser.getContact(id);
		model.addAttribute("contact",contact);
		return "bill_gen";
	}
	

}
