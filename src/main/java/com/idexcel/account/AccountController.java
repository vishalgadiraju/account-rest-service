package com.idexcel.account;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.idexcel.account.Accounts;
import com.idexcel.account.AccountsRepository;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	@Autowired
	private AccountsRepository accountsrepository;

	//Retrieve All Accounts
    @RequestMapping(method=RequestMethod.GET)
    public List<Accounts> getAccounts(){
		return accountsrepository.findAll();
	}
  
	//Retrieve Account by Id
	 @RequestMapping(value="/{id}", method=RequestMethod.GET)
	 public Optional<Accounts> getAccountById (@PathVariable("id")String id, Accounts account){
	 return accountsrepository.findById(id);
	  }
	
	//Create Account
    @RequestMapping(method=RequestMethod.POST)
    public Accounts addAccount(Accounts account){
    return accountsrepository.save(account);
    }

    //Delete Account by Id
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteAccountbyId(@PathVariable("id") String id, Accounts account) {
		accountsrepository.deleteById(id);
	}
	
	
	//Update Account
	 @RequestMapping(value="/{id}",method=RequestMethod.PUT)
      public Accounts updateAccountById(@PathVariable("id")String id, @RequestParam String name, @RequestParam String email, Accounts account){
	  account.setName(name);
	  account.setEmail(email);
	  return accountsrepository.save(account);
	  }
	 
	//Partially Update Account
	@RequestMapping(value="/{id}", method=RequestMethod.PATCH)		 
	public Accounts partialUpdateAccount(@PathVariable("id")String id, @RequestParam String email, Accounts account) {
	account.setEmail(email);
    return accountsrepository.save(account);
		 }
		
	}
     
	//Head operation
		//@RequestMapping(path="/accounts/{accoountId}", method=RequestMethod.HEAD)
		//public Optional <Accounts> getHeader(@PathVariable("id")String id) {
		//	return accountsrepository.findById(id);
		//}


