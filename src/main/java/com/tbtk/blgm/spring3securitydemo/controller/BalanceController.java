package com.tbtk.blgm.spring3securitydemo.controller;

import com.tbtk.blgm.spring3securitydemo.model.AccountTransactions;
import com.tbtk.blgm.spring3securitydemo.model.Customer;
import com.tbtk.blgm.spring3securitydemo.repository.AccountTransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BalanceController {

    @Autowired
    private AccountTransactionsRepository accountTransactionsRepository;

    @PostMapping("/myBalance")
    public List<AccountTransactions> getBalanceDetails(@RequestBody Customer customer) {
        List<AccountTransactions> accountTransactions = accountTransactionsRepository.
                findByCustomerIdOrderByTransactionDtDesc(customer.getId());
        if (accountTransactions != null ) {
            return accountTransactions;
        }else {
            return null;
        }
    }

}
