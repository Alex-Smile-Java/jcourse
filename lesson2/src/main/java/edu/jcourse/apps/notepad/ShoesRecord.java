package edu.jcourse.apps.notepad;

public class ShoesRecord extends Record {
    private int size;
    private String colour;
    private String season;

    @Override
    public void askData() {
        size = Notepad.askInt("size: ");
        colour = Notepad.askString("colour: ");
        season = Notepad.askString("season : ");

    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

        @Override
        public String toString() {
            return String.format("%d %d %s %s ", getId(), size, colour, season);
        }

}
