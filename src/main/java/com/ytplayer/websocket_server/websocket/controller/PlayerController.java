package com.ytplayer.websocket_server.websocket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    @GetMapping("/status")
    public String getStatus() {
        return "Websocket is running";
    }
}
