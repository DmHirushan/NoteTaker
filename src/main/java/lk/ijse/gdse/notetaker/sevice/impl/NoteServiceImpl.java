package lk.ijse.gdse.notetaker.sevice.impl;

import lk.ijse.gdse.notetaker.sevice.NoteService;
import lk.ijse.gdse.notetaker.dto.NoteDto;
import lk.ijse.gdse.notetaker.util.AppUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {
    List<NoteDto> saveNoteTmp = new ArrayList<>();

    public NoteServiceImpl(){
        saveNoteTmp.add(new NoteDto(AppUtil.createNoteId(), "Principles of SE", "SE Desc", "P1", "2024/08/25"));
        saveNoteTmp.add(new NoteDto(AppUtil.createNoteId(), "Principles of SE", "SE Desc", "P1", "2024/08/25"));
        saveNoteTmp.add(new NoteDto(AppUtil.createNoteId(), "Principles of SE", "SE Desc", "P1", "2024/08/25"));
        saveNoteTmp.add(new NoteDto(AppUtil.createNoteId(), "Principles of SE", "SE Desc", "P1", "2024/08/25"));
        System.out.println(saveNoteTmp);
    }

    @Override
    public String saveData(NoteDto noteDto) {
        noteDto.setId(AppUtil.createNoteId());
        saveNoteTmp.add(noteDto);
        return "Note saved successfully!";
    }

    @Override
    public boolean update(String noteId, NoteDto noteDto) {
        return false;
    }

    @Override
    public boolean delete(String noteId) {
        return false;
    }

    @Override
    public NoteDto getSelectedData(String noteId) {
        for (NoteDto noteDto : saveNoteTmp){
            if (noteId.equals(noteDto.getId())){
                return noteDto;
            }
        }
        return null;
    }

    @Override
    public List<NoteDto> getAll() {
        return saveNoteTmp;
    }
}
