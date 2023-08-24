package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Entity.Phone;
import com.example.demo.Service.ServiceLayerImpl;

import jakarta.websocket.server.PathParam;

@Controller
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
       public ModelAndView GetAllDetails(@ModelAttribute("ph") Phone ph)
       {
    	  Phone pho=smlayer.GettingSingleValue(ph.getid());
    	  ModelAndView mv=new ModelAndView();
    System.out.print(ph.getid());

    if(pho.getid().equals(ph.getid()) && pho.getPhonenumber().equals(ph.getPhonenumber()))
    			  {
       	             Phone jj=smlayer.Find(ph.getid());
    	        	  mv.addObject("details",jj);
    	        	  mv.setViewName("Values");
    			  }  
    
    			  else 
    			  {
    				  mv.setViewName("Invalid");
    				 
    			  }
    	    
    	 
    	  return mv;
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
       @GetMapping("/done")
       public ModelAndView getting()
       {
    	   ModelAndView mv=new ModelAndView();
     	
     	  mv.setViewName("Tables");
     	  return mv;
       }
       @PutMapping("/put/{id}")
       public Phone updatingSingleValue(@RequestBody Phone ph,@PathVariable("id") int j)
       {  
    	   
    	   Phone yy=smlayer.GettingSingleValue(j);
    	    yy.setPhonecompanyname(ph.getPhonecompanyname());
    	    yy.setPhonecompanyname(ph.getPhonecompanyname());
    	    yy.setPhonecost(ph.getPhonecost());

    	   return smlayer.updateSingleValue(yy);
       }

}
