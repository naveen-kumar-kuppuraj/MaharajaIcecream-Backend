package com.SpringBoot.Maharaja.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.SpringBoot.Maharaja.ConsumerRepository.ConsumerRepository;
import com.SpringBoot.Maharaja.Entity.Consumer;

@RequestMapping("/ConsumerController")
@RestController
@CrossOrigin("*")

public class ConsumerController {
	@Autowired
	
	private ConsumerRepository cr;
	
	@PostMapping("/Insert")
	ResponseEntity<Consumer>predefinedcreate(@RequestBody Consumer c)
	{
		Consumer ab=new Consumer();
		ab.setId(c.getId());
		ab.setName(c.getName());
		ab.setMobile(c.getMobile());
		ab.setEmail(c.getEmail());
		ab.setProducts(c.getProducts());
		cr.save(ab);
		
		return new ResponseEntity<Consumer>(ab,HttpStatus.OK);
	}
	
	@GetMapping("/Read/{sno}")
	public ResponseEntity<Consumer> predefinedselect(@PathVariable("sno") int id) {
	    Optional<Consumer> consumer = cr.findById(id);  

	    if (consumer.isPresent()) {
	        return new ResponseEntity<>(consumer.get(), HttpStatus.OK);  
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
	    }
	}

	
	@PutMapping("/Update")
	ResponseEntity<Consumer>predefinedupdate(@RequestBody Consumer c)
	{
		Consumer ad=new Consumer();
		ad.setId(c.getId());
		ad.setName(c.getName());
		ad.setMobile(c.getMobile());
		ad.setEmail(c.getEmail());
		ad.setProducts(c.getProducts());
		cr.save(ad);
		return new ResponseEntity<Consumer>(ad,HttpStatus.OK);
	}
	@DeleteMapping("/Delete")
	 ResponseEntity<Consumer> preDefinedDelete(@RequestBody Consumer c)
	{
		int ac= cr.deleteById(c.getId());
		System.out.println(ac);
		
		
	
	   return new ResponseEntity<Consumer>(HttpStatus.OK);
	}


}
