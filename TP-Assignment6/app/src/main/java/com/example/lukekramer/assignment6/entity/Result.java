package com.example.lukekramer.assignment6.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by lukekramer on 16/04/16.
 */
public class Result implements Serializable {

    private long id;
    private String status;
    private Date date;

    private Result(){}

    public long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public Date getDate() {
        return date;
    }

    public Result(Builder Builder)
    {
        this.id = Builder.id;
        this.status = Builder.status;
        this.date = Builder.date;
    }

    public static class Builder{

        private long id;
        private String status;
        private Date date;

        public Builder ID(long value)
        {
            this.id = value;
            return this;
        }

        public Builder Status(String value)
        {
            this.status = value;
            return this;
        }

        public Builder Date(Date value)
        {
            this.date = value;
            return this;
        }

        public Result Build(){return new Result(this);}


    }
}
