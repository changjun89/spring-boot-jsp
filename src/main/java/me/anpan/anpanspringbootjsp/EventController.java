package me.anpan.anpanspringbootjsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class EventController {

    @GetMapping("/events")
    public String getEvents(Model model) {

        Event event = new Event();
        event.setName("스프링 웹 mvc 스터디1");
        event.setTime(LocalDateTime.of(2019, 02, 19, 14, 10));

        Event event2 = new Event();
        event2.setName("스프링 웹 mvc 스터디2");
        event2.setTime(LocalDateTime.of(2019, 02, 20, 14, 10));


        List<Event> list = new ArrayList<Event>();
        list.add(event);
        list.add(event2);

        model.addAttribute("events", list);
        model.addAttribute("message", "Happy New Year");

        return "events/list";


    }
}
