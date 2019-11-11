package com.rrao.chequetracker;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ChequeTrackerService {

  private List<Cheque> chequeList = new ArrayList();

  public void addCheque(Cheque c) {
    chequeList.add(c);
  }

  public List<Cheque> getChequeList() {
    return this.chequeList;
  }

  public Boolean updateChequeDetails(String chequeNumber, Cheque cheque) {
    int i = getChequeIndex(chequeNumber);
    if (i < 0) {
      return false;
    }
    chequeList.set(i, cheque);

return true;
  }

  private int getChequeIndex(String chequeNumber) {
    int i = 0;
    while (i < chequeList.size()) {
      if (chequeList.get(i).getChequeNumber().equals(chequeNumber)) {
        return i;
      }
    }
    return -1;
  }
}
