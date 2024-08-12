package com.example.banking.Banking_App.controller;

import com.example.banking.Banking_App.model.Bank;
import com.example.banking.Banking_App.model.Branch;
import com.example.banking.Banking_App.model.Service;
import com.example.banking.Banking_App.service.BankService;
import com.example.banking.Banking_App.service.BranchService;
import com.example.banking.Banking_App.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class BankController {

    @Autowired
    private BankService bankService;

    @Autowired
    private BranchService branchService;

    @Autowired
    private ServiceService serviceService;

    @GetMapping("/bank/{id}/branches")
    public String getBankBranches(@PathVariable Long id, Model model) {
        Bank bank = bankService.getBank(id);
        List<Branch> branches = branchService.getBranchesByCityAndBank("Bangalore", id);

        model.addAttribute("bank", bank);
        model.addAttribute("branches", branches);
        return "bankBranches";
    }

    @GetMapping("/bank/{id}/services")
    public String getBankServices(@PathVariable Long id, Model model) {
        Bank bank = bankService.getBank(id);
        List<Service> services = serviceService.getServicesByBank(id);

        model.addAttribute("bank", bank);
        model.addAttribute("services", services);
        return "bankServices";
    }
}

