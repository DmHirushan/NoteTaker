package lk.ijse.gdse.notetaker.service.impl;

import lk.ijse.gdse.notetaker.dao.NoteDao;
import lk.ijse.gdse.notetaker.service.NoteService;
import lk.ijse.gdse.notetaker.dto.NoteDto;
import lk.ijse.gdse.notetaker.util.AppUtil;
import lk.ijse.gdse.notetaker.util.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@Service
public class NoteServiceImpl implements NoteService {
    @Autowired
    private NoteDao noteDao;

    @Autowired
   private Mapping mapping;

    List<NoteDto> saveNoteTmp = new ArrayList<>();

//    public NoteServiceImpl(){
//        saveNoteTmp.add(new NoteDto(AppUtil.createNoteId(), "Principles of SE", "SE Desc", "P1", "2024/08/25"));
//        saveNoteTmp.add(new NoteDto(AppUtil.createNoteId(), "Principles of SE", "SE Desc", "P1", "2024/08/25"));
//        saveNoteTmp.add(new NoteDto(AppUtil.createNoteId(), "Principles of SE", "SE Desc", "P1", "2024/08/25"));
//        saveNoteTmp.add(new NoteDto(AppUtil.createNoteId(), "Principles of SE", "SE Desc", "P1", "2024/08/25"));
//        System.out.println(saveNoteTmp);
//    }

    @Override
    public String saveData(NoteDto noteDto) {
        noteDao.save(mapping.convertToEntity(noteDto));
        return "Note saved successfully!";
    }

    @Override
    public boolean update(String noteId, NoteDto incomingNoteDto) {
//        for (NoteDto updateNote : saveNoteTmp){
//            if(updateNote.getId().equals(noteId)){
//                updateNote.setNoteTitle(noteDto.getNoteTitle());
//                updateNote.setNoteDesc(noteDto.getNoteDesc());
//                updateNote.setPriorityLevel(noteDto.getPriorityLevel());
//                updateNote.setDate(noteDto.getDate());
//                System.out.println("updated Note : " + updateNote);
//                return true;
//            }
//        }

//        ListIterator<NoteDto> noteDtoListIterator = saveNoteTmp.listIterator();
//        while (noteDtoListIterator.hasNext()){
//            NoteDto noteDto = noteDtoListIterator.next();
//            if (noteDto.getId().equals(noteId)){
//                incomingNoteDto.setId(noteDto.getId());
//                noteDtoListIterator.set(incomingNoteDto);
//                System.out.println("updated Note : " + incomingNoteDto);
//                return true;
//            }
//        }
        return false;
    }

    @Override
    public boolean delete(String noteId) {
//        ListIterator<NoteDto> noteDtoListIterator = saveNoteTmp.listIterator();
//        while (noteDtoListIterator.hasNext()){
//            NoteDto noteDto = noteDtoListIterator.next();
//            if (noteDto.getId().equals(noteId)){
//                saveNoteTmp.remove(noteDto);
//                return true;
//            }
//        }
        return false;
    }

    @Override
    public NoteDto getSelectedData(String noteId) {
//        for (NoteDto noteDto : saveNoteTmp){
//            if (noteId.equals(noteDto.getId())){
//                return noteDto;
//            }
//        }
        return null;
    }

    @Override
    public List<NoteDto> getAll() {
        return saveNoteTmp;
    }
}

