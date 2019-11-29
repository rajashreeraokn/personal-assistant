package com.rrao.chequetracker;

import java.time.LocalDate;

public class ChequeStatus {
  private LocalDate date;
  private String Status;
  private String reason;

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public String getStatus() {
    return Status;
  }

  public void setStatus(String status) {
    Status = status;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }
}
