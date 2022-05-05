package com.zohocrm.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entity.Contact;
import com.zohocrm.entity.Lead;
import com.zohocrm.services.ContactService;
import com.zohocrm.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadServ;
	
	@Autowired
	private ContactService conServ;
	
	@RequestMapping("/view")
	public String showLeadpage() {
		return "create_lead";
	}
	@RequestMapping("/saveall")
	public String showRec(@ModelAttribute("lead") Lead lead , ModelMap model) {
		leadServ.saveRec(lead);
		model.addAttribute("lead",lead);
		return "lead_data";
	}
	@RequestMapping("/listalllead")
	public String getAllLead(ModelMap model) {
	List<Lead> lead = leadServ.getAllLeadData();
		model.addAttribute("lead",lead);
		return "lead_result";
	}
	
	@RequestMapping("/getLeadBYid")
	public String getLeadByid(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadServ.getLead(id);
		model.addAttribute("lead",lead);
		return "lead_data";
	}
	
	@RequestMapping("/convertLead")
	public String converLead(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadServ.getLead(id);
		
		Contact leads = new Contact();
		leads.setFirstName(lead.getFirstName());
		leads.setLastName(lead.getLastName());
		leads.setEmail(lead.getEmail());
		leads.setLeadsource(lead.getLeadsource());
		leads.setMobile(lead.getMobile());
		
		conServ.saveContact(leads);
		
		leadServ.deleteById(id);
		List<Contact> contact = conServ.getContactById(id);
		model.addAttribute("contact",contact);
		return "contact_data";
	}
	
	
}
