package com.example.quanlychuyenbay.rest;


import com.example.quanlychuyenbay.entity.NhanVien;
import com.example.quanlychuyenbay.service.Dto.ChungNhanDto;
import com.example.quanlychuyenbay.service.Dto.NhanVienDto;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.validation.constraints.NotBlank;
import java.util.List;
@RequestMapping(value = "/api/chungnhan")

public interface ChungNhanAPI {
    @GetMapping
    ResponseEntity<List<ChungNhanDto>> findAll();

    @GetMapping(value = "/{id}")
    ResponseEntity<ChungNhanDto> findById(@PathVariable("id") Long id);

    @GetMapping(value ="/find")
    ResponseEntity<List<ChungNhanDto>> findByTenNV(@RequestParam("ten") @NotBlank String ten);

    @GetMapping(value = "/maMB")
    ResponseEntity<List<NhanVienDto>> showNhanVienbyMaMB(@Param("maMB")Long maMB);


}
