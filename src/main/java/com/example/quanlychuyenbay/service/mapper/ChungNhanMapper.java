package com.example.quanlychuyenbay.service.mapper;

import com.example.quanlychuyenbay.entity.ChungNhan;
import com.example.quanlychuyenbay.service.Dto.ChungNhanDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ChungNhanMapper {
    @Mapping(target = "maNV", source = "nhanVien.maNV")
    @Mapping(target = "maMB", source = "mayBay.maMB")
    @Mapping(target = "id", source = "chungNhan.id")
    ChungNhanDto toDTo(ChungNhan chungNhan);

    List<ChungNhanDto> toDtos(List<ChungNhan> chungNhans);
}
