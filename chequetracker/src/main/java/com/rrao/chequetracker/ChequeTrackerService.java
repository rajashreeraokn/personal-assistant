package com.rrao.chequetracker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class ChequeTrackerService {

  private Map<String, Cheque> chequeMap = new HashMap();

  public void addCheque(Cheque c) {
    chequeMap.put(c.getChequeNumber(), c);
  }

  public Map<String, Cheque> getChequeMap() {
    return this.chequeMap;
  }

  public void updateChequeDetails(String chequeNumber, Cheque cheque) {
    chequeMap.put(chequeNumber, cheque);

  }

}
