package com.telusuko.springmvcboot.reposistory;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusuko.springmvcboot.models.uploadEntity;

public interface uploadEntityRepo extends JpaRepository<uploadEntity, Integer>{

	List<uploadEntity> findByUserId(int id);



	
}
