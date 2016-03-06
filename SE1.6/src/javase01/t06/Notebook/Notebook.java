package javase01.t06.Notebook;


/**
 * Created by Ekaterina on 06.03.16.
 */
public class Notebook {

    Note[] notes = new Note [1000];
    int lastNoteID = -1;


    public void addNote(Note note) {     //добавляет новую запись в Блокнот
        notes [lastNoteID+1] = note;
        lastNoteID = lastNoteID +1;
    }

    public void deleteNote (int id) {    //удаляет ранее созданную запись из Блокнота
        for (int i=id; i < lastNoteID; i++) {
            notes [i] = notes [i + 1];
        }
        lastNoteID = lastNoteID - 1;
    }

    public Note getNote(int id) {       //возвращает запись по ее id
        return notes[id];
    }

    public void editNote (int id, Note note) {    //изменяет созданную запись
        notes [id] = note;
    }

    public Note[] getAllNotes () {                  //возвращает все сделанные записи
        Note [] notesNew = new Note [lastNoteID+1];
        for (int i = 0; i <= lastNoteID; i++) {
            notesNew [i] = notes [i];
        }
        return notesNew;

    }




}

