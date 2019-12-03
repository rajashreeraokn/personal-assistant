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
  private List<Account> accountList = new ArrayList();

  public void addCheque(Cheque c) {
    this.chequeMap.put(c.getChequeNumber(), c);
  }

  public List<Cheque> getChequeList() {
    return this.chequeMap.values().stream().collect(Collectors.toList());
  }

  public void updateChequeDetails(String chequeNumber, Cheque cheque) {
   Cheque c = this.chequeMap.get(chequeNumber);
   c.setRecipient(cheque.getRecipient());
   c.setPurpose(cheque.getPurpose());
   c.setDate(cheque.getDate());
   c.setAmount(cheque.getAmount());
   c.setBankName(cheque.getBankName());
   this.chequeMap.put(chequeNumber,c);
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

  public void addAccount(Account account) {
    accountList.add(account);
  }

  public List<Account> getAccountList() {
    return this.accountList;
  }

}
