package com.example.quanlychuyenbay.service;

import com.example.quanlychuyenbay.entity.NhanVien;
import com.example.quanlychuyenbay.repository.NhanVienRepository;
import com.example.quanlychuyenbay.service.Dto.NhanVienDto;
import com.example.quanlychuyenbay.service.mapper.NhanVienMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NhanVienService {
    private final NhanVienRepository nhanVienRepository;

    public List<NhanVienDto> getAllNhanVien(){
        return NhanVienMapper.INSTANCE.toDtos(nhanVienRepository.findAll());
    }
    public NhanVienDto findByMaNV(Long maNV){
        return nhanVienRepository.findByMaNV(maNV);
    }
    public List<NhanVienDto> findByLikeTen(String input){
        return nhanVienRepository.findByLikeTen(input);
    }
    public List<NhanVienDto> findUnderLuong(int luong){
        return NhanVienMapper.INSTANCE.toDtos(nhanVienRepository.findUnderLuong(luong));
    }
    public List<NhanVienDto> getChungNhanMax(){
        return NhanVienMapper.INSTANCE.toDtos(nhanVienRepository.getChungNhanMax());
    }
}
