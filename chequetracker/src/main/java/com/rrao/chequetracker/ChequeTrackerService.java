package com.rrao.chequetracker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class ChequeTrackerService {

  private List<Cheque> chequeList = new ArrayList();

 public void addCheque(Cheque c){
   chequeList.add(c);
 }

  public List<Cheque> getChequeList() {
    return this.chequeList;
  }

}
