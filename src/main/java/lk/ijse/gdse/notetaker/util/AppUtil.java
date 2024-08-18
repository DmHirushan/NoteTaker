package lk.ijse.gdse.notetaker.util;

import java.util.UUID;

public class AppUtil {
    public static String createNoteId(){
        return UUID.randomUUID().toString();
    }
}
