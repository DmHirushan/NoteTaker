package lk.ijse.gdse.notetaker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class NoteDto implements Serializable {
    private String id;
    private String noteTitle;
    private String noteDesc;
    private String priorityLevel;
    private String date;

}
