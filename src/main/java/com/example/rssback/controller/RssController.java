package com.example.rssback.controller;

import com.example.rssback.model.Item;
import com.example.rssback.repository.RssProxy;
import lombok.Data;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Data
@RestController
public class RssController {
    @Autowired
    private RssProxy service;
    @CrossOrigin("*")
    @GetMapping("/api/feed")
    public List<Item> home()  {
        List<Item> listFeed = service.getFeeds();
        return listFeed;
    }
}
