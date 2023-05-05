package com.example.quanlychuyenbay.service;

import com.example.quanlychuyenbay.entity.ChuyenBay;
import com.example.quanlychuyenbay.repository.ChuyenBayRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChuyenBayService {
    private final ChuyenBayRepository chuyenBayRepository;
    public List<ChuyenBay> findByGaDiAndGaDen(String gaDi, String gaDen){
     return chuyenBayRepository.findByGaDiAndGaDen(gaDi,gaDen);
    }
    public List<ChuyenBay> findAll(){
        return chuyenBayRepository.findAll();
    }
}
