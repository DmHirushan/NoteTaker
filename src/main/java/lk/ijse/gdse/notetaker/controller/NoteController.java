package lk.ijse.gdse.notetaker.controller;

import lk.ijse.gdse.notetaker.sevice.NoteService;
import lk.ijse.gdse.notetaker.dto.NoteDto;
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
    private final NoteService noteService;

    //Todo: CRUD of the note

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createNote(@RequestBody NoteDto noteDto){

        return ResponseEntity.ok(noteService.saveData(noteDto));
    }

    @GetMapping(value = "allnotes", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<NoteDto> getAllNotes(){
        return noteService.getAll();
    }

    @GetMapping(value = "/{noteId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public NoteDto getNote(@PathVariable ("noteId") String noteId){
        return noteService.getSelectedData(noteId);
    }

    @PatchMapping(value = "/{noteId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String updateNote(@PathVariable("noteId") String noteId,NoteDto noteDto){
        if (noteService.update(noteId, noteDto)){
            return "Note update successfully";
        }else {
            return "something went wrong";
        }
    }

    @DeleteMapping(value = "/{noteId}")
    public void deleteNote(@PathVariable("noteId") String noteId){
        System.out.println(noteId + "deleted");
    }


}
