package com.example.lukekramer.assignment6.domain.loan;

import com.example.lukekramer.assignment6.entity.Loan;
import com.example.lukekramer.assignment6.service.CreateLoan;

/**
 * Created by student on 2016/03/31.
 */
public class Loanfactory implements CreateLoan {

    public Loan getLoan() {

        Loan loan = new Loan.Builder()
                .ID(1)
                .maxLoanAmount(100000)
                .minLoanAmount(1000)
                .build();
        return loan;
    }
}
