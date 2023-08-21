package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Phone;
import com.example.demo.Service.ServiceLayerImpl;

import jakarta.websocket.server.PathParam;

@RestController
public class ControllerLayer {
	@Autowired
	private ServiceLayerImpl smlayer;
	
	public ServiceLayerImpl getSmlayer() {
		return smlayer;
	}

	public void setSmlayer(ServiceLayerImpl smlayer) {
		this.smlayer = smlayer;
	}
       @PostMapping("/post")
	public Phone PhoneDeatils(@RequestBody Phone ph)
	{
		return smlayer.SavingPhoneData(ph);
	}
       @GetMapping("/get")
       public List<Phone> GetAllDetails()
       {
    	  return smlayer.GettingAllTheData(); 
       }
       @GetMapping("/fet/{id}")
       public Phone GetSingleValue(@PathVariable("id") int i)
       {
    	   return smlayer.GettingSingleValue(i);
       }
       @DeleteMapping("/del/{id}")
       public void DeletingSingleValue(@PathVariable("id") int i)
       {
    	   smlayer.DeletingSingelValue(i);
       }
       @PutMapping("/put/{id}")
       public Phone updatingSingleValue(@RequestBody Phone ph,@PathVariable("id") int j)
       {  
    	   
    	   Phone yy=smlayer.GettingSingleValue(j);
    	    yy.setPhoneCompanyName(ph.getPhoneCompanyName());
    	    yy.setPhoneCost(ph.getPhoneCost());
    	    yy.setPhoneNumber(ph.getPhoneNumber());

    	   return smlayer.updateSingleValue(yy);
       }

}
