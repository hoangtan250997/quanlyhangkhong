package com.example.quanlychuyenbay.service;

import com.example.quanlychuyenbay.entity.ChungNhan;
import com.example.quanlychuyenbay.entity.NhanVien;
import com.example.quanlychuyenbay.exception.DemoException;
import com.example.quanlychuyenbay.repository.ChungNhanRepository;
import com.example.quanlychuyenbay.service.Dto.ChungNhanDto;
import com.example.quanlychuyenbay.service.Dto.NhanVienDto;
import com.example.quanlychuyenbay.service.mapper.ChungNhanMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ChungNhanService {
    private final ChungNhanRepository chungNhanRepository;
    private final ChungNhanMapper chungNhanMapper;

    public List<ChungNhanDto> findAll() {
        return chungNhanMapper.toDtos(chungNhanRepository.findAll());
    }


    public ChungNhanDto findById(Long id) {
        return chungNhanMapper.toDTo(chungNhanRepository.findById(id).orElseThrow(DemoException::ChungNhanNotFound));
    }

    public List<ChungNhanDto> findByTenNV(String ten) {
        boolean check=true;
        for (char c: ten.toCharArray()){
            if (!Character.isLetter(c)){
                check=false;
            }
        }

        if (!check) throw DemoException.badRequest("WrongFormat","ten is wrong format!");
        return chungNhanRepository.findByTenNV(ten);
    }



}
