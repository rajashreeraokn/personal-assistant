package com.rrao.chequetracker;


import java.time.LocalDate;
import javax.persistence.Entity;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

@NoArgsConstructor
public class Cheque {

  private String chequeNumber;
  private String bankName;
  private String recipient;
  private String purpose;
  private LocalDate date;


  public Cheque(String chequeNumber, String bankName, String recipient, String purpose,
      LocalDate date) {
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
}
