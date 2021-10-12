package com.telusuko.springmvcboot.reposistory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusuko.springmvcboot.models.MyReportEntity;

public interface MyReportEntityRepo extends JpaRepository<MyReportEntity, Integer> {

	List<MyReportEntity> findByUserId(int uid);

}
