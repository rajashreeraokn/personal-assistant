package com.rrao.chequetracker;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChequeTrackerController {

@Autowired
 private ChequeTrackerService chequeTrackerService ;

  @PostMapping("/account/{accountId}/Cheque")
  public String addNewCheque(@RequestBody Cheque cheque, @PathVariable String accountId){
    chequeTrackerService.addCheque(cheque);
    return "cheque created";
  }

  @GetMapping("/account/{accountId}/Cheque/{chequeNumber}")
  public List<Cheque> getChequeDetails(@PathVariable String chequeNumber, @PathVariable String accountId ){

  //return chequeTrackerService.getChequeList().stream().filter(x -> x.getChequeNumber().equals(chequeNumber)).collect(Collectors.toList());
  return chequeTrackerService.getChequeList().stream().collect(Collectors.toList());
  }




  }



