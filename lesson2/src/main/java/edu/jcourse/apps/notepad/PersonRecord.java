package edu.jcourse.apps.notepad;

public class PersonRecord extends Record {
    private String firstName;
    private String lastNAME;
    private String phoneNumber;
    private String email;

    @Override
        public void askData() {
            firstName = Notepad.askString("first name: ");
            lastNAME = Notepad.askString("last name");
            phoneNumber = Notepad.askString("phone: ");
            email = Notepad.askString("email: ");
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
        return String.format("%d %s %s %s %s", getId(), firstName, lastNAME, phoneNumber, email);
    }


}
