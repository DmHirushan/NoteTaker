package lk.ijse.gdse.notetaker.controller;

import lk.ijse.gdse.notetaker.bo.NoteBo;
import lk.ijse.gdse.notetaker.dto.NoteDto;
import lk.ijse.gdse.notetaker.util.AppUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/note")
@RequiredArgsConstructor
public class NoteController {

    @Autowired
    private final NoteBo noteBo;

    //Todo: CRUD of the note

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createNote(@RequestBody NoteDto noteDto){

        return ResponseEntity.ok(noteBo.saveData(noteDto));
    }

    @GetMapping(value = "allnotes", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<NoteDto> getAllNotes(){
        return null;
    }

    @GetMapping(value = "/{noteId}")
    public NoteDto getNote(@PathVariable ("noteId") String noteId){
        System.out.println(noteId);
        return null;
    }

    @PatchMapping(value = "/{noteId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void updateNote(@PathVariable("noteId") String noteId,NoteDto note){
        System.out.println(noteId);
        System.out.println(note + "updated");
    }

    @DeleteMapping(value = "/{noteId}")
    public void deleteNote(@PathVariable("noteId") String noteId){
        System.out.println(noteId + "deleted");
    }


}
