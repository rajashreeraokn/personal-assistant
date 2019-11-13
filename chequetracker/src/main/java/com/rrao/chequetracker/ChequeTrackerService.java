package com.rrao.chequetracker;

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

  public Map<String, Cheque> getChequeMap() {
    return this.chequeMap;
  }

  public void updateChequeDetails(String chequeNumber, Cheque cheque) {
    this.chequeMap.put(chequeNumber, cheque);
  }

  public List<Cheque> getChequeIssuedForSelectedMonth(int month) {
  return this.chequeMap.values().stream().filter(x -> x.getDate().getMonthValue()==month).collect(Collectors.toList());
  }
}
