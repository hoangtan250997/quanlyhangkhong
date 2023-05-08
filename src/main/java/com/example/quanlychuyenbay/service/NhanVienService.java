package com.example.quanlychuyenbay.service;

import com.example.quanlychuyenbay.entity.NhanVien;
import com.example.quanlychuyenbay.repository.NhanVienRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NhanVienService {
    private final NhanVienRepository nhanVienRepository;
    public List<NhanVien> findAll(){
        return nhanVienRepository.findAll();
    }
    public NhanVien findByMaNV(Long maNV){
        return nhanVienRepository.findByMaNV(maNV);
    }
    public List<NhanVien> findByLikeTen(String input){
        return nhanVienRepository.findByLikeTen(input);
    }
    public List<NhanVien> underLuong(int luong){
        return nhanVienRepository.underLuong(luong);
    }
    public List<NhanVien> maxChungChi(){
        return nhanVienRepository.maxChungChi();
    }
}
