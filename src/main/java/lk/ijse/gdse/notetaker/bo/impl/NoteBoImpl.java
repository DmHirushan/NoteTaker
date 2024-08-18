package lk.ijse.gdse.notetaker.bo.impl;

import lk.ijse.gdse.notetaker.bo.NoteBo;
import lk.ijse.gdse.notetaker.dto.NoteDto;
import lk.ijse.gdse.notetaker.util.AppUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteBoImpl implements NoteBo {
    @Override
    public String saveData(NoteDto noteDto) {
        noteDto.setId(AppUtil.createNoteId());
        System.out.println(noteDto);
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
        return null;
    }

    @Override
    public List<NoteDto> getAll() {
        return null;
    }
}
