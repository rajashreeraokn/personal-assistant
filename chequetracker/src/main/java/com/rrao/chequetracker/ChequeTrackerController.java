package com.rrao.chequetracker;

import java.util.List;
import java.util.Map;
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
  private ChequeTrackerService chequeTrackerService;

  @PostMapping("/account/{accountId}/Cheque")
  public String addNewCheque(@RequestBody Cheque cheque, @PathVariable String accountId) {
    chequeTrackerService.addCheque(cheque);
    return "cheque created";
  }

  @GetMapping("/account/{accountId}/Cheque")
  public Map<String, Cheque> getChequeDetails(@PathVariable String accountId) {
    return chequeTrackerService.getChequeMap();
  }

  @GetMapping("/account/{accountId}/Cheque/{chequeNumber}")
  public Cheque getChequeDetails(@PathVariable String chequeNumber,
      @PathVariable String accountId) {
    return chequeTrackerService.getChequeMap().get(chequeNumber);
  }

  @PostMapping("/account/{accountId}/Cheque/{chequeNumber}")
  public void updateChequeDetails(@PathVariable String chequeNumber, @PathVariable String accountId,
      @RequestBody Cheque cheque) {
    chequeTrackerService.updateChequeDetails(chequeNumber, cheque);
  }


}



