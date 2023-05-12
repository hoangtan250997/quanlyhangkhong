package com.example.quanlychuyenbay.service;

import com.example.quanlychuyenbay.entity.ChuyenBay;
import com.example.quanlychuyenbay.exception.DemoException;
import com.example.quanlychuyenbay.repository.ChuyenBayRepository;
import com.example.quanlychuyenbay.service.Dto.ChuyenBayDto;
import com.example.quanlychuyenbay.service.mapper.ChuyenBayMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChuyenBayService {
    private final ChuyenBayRepository chuyenBayRepository;
    public List<ChuyenBayDto> findByGaDiAndGaDen(String gaDi, String gaDen){

     return ChuyenBayMapper.INSTANCE.toDtos(chuyenBayRepository.findByGaDiAndGaDen(gaDi,gaDen));
    }
    public List<ChuyenBayDto> findAll(){

        return ChuyenBayMapper.INSTANCE.toDtos(chuyenBayRepository.findAll());
    }

    public List<ChuyenBayDto> ChiPhiBetween( int chiPhiMin, int chiPhiMax){
        if (chiPhiMin<0||chiPhiMax<0) throw DemoException.badRequest("WrongFormat","chi phi cannot be negative");
        return ChuyenBayMapper.INSTANCE.toDtos(chuyenBayRepository.ChiPhiBetween(chiPhiMin,chiPhiMax));
    }

    public List<ChuyenBayDto> chiPhiMin(){
        return ChuyenBayMapper.INSTANCE.toDtos(chuyenBayRepository.chiphiMin());
    }
}
