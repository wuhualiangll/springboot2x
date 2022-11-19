package com.example.quartzdemo.controller;

import com.example.quartzdemo.projo.User;
import com.example.quartzdemo.service.Impl.SendServviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@Controller
public class SendController {

    @Autowired
    private SendServviceImpl sendServvice;

    @RequestMapping("/send")
    @Scheduled(cron = "*/5 * * * * *")
    public  void   send() throws MessagingException {
        User user = new User();
        user.setName("吴帅哥");
        sendServvice.send(user);

    }
}
