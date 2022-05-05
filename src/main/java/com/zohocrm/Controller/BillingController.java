package com.zohocrm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.Repository.BillingRepository;
import com.zohocrm.entity.Bill;
import com.zohocrm.services.BillServices;

@Controller
public class BillingController {
	@Autowired
	private BillServices billSer;
	
	@RequestMapping("/saveBill")
	private String saveBill(Bill bill,ModelMap model) {
		billSer.saveBillCon(bill);
		List<Bill> bills = billSer.getBills();
		model.addAttribute("bill",bills);
		return "bill_data";
	}
}
