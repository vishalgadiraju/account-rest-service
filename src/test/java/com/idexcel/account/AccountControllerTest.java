package com.idexcel.account;

//import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
//import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;

public class AccountControllerTest {
	
    @MockBean
	private AccountsRepository accountsrepository;	
	
    @Test
	public void testGetAccounts() {
		 List <Accounts> list = new ArrayList<Accounts>();
		 Accounts one = new Accounts("101","Test1","test1@example.com");
		 Accounts two = new Accounts("201","Test2","test2@example.com");
		 Accounts three = new Accounts("301","Test3","test3@example.com");
	
		 list.add(one);
		 list.add(two);
		 list.add(three);
		 
		 //TODO: Mockito.when(getAccounts())
		 
	}

}
