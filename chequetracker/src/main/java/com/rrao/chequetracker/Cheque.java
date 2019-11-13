package com.rrao.chequetracker;


import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Cheque {

  private String chequeNumber;
  private String bankName;
  private String recipient;
  private String purpose;
  private LocalDate date;
  private BigDecimal amount;


  public Cheque(String chequeNumber, String bankName, String recipient, String purpose,
      LocalDate date, BigDecimal amount) {
    setAmount(amount);
    setChequeNumber(chequeNumber);
    setBankName(bankName);
    setRecipient(recipient);
    setPurpose(purpose);
    setDate(date);
  }


  public String getChequeNumber() {
    return chequeNumber;
  }

  public void setChequeNumber(String chequeNumber) {
    this.chequeNumber = chequeNumber;
  }

  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }
}
