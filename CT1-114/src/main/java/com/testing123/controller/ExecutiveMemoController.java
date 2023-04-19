package com.testing123.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing123.model.ExecutiveMemo;
import com.testing123.service.ExecutiveMemoService;

@RestController
@RequestMapping("/executiveMemos")
public class ExecutiveMemoController {
    
    @Autowired
    private ExecutiveMemoService executiveMemoService;

    @PostMapping("/save")
    public ExecutiveMemo save(@RequestBody ExecutiveMemo executiveMemo) {
        return executiveMemoService.save(executiveMemo);
    }

    @GetMapping("/findByMemo/{memo}")
    public ExecutiveMemo findByMemo(@PathVariable String memo) {
        return executiveMemoService.findByMemo(memo);
    }

    @GetMapping("/findByDateCreated/{dateCreated}")
    public ExecutiveMemo findByDateCreated(@PathVariable Date dateCreated) {
        return executiveMemoService.findByDateCreated(dateCreated);
    }

    @GetMapping("/findByDow/{dow}")
    public ExecutiveMemo findByDow(@PathVariable int dow) {
        return executiveMemoService.findByDow(dow);
    }

    @GetMapping("/findAll")
    public List<ExecutiveMemo> findAll() {
        return executiveMemoService.findAll();
    }

    @DeleteMapping("/deleteByMemo/{memo}")
    public void deleteByMemo(@PathVariable String memo) {
        executiveMemoService.deleteByMemo(memo);
    }

    @DeleteMapping("/deleteByDateCreated/{dateCreated}")
    public void deleteByDateCreated(@PathVariable Date dateCreated) {
        executiveMemoService.deleteByDateCreated(dateCreated);
    }

    @DeleteMapping("/deleteByDow/{dow}")
    public void deleteByDow(@PathVariable int dow) {
        executiveMemoService.deleteByDow(dow);
    }

}