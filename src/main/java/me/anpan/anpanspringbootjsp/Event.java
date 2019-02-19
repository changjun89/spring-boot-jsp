package me.anpan.anpanspringbootjsp;

import java.time.LocalDateTime;

public class Event {

    private String name;

    private LocalDateTime time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
