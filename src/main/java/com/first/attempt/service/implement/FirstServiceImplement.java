package com.first.attempt.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.attempt.domain.First;
import com.first.attempt.domain.FirstRepository;
import com.first.attempt.service.FirstService;



@Service
public class FirstServiceImplement implements FirstService{
	
	 @Autowired
	 FirstRepository firstRepository;

	@Override
	public List<First> findAll() {
		// TODO Auto-generated method stub
		return firstRepository.findAll();
	}

	@Override
	public First insertByUser(First first) {
		// TODO Auto-generated method stub
		return firstRepository.save(first);
	}

	@Override
	public First update(First first) {
		// TODO Auto-generated method stub
		return firstRepository.save(first);
	}

	@Override
	public First delete(Long id) {
		// TODO Auto-generated method stub
		First first = firstRepository.findById(id).get();
		firstRepository.delete(first);
		return first;
	}

	@Override
	public First findById(Long id) {
		// TODO Auto-generated method stub
		return firstRepository.findById(id).get();
	}

}
