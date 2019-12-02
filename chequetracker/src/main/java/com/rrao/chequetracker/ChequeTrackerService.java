package com.rrao.chequetracker;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class ChequeTrackerService {

  private Map<String, Cheque> chequeMap = new HashMap();

  public void addCheque(Cheque c) {
    this.chequeMap.put(c.getChequeNumber(), c);
  }

  public List<Cheque> getChequeList() {
    return this.chequeMap.values().stream().collect(Collectors.toList());
  }

  public void updateChequeDetails(String chequeNumber, Cheque cheque) {
    this.chequeMap.get(chequeNumber).setAmount(cheque.getAmount());
    this.chequeMap.get(chequeNumber).setBankName(cheque.getBankName());
    this.chequeMap.get(chequeNumber).setRecipient(cheque.getRecipient());
    this.chequeMap.get(chequeNumber).setDate(cheque.getDate());
    this.chequeMap.get(chequeNumber).setPurpose(cheque.getPurpose());
  }

  public List<Cheque> getChequeIssuedForSelectedMonth(int month) {
    return this.chequeMap.values().stream().filter(x -> x.getDate().getMonthValue() == month)
        .collect(Collectors.toList());
  }

  public Cheque getChequeMap(String chequeNumber) {
    return this.chequeMap.get(chequeNumber);
  }

  public BigDecimal getMinimumBalance(LocalDate date) {
    List<BigDecimal> amountList = new ArrayList<>();
    this.chequeMap.values().stream().filter(x -> x.getDate().equals(date))
        .forEach(x -> amountList.add(x.getAmount()));
    return amountList.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
  }

  public void deleteChequeDetails(String chequeNumber) {
    this.chequeMap.remove(chequeNumber);
  }

  public void updateChequeStatus(String chequeNumber, ChequeStatus chequeStatus) {
    this.chequeMap.get(chequeNumber).setChequeStatus(chequeStatus);
  }
}
