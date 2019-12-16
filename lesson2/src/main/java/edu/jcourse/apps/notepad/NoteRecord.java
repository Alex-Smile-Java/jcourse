package edu.jcourse.apps.notepad;

public class NoteRecord extends Record {


    private String text;

    @Override
    public void askData() {
        text = Notepad.askString("note: ");

    }

    public String getNote() {
        return text;
    }

    public void setNote(String note) {
        this.text = note;
    }

    @Override
    public String toString() {
        return String.format("%d %s", getId(), text);
    }
}
