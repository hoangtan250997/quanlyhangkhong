package com.example.quanlychuyenbay.rest;

import com.example.quanlychuyenbay.entity.ChuyenBay;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping(value = "/api/chuyenbay")

public interface ChuyenBayAPI {
    @GetMapping
    ResponseEntity<List<ChuyenBay>> findAll();

    @GetMapping(value = "/ga")
    ResponseEntity<List<ChuyenBay>> findByGaDiAndGaDen(@Param("gaDi") String gaDi, @Param("gaDen") String gaDen);

    @GetMapping(value = "/chiPhi")
    ResponseEntity<List<ChuyenBay>> ChiPhiBetween(@Param("chiPhiMin") int chiPhiMin,@Param("chiPhiMax") int chiPhiMax);

    @GetMapping(value = "/chiPhiMin")
    ResponseEntity<List<ChuyenBay>> chiphiMin();
}
