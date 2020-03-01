package com.chengzi.DesignPattern.Facade;

import com.chengzi.DesignPattern.Facade.Organization.AdminOfIndustry;
import com.chengzi.DesignPattern.Facade.Organization.Bank;
import com.chengzi.DesignPattern.Facade.Organization.Company;
import com.chengzi.DesignPattern.Facade.Organization.Taxation;

public class Facade {
    private AdminOfIndustry admin=new AdminOfIndustry();
    private Bank bank=new Bank();
    private Taxation taxation=new Taxation();

    public Company openCompany(String name){
        Company c =this.admin.register(name);
        String bankAccount=this.bank.openAccount(c.getId());
        String taxCode=this.taxation.applyTaxCode(c.getId());
        c.setBankAccount(bankAccount);
        c.setTaxCode(taxCode);
        return c;
    }
}
