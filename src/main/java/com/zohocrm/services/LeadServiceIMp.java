package com.zohocrm.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.zohocrm.Repository.LeadRepository;
import com.zohocrm.entity.Lead;

@Service
public class LeadServiceIMp implements LeadService {
	
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void saveRec(Lead lead) {
	  leadRepo.save(lead);
	}

	@Override
	public List<Lead> getAllLeadData() {
		List<Lead> lead = leadRepo.findAll();
		
		return lead;
	}

	@Override
	public Lead getLead(long id) {
		// TODO Auto-generated method stub
		Lead byId = leadRepo.getById(id);
		return byId;
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		leadRepo.deleteById(id);
	}




}
