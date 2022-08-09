package com.crudsinaukoding21.model.mapper;

import com.crudsinaukoding21.model.Barang;
import com.crudsinaukoding21.model.dto.BarangDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author : Noverry Ambo
 * @since : 09/08/2022, Tue
 **/
@Mapper
public interface BarangMapper {

        BarangMapper INSTANCE = Mappers.getMapper(BarangMapper.class);

        Barang toEntity(BarangDto dto);

        BarangDto toDto(Barang data);

        List<BarangDto> toListDTO(List<Barang> list);

        List<Barang> toListEntity(List<BarangDto> data);
}
