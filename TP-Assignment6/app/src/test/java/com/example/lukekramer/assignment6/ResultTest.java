package com.example.lukekramer.assignment6;

import com.example.lukekramer.assignment6.entity.Person;
import com.example.lukekramer.assignment6.domain.client.Clientfactory;
import com.example.lukekramer.assignment6.domain.result.TransactionResultfactory;
import com.example.lukekramer.assignment6.chain.ClientChainSetup;
import com.example.lukekramer.assignment6.chain.LoanChainSetup;
import com.example.lukekramer.assignment6.entity.Result;

import junit.framework.Assert;

import org.junit.Test;

import java.util.Date;

/**
 * Created by lukekramer on 16/04/16.
 */
public class ResultTest {
    @Test
    public void testDomainEvent() throws Exception {

        Clientfactory one = new Clientfactory();

        Person person = one.getPerson(1234,30000,"David","Keys","078-432984","keys@gmail.com");

        person.getIncome();

        person = new Person.Builder().copy(person).Income(70000).build();

        String type = ClientChainSetup.getClientType(person.getIncome());


        String result = LoanChainSetup.getLoanType(type,50000);


        TransactionResultfactory transaction = new TransactionResultfactory();
        Result event = transaction.getResult(person.getId(),result);

        Date date = new Date();
        System.out.println(event.getStatus());
        System.out.println(event.getDate());

        Assert.assertNotSame(date,event.getDate());

    }
}
