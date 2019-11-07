package com.rrao.chequetracker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChequeTrackerController {

 static List<Cheque> chequeList = new ArrayList();
  @PostMapping("/account/{accountId}/Cheque")
  public String addNewCheque(@RequestBody Cheque cheque, @PathVariable String accountId){
    chequeList.add(cheque);
    return "cheque created";
  }

  @GetMapping("/account/{accountId}/Cheque/{chequeNumber}")
  public List<Cheque> getChequeDetails(@PathVariable String chequeNumber, @PathVariable String accountId ){

  //return chequeList.stream().filter(x -> x.getChequeNumber().equals(chequeNumber)).collect(Collectors.toList());
  return chequeList.stream().collect(Collectors.toList());
  }
  }



