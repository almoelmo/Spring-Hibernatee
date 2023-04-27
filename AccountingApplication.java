package org.example.accounting;


import org.example.accounting.model.Accounting;
import org.example.accounting.model.Car;
import org.example.accounting.model.Owner;
import org.example.accounting.service.AccountingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AccountingApplication {


    public static void main(String[] args) throws ParseException {
        AccountingService service = new AccountingService();
        Accounting accounting = new Accounting();

        Car car = new Car();
        car.setBrand("Volvo");
        car.setModel("XC90");
        car.setGeneration("II");
        Owner owner = new Owner();
        owner.setFirstName("Ivan");
        owner.setSecondName("Ivanovich");
        owner.setLastName("Ivanov");
        owner.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1975-09-09"));
        accounting.setId(1);
        accounting.setCar(car);
        accounting.setOwner(owner);
        accounting.setPts(2);
        service.saveAccounting(accounting);
        Accounting a = service.findAccountingById(1);

        System.out.println(service.findAccountingById(1));
        accounting.setRegNumber("32");
        service.updateAccounting(accounting);
        System.out.println(service.findAllAccountings());
    }
}
