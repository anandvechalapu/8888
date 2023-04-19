package com.testing123.service;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testing123.model.ExecutiveMemos;
import com.testing123.repository.ExecutiveMemosRepository;

@Service
public class ExecutiveMemosService {
	
	@Autowired
	private ExecutiveMemosRepository executiveMemosRepository;

	public ExecutiveMemos findByMemo(String memo) {
		return executiveMemosRepository.findByMemo(memo);
	}

	public void deleteByMemo(String memo) {
		executiveMemosRepository.deleteByMemo(memo);
	}

	public List<ExecutiveMemos> findByDateCreated(LocalDateTime dateCreated) {
		return executiveMemosRepository.findByDateCreated(dateCreated);
	}

	public List<ExecutiveMemos> findByDayOfWeek(DayOfWeek dayOfWeek) {
		return executiveMemosRepository.findByDayOfWeek(dayOfWeek);
	}

	public List<ExecutiveMemos> findByMemoAndDateCreated(String memo, LocalDateTime dateCreated) {
		return executiveMemosRepository.findByMemoAndDateCreated(memo, dateCreated);
	}

	public List<ExecutiveMemos> downloadDataInExcelFormat() {
		return executiveMemosRepository.downloadDataInExcelFormat();
	}

	public void resetToLastSearch() {
		executiveMemosRepository.resetToLastSearch();
	}

	public void addOrEditWholesaler() {
		executiveMemosRepository.addOrEditWholesaler();
	}

	public boolean checkUserAccess() {
		return executiveMemosRepository.checkUserAccess();
	}

	public void redirectToLoginPage() {
		executiveMemosRepository.redirectToLoginPage();
	}

}