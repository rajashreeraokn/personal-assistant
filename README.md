# personal-assistant
This assistant helps you to keep track of your cheque book transactions.
You can send account name and month to get all the deatils of cheques issued in that month.
You can add an entry whenever a new cheque is issued across that account.
You can send a date and account name and get minimum account balance to be maintained so that all cheques will be processed successfully.

Personal assistant keeps track of the user's checque book transactions. 
Main features:
* User can add a new cheque to be tracked by the application
* User can search for the cheques already added
* Based on the issued cheques user can find out what should be the minimum balance in the account on a given date


User stories:
* As a user I want to add the cheques that I issue in the system so that I can track them
* As a user I want to search for the already issued cheques so that I can review them
* As a user I want to edit the cheques to correct the cheque number or the date
* As a user I want to delete the cheques
* As a user I want to mark a cheque as cancelled
* As a user I want to get the minimum balance to be maintained for a date

API Resources and Actions:
* POST: /accountname              -> to add cheques issued details of cheque 
* GET : /accountname/month        -> to search details of check issued in that month 
* POST: /accountname/chequeid     -> to edit cheques and correct cheque number or date or mark it as cancelled 
* DELETE: /accountname/chequeid   -> to delete cheques
* GET: /accountname/date          -> to get minimum balance to be maintained for a date 


## Cheque 
   /account/{accountId}/Cheque
   ```
   {
    chequeNumber:"Unique id of the cheque"
    bank:"name of bank",
    to:"Recipient",
    date: cheque date,
    purpose: "reason to give the cheque"
    status: Active/Cancelled
   }
   ```
   ##### POST account/{accountId}/Cheque
   ##### GET account/{accountId}/Cheque/{chequeNumber}
   ##### GET account/{accountId}/Cheque?month=11
   ##### DELETE account/{accountId}/Cheque/{chequeNumber}
 
## ChequeStatus
   /account/{accountId}/Cheque/chequeNumber/ChequeStatus
   ```
    {
    chequeNumber: "number of cheque",
    status: 
    }
```
   ##### POST (no deletes, no PUTS), Immutable
   ##### GET 
## Account
```
   {
      accountId:
      accountName:
   }
```
