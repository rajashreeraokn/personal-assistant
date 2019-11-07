package com.rrao.chequetracker;


import java.time.LocalDate;

public class Cheque {

  private static String chequeNumber;
  private static String bankName;
  private static String recipient;
  private static String purpose;
  private static LocalDate date;


  public Cheque(String chequeNumber, String bankName, String recipient, String purpose,LocalDate date ) {
    setChequeNumber(chequeNumber);
    setBankName(bankName);
    setRecipient(recipient);
    setPurpose(purpose);
    setDate(date);
  }

  public static String getChequeNumber() {
    return chequeNumber;
  }

  public static void setChequeNumber(String chequeNumber) {
    Cheque.chequeNumber = chequeNumber;
  }

  public static String getBankName() {
    return bankName;
  }

  public static String getRecipient() {
    return recipient;
  }

  public static void setBankName(String bankName) {
    Cheque.bankName = bankName;
  }

  public static void setRecipient(String recipient) {
    Cheque.recipient = recipient;
  }

  public static void setPurpose(String purpose) {
    Cheque.purpose = purpose;
  }

  public static String getPurpose() {
    return purpose;
  }

  public static LocalDate getDate() {
    return date;
  }

  public static void setDate(LocalDate date) {
    Cheque.date = date;
  }
}
