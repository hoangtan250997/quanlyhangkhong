package com.example.quanlychuyenbay.rest;

import com.example.quanlychuyenbay.entity.MayBay;
import com.example.quanlychuyenbay.entity.NhanVien;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.PathParam;
import java.util.List;

@RequestMapping(value = "/api/maybay")

public interface MayBayAPI {
    @GetMapping
    ResponseEntity<List<MayBay>> findAll();

    @GetMapping(value = "/loai")
    ResponseEntity<MayBay> findByLoai(@PathParam("loai") String loai);
    @GetMapping(value = "/tambay")
    ResponseEntity<List<MayBay>> underTamBay(@PathParam("tamBay") int tamBay);

    @GetMapping(value = "/likeloai")
    ResponseEntity<List<MayBay>> likeLoai(@PathParam("loai") String loai);
}
