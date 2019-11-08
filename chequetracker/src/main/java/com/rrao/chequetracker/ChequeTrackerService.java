package com.rrao.chequetracker;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ChequeTrackerService {

 private static List<Cheque> chequeList = new ArrayList();

 public void addCheque(Cheque c){
   chequeList.add(c);
 }

  public static List<Cheque> getChequeList() {
    return chequeList;
  }
}
