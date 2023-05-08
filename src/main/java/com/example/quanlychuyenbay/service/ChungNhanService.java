package com.example.quanlychuyenbay.service;

import com.example.quanlychuyenbay.entity.ChungNhan;
import com.example.quanlychuyenbay.entity.NhanVien;
import com.example.quanlychuyenbay.repository.ChungNhanRepository;
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

    public List<ChungNhan> findByTenNV(String ten){
        return chungNhanRepository.findByTenNV(ten);
    }

    public List<NhanVien> showNhanVienbyMaMB(Long maMB){
        return chungNhanRepository.showNhanVienbyMaMB(maMB);
    }

  public List<NhanVien> maxChungChi(){
        return chungNhanRepository.maxChungChi();
    }
}
