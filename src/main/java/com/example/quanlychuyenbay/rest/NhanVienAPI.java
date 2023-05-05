package com.example.quanlychuyenbay.rest;

import com.example.quanlychuyenbay.entity.NhanVien;
import com.example.quanlychuyenbay.repository.NhanVienRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(value = "/api/nhanvien")

public interface NhanVienAPI {
    @GetMapping
    ResponseEntity<List<NhanVien>> findAll();

    @GetMapping(value = "/{maNV}")
    ResponseEntity<NhanVien> findByMaNV(@PathVariable("maNV") Long maNV);
}
