package com.example.quanlychuyenbay.service;

import com.example.quanlychuyenbay.entity.MayBay;
import com.example.quanlychuyenbay.repository.MayBayRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MayBayService {
    private final MayBayRepository mayBayRepository;
    public List<MayBay> findAll(){
        return mayBayRepository.findAll();
    };
    public MayBay findByLoai(String loai){
        return mayBayRepository.findByLoai(loai);
    }

    public List<MayBay> underTamBay(int tamBay){
        return mayBayRepository.underTamBay(tamBay);
    }
}
