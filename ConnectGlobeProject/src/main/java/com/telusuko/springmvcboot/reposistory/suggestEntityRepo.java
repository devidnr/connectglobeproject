package com.telusuko.springmvcboot.reposistory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusuko.springmvcboot.models.suggestEntity;

public interface suggestEntityRepo extends JpaRepository<suggestEntity, Integer> {

	List<suggestEntity> findByrId(int id);

	void deleteByrId(int id);

}
