package com.example.quanlychuyenbay.service.mapper;

import com.example.quanlychuyenbay.entity.MayBay;
import com.example.quanlychuyenbay.entity.NhanVien;
import com.example.quanlychuyenbay.service.Dto.MayBayDto;
import com.example.quanlychuyenbay.service.Dto.NhanVienDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MayBayMapper {
        MayBayMapper INSTANCE = Mappers.getMapper(MayBayMapper.class);
        MayBayDto toDto(MayBay may);
        List<MayBayDto> toDtos(List<MayBay> mayBays);

}
