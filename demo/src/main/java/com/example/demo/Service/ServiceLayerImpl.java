package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Entity.Phone;
import com.example.demo.Repository.RepositoryLayer;

@Service
public class ServiceLayerImpl implements ServiceLayetInter {
   @Autowired
  private RepositoryLayer slayer;
	

	public RepositoryLayer getSlayer() {
	return slayer;
}


public void setSlayer(RepositoryLayer slayer) {
	this.slayer = slayer;
}


	public List<Phone> GettingAllTheData() {
		
		List<Phone> mm=slayer.findAll();
		return mm;
	}


	public Phone SavingPhoneData(Phone ph) {
		 Phone jj=slayer.save(ph);
		 return jj;
	}

public Phone GettingSingleValue(int i)
{
         Phone jj=slayer.findById(i).get();
         return jj;
}
public void DeletingSingelValue(int j)
{
    Phone uu=slayer.findById(j).get();
    slayer.delete(uu);
    System.out.print("deleted");
	
}
public Phone updateSingleValue(Phone ph)
{
	   return slayer.save(ph);
}

}
