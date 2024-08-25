package lk.ijse.gdse.notetaker.service;

import lk.ijse.gdse.notetaker.dto.NoteDto;

import java.util.List;

public interface NoteService {
    String saveData(NoteDto noteDto);
    boolean update(String noteId, NoteDto noteDto);
    boolean delete(String noteId);
    NoteDto getSelectedData(String noteId);
    List<NoteDto> getAll();
}
