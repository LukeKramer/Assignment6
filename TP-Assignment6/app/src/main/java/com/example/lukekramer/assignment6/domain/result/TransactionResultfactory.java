package com.example.lukekramer.assignment6.domain.result;

import com.example.lukekramer.assignment6.entity.Result;
import com.example.lukekramer.assignment6.service.CreateResult;

import java.util.Date;

/**
 * Created by lukekramer on 16/04/16.
 */
public class TransactionResultfactory implements CreateResult {

    @Override
    public Result getResult(long id,long clientid, String status) {

        Result result = new Result.Builder()
                .ID(id).Status(status).ClientID(clientid)
                .Date(new Date())
                .Build();
        return result;
    }
}
