package com.example.berkantaktas.myapplication22;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.Date;

public class Note implements Serializable {

    private String subject;
    private String content;
    private String duedate;

    public Note(String subject, String content, String duedate) {
        this.subject = subject;
        this.content = content;
        this.duedate = duedate;
    }




    public  String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }
}
