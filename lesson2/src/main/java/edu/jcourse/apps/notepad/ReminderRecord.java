package edu.jcourse.apps.notepad;

import java.time.LocalDate;

public class ReminderRecord extends AlarmRecords {

    private LocalDate date;

    @Override
    public void askData() {
        date = Notepad.askDate("date : ");
        super.askData();
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return String.format("%s %s",
                super.toString(),
                date.format(Notepad.DATE_PATTERN));
    }
}
