package com.priyanshnama.jagrati.ui.notification;

public class Notification {
    private String type, title, info;

    public Notification(){}

    public Notification(String type, String title, String info) {
        this.type = type;
        this.title = title;
        this.info = info;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
