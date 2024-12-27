package com.SpringBoot.Maharaja.ConsumerRepository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.SpringBoot.Maharaja.Entity.Consumer;
import jakarta.transaction.Transactional;

public interface ConsumerRepository  extends JpaRepository<Consumer, Integer>{
	
	@Transactional
	@Modifying
	@Query(value="insert into Consumer values(?,?,?,?,?)",nativeQuery=true)
	int insertstudent(int id, String name,String mobile,String email,String products);
	
	
	@Transactional
	@Modifying
	@Query(value="update Consumer set name=? where id=?",nativeQuery=true)
	int updatestudent(String name,int id);
	
	
	@Transactional
	@Modifying
	@Query(value="delete from Consumer where id=?",nativeQuery=true)
	int deleteById(int id);
	
	@Query(value="select * from Consumer where id=?",nativeQuery=true)
	Optional<Consumer> selectById(int id);


	

}
