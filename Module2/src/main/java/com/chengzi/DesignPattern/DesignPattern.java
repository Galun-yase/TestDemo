package com.chengzi.DesignPattern;

import com.chengzi.DesignPattern.Facade.Facade;
import com.chengzi.DesignPattern.Facade.Organization.Company;

public class DesignPattern {
    public static void  main(String[] args) {
        //Facade外观模式练习
        Facade facade=new Facade();
        Company company=facade.openCompany("chengzi");
        System.out.println(company);

    }
}
