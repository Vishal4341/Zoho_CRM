package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entity.Lead;

public interface LeadService {

public 	void saveRec(Lead lead);

public List<Lead> getAllLeadData();

public Lead getLead(long id);

public void deleteById(long id);


}
