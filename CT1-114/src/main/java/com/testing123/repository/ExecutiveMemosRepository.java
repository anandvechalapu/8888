package com.testing123.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testing123.model.ExecutiveMemos;

public interface ExecutiveMemosRepository extends JpaRepository<ExecutiveMemos, Long> {

	ExecutiveMemos findByMemo(String memo);		
	
	void deleteByMemo(String memo);
	
	List <ExecutiveMemos> findByDateCreated(LocalDateTime dateCreated);
	
	List <ExecutiveMemos> findByDayOfWeek(DayOfWeek dayOfWeek);
	
	List <ExecutiveMemos> findByMemoAndDateCreated(String memo, LocalDateTime dateCreated);
	
	List <ExecutiveMemos> downloadDataInExcelFormat();
	
	void resetToLastSearch();
	
	void addOrEditWholesaler();	
	
	boolean checkUserAccess();	
	
	void redirectToLoginPage();
}