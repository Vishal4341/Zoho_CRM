package com.zohocrm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entity.Bill;

public interface BillingRepository extends JpaRepository<Bill, Long> {

}
