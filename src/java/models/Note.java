package models;

import java.io.Serializable;

public class Note implements Serializable {
    private String title;
    private String contents;

    public Note() {
        title = "";
        contents = "";
    }

    public Note(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public String getcontents() {
        return contents;
    }

    public void setcontents(String contents) {
        this.contents = contents;
    }

}