package javase01.t06.Notebook;

import java.util.Date;

/**
 * Created by Ekaterina on 06.03.16.
 */
public class Main {

    public static void main(String[] args) {

        Notebook personalNotebook = new Notebook ();

        personalNotebook.addNote(new Note(new Date(), "Hello World!"));
        personalNotebook.addNote(new Note(new Date(), "What's going on?"));
        personalNotebook.addNote(new Note(new Date(), "Welcome again!"));


        personalNotebook.deleteNote(1);

        Note edNote = personalNotebook.getNote(0);
        edNote.note = "Hell world?";

        personalNotebook.editNote(0, edNote);



        Note[] allNotes = personalNotebook.getAllNotes();

        for (int i = 0; i < allNotes.length; i++) {
            System.out.println (allNotes[i].note + " " + allNotes[i].date);

        }



    }
}
