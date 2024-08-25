package lk.ijse.gdse.notetaker.util;

import org.modelmapper.ModelMapper;

import java.util.UUID;

public class AppUtil {

    private ModelMapper modelMapper;
    public static String createNoteId(){
        return UUID.randomUUID().toString();
    }

    //mapping
    //note details
}
