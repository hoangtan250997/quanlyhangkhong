package com.example.quanlychuyenbay.service;

import com.example.quanlychuyenbay.entity.ChungNhan;
import com.example.quanlychuyenbay.entity.NhanVien;
import com.example.quanlychuyenbay.repository.ChungNhanRepository;
import com.example.quanlychuyenbay.service.Dto.ChungNhanDto;
import com.example.quanlychuyenbay.service.Dto.NhanVienDto;
import com.example.quanlychuyenbay.service.mapper.ChungNhanMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChungNhanService {
    private final ChungNhanRepository chungNhanRepository;
    private final ChungNhanMapper chungNhanMapper;
    public List<ChungNhanDto> findAll(){

        return chungNhanMapper.toDtos(chungNhanRepository.findAll());
    };
    public ChungNhan findById(Long id){

        return chungNhanRepository.findById(id).get();
    }

    public List<ChungNhanDto> findByTenNV(String ten){
        return chungNhanRepository.findByTenNV(ten);
    }

    public List<NhanVienDto> showNhanVienbyMaMB(Long maMB){
        return chungNhanRepository.showNhanVienbyMaMB(maMB);
    }

}
