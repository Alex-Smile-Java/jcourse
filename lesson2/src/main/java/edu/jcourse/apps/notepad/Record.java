package edu.jcourse.apps.notepad;

import java.time.Instant;

public abstract class Record {
    private static int counter;// статическая переменная одна для всех
    // не статические переменные - для каждого объекта свои
    private int id;
    private  final Instant createdAt;
// protected доступен всем наследникам

    public Record() {
        counter++;
        id = counter;
        createdAt = Instant.now();
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    @Override
    public  String toString(){
        return  String.format("%d %s" , id, createdAt);
    }
}

