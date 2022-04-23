package com.example.rssback.service;

import com.example.rssback.model.Item;
import com.example.rssback.repository.RssProxy;
import lombok.Data;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class RssService {
    @Autowired
    private RssProxy rssProxy;

    public List<Item> getFeeds() throws JSONException {
        return rssProxy.getFeeds();
    }
}
