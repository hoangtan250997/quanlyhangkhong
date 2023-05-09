package com.example.quanlychuyenbay.rest;

import com.example.quanlychuyenbay.entity.NhanVien;
import com.example.quanlychuyenbay.service.Dto.NhanVienDto;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(value = "/api/nhanvien")

public interface NhanVienAPI {
    @GetMapping
    ResponseEntity<List<NhanVienDto>> getAll();

    @GetMapping(value = "/{maNV}")
    ResponseEntity<NhanVienDto> findByMaNV(@PathVariable("maNV") Long maNV);

    @GetMapping(value = "/ten")
    ResponseEntity<List<NhanVienDto>> findByLikeTen(@Param("input") String input);

    @GetMapping(value = "/luong")
    ResponseEntity<List<NhanVienDto>> findUnderLuong(@Param("luong") int luong);

    @GetMapping(value = "/chungnhanmax")
    ResponseEntity<List<NhanVienDto>> getChungNhanMax();
}
