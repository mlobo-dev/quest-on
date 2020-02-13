package com.wolf.queston.mapper;

import com.wolf.queston.domain.Resposta;
import com.wolf.queston.domain.dto.RespostaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RespostaMapper extends BaseMapper<Resposta, RespostaDTO> {

}
