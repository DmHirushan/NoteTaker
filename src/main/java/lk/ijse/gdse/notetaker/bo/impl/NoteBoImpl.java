package lk.ijse.gdse.notetaker.bo.impl;

import lk.ijse.gdse.notetaker.bo.NoteBo;
import lk.ijse.gdse.notetaker.dto.NoteDto;

import java.util.List;

public class NoteBoImpl implements NoteBo {
    @Override
    public String saveData(NoteDto noteDto) {
        return null;
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
