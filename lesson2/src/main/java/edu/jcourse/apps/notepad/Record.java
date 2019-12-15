package edu.jcourse.apps.notepad;

public class Record {
    private static int counter;
    private int id;
    private String firstName;
    private String lastNAME;
    private String phoneNumber;
    private String email;

    public Record () {
        counter ++;
        id = counter;
    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNAME() {
        return lastNAME;
    }

    public void setLastNAME(String lastNAME) {
        this.lastNAME = lastNAME;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %s %s %d",id, firstName, lastNAME, phoneNumber, email, counter);
    }
}

