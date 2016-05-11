package com.mechanitis.demo.sense.client.user;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class HellohackController {
    @FXML private TableView<TwitterUser> leaders;

    public void setData(LeaderboardData data) {
        leaders.setItems(data.getItems());
    }
}
