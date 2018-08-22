package com.first.attempt.service;

import java.util.List;

import com.first.attempt.domain.First;


public interface FirstService {

    List<First> findAll();

    First insertByUser(First first);

    First update(First first);

    First delete(Long id);

    First findById(Long id);
}
