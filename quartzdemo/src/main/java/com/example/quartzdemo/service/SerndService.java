package com.example.quartzdemo.service;

import com.example.quartzdemo.projo.User;

import javax.mail.MessagingException;

public interface SerndService {
    public void send(User user) throws MessagingException;
}
