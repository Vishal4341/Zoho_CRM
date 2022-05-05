package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entity.Bill;

public interface BillServices {

public	void saveBillCon(Bill bill);

public List<Bill> getBills();

}
