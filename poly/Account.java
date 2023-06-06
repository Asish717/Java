package com.bridgelabz.poly;

public class Account {
    private Integer accNo;
    String name;
    private String accType;

    public Account(Integer accNo, String name, String accType) {
        this.accNo = accNo;
        this.name = name;
        this.accType = accType;
    }

    public Integer getAccNo() {
        return accNo;
    }

    public String getname() {
        return name;
    }

    public String getAccType() {
        return accType;
    }

}
