package com.idexcel.account;
import com.idexcel.account.Accounts;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountsRepository extends MongoRepository<Accounts, String>{
	//public Accounts findByName(String Name);

}
