package com.zohocrm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Repository.BillingRepository;
import com.zohocrm.entity.Bill;

@Service
public class BillServiceIMP implements BillServices {
	@Autowired
	private BillingRepository billRepo;

	@Override
	public void saveBillCon(Bill bill) {
		// TODO Auto-generated method stub
		billRepo.save(bill);
	}

	@Override
	public List<Bill> getBills() {
	List<Bill> findAll = billRepo.findAll();
	return findAll;
	}
}
