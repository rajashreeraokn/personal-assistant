package com.rrao.chequetracker;

import java.math.BigDecimal;

public class Account {

  private BigDecimal accountNumber;
  private String accountName;

  public Account(BigDecimal accountNumber, String accountName) {
    this.setAccountNumber(accountNumber);
    this.setAccountName(accountName);
  }

  public BigDecimal getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(BigDecimal accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }
}
