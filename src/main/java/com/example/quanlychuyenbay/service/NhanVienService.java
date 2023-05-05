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
}
