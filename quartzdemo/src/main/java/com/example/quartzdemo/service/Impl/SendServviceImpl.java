package com.example.quartzdemo.service.Impl;

import com.example.quartzdemo.projo.User;
import com.example.quartzdemo.service.SerndService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
@Service
public class SendServviceImpl implements SerndService {

    @Autowired
    private JavaMailSender javaMailSender;
    @Value("${spring.mail.username}")
   private String from;


    @Override
    public void send(User user) throws MessagingException {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setText(user.getName());
        message.setSubject("吴华亮发送邮件");
        message.setFrom(from);
        message.setTo("2570700075@qq.com");
        System.out.println("====================");
        javaMailSender.send(message);
    }
}
