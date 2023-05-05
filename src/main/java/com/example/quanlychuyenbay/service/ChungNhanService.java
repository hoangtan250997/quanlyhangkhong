package com.example.quanlychuyenbay.service;

import com.example.quanlychuyenbay.entity.ChungNhan;
import com.example.quanlychuyenbay.entity.MayBay;
import com.example.quanlychuyenbay.repository.ChungNhanRepository;
import com.example.quanlychuyenbay.repository.MayBayRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChungNhanService {
    private final ChungNhanRepository chungNhanRepository;
    public List<ChungNhan> findAll(){
        return chungNhanRepository.findAll();
    };
    public ChungNhan findById(Long id){
        return chungNhanRepository.findById(id).get();
    }
}
