package com.SpringBoot.Maharaja.ConsumerRepository;

import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.SpringBoot.Maharaja.Entity.Consumer;



@SpringBootTest
public class ConsumerRepositoryTest {
	@Autowired
	
	private ConsumerRepository cr;
	
	@Test
	void predefinedInsert()
	{
		
		Consumer ab=new Consumer();
		ab.setId(2);
		ab.setName("naveen");
		ab.setMobile("985467333");
		ab.setEmail("nave@gmail.com");
		ab.setProducts("vennila");
		cr.save(ab);
	}

	@Test
	void predefinedread()
	{
		Optional<Consumer>ac=cr.findById(1);
		System.out.println(ac);
	}
	
	@Test
	void predefinedupdate()
	{
		Consumer ad=new Consumer();
		ad.setId(1);
		ad.setName("kumar");
		ad.setMobile("9850023");
		ad.setEmail("kene@gmail.com");
		ad.setProducts("milk");
		cr.save(ad);
	}
	@Test
	void predefineddelete()
	{
		cr.deleteById(2);
	
	}

}
