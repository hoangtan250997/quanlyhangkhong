package com.example.quanlychuyenbay.service.mapper;

import com.example.quanlychuyenbay.entity.NhanVien;
import com.example.quanlychuyenbay.service.Dto.NhanVienDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface NhanVienMapper {
        NhanVienMapper INSTANCE = Mappers.getMapper(NhanVienMapper.class);
        NhanVienDto toDto(NhanVien nhanVien);
        List<NhanVienDto> toDtos(List<NhanVien> nhanViens);

}
