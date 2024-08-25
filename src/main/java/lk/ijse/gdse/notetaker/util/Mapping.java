package lk.ijse.gdse.notetaker.util;

import lk.ijse.gdse.notetaker.dto.NoteDto;
import lk.ijse.gdse.notetaker.entity.NoteEntity;
import org.modelmapper.ModelMapper;

import java.util.List;

public class Mapping {
    private ModelMapper modelMapper;

    //matters of NoteEntity and Dto
    public NoteDto convertToDto(NoteEntity noteEntity){
        return modelMapper.map(noteEntity, NoteDto.class);
    }

    public NoteEntity convertToEntity(NoteDto noteDto){
        return modelMapper.map(noteDto, NoteEntity.class);
    }

    public List<NoteDto> convertToDto(List<NoteEntity> noteEntities){
        return modelMapper.map(noteEntities, List.class);
    }
}
