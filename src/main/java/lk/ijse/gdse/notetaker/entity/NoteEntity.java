package lk.ijse.gdse.notetaker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Table(name = "notes")
@Entity
public class NoteEntity {
    @Id
    private String id;
    private String noteTitle;
    private String noteDesc;
    private String priorityLevel;
    private String date;
}
