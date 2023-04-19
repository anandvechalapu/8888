package com.testing123.controller;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testing123.model.ExecutiveMemos;
import com.testing123.service.ExecutiveMemosService;

@RestController
public class ExecutiveMemosController {
	
	@Autowired
	private ExecutiveMemosService executiveMemosService;

	@GetMapping("/memo/{memo}")
	public ExecutiveMemos findByMemo(@PathVariable String memo) {
		return executiveMemosService.findByMemo(memo);
	}

	@GetMapping("/memo/delete")
	public void deleteByMemo(@RequestParam(name="memo") String memo) {
		executiveMemosService.deleteByMemo(memo);
	}

	@GetMapping("/datecreated/{dateCreated}")
	public List<ExecutiveMemos> findByDateCreated(@PathVariable LocalDateTime dateCreated) {
		return executiveMemosService.findByDateCreated(dateCreated);
	}

	@GetMapping("/dayofweek/{dayOfWeek}")
	public List<ExecutiveMemos> findByDayOfWeek(@PathVariable DayOfWeek dayOfWeek) {
		return executiveMemosService.findByDayOfWeek(dayOfWeek);
	}

	@GetMapping("/memo/datecreated")
	public List<ExecutiveMemos> findByMemoAndDateCreated(@RequestParam(name="memo") String memo, 
														@RequestParam(name="dateCreated") LocalDateTime dateCreated) {
		return executiveMemosService.findByMemoAndDateCreated(memo, dateCreated);
	}

	@GetMapping("/excelformat/download")
	public List<ExecutiveMemos> downloadDataInExcelFormat() {
		return executiveMemosService.downloadDataInExcelFormat();
	}

	@GetMapping("/search/reset")
	public void resetToLastSearch() {
		executiveMemosService.resetToLastSearch();
	}

	@GetMapping("wholesaler/addoredit")
	public void addOrEditWholesaler() {
		executiveMemosService.addOrEditWholesaler();
	}

	@GetMapping("/user/access")
	public boolean checkUserAccess() {
		return executiveMemosService.checkUserAccess();
	}

	@GetMapping("/login")
	public void redirectToLoginPage() {
		executiveMemosService.redirectToLoginPage();
	}

}