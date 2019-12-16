package edu.jcourse.apps.notepad;

public abstract class Record {
    private static int counter;// статическая переменная одна для всех
    // не статические переменные - для каждого объекта свои
    private int id;
// protected доступен всем наследникам

    public Record() {
        counter++;
        id = counter;
    }

    /**
     * comment Java doc
     *
     *
     *
     */
    public abstract void askData();

    // Только геттер - только для чтения
    public int getId() {
        return id;
    }


}

