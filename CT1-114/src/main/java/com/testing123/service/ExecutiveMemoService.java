package com.testing123.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testing123.model.ExecutiveMemo;
import com.testing123.repository.ExecutiveMemoRepository;

@Service
public class ExecutiveMemoService {
    
    @Autowired
    private ExecutiveMemoRepository executiveMemoRepository;

    public ExecutiveMemo save(ExecutiveMemo executiveMemo) {
        return executiveMemoRepository.save(executiveMemo);
    }

    public ExecutiveMemo findByMemo(String memo) {
        return executiveMemoRepository.findByMemo(memo);
    }

    public ExecutiveMemo findByDateCreated(Date dateCreated) {
        return executiveMemoRepository.findByDateCreated(dateCreated);
    }

    public ExecutiveMemo findByDow(int dow) {
        return executiveMemoRepository.findByDow(dow);
    }

    public List<ExecutiveMemo> findAll() {
        return executiveMemoRepository.findAll();
    }

    public void deleteByMemo(String memo) {
        executiveMemoRepository.deleteByMemo(memo);
    }

    public void deleteByDateCreated(Date dateCreated) {
        executiveMemoRepository.deleteByDateCreated(dateCreated);
    }

    public void deleteByDow(int dow) {
        executiveMemoRepository.deleteByDow(dow);
    }

}