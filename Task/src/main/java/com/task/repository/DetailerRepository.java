package com.task.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.task.model.Detailer;
@Repository
public interface DetailerRepository extends JpaRepository<Detailer, Long> {
	
	@Transactional
	@Modifying
	@Query("update Detailer d set d.active= :status where d.id=:id")
	void updateDetailerStatusdById(@Param("id") long id,@Param("status") String status);

}
