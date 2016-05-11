package com.mechanitis.demo.sense.client;

import com.mechanitis.demo.sense.client.mood.HappinessController;
import com.mechanitis.demo.sense.client.mood.MoodController;
import com.mechanitis.demo.sense.client.user.HellohackController;
import com.mechanitis.demo.sense.client.user.LeaderboardController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class DashboardController {
    @FXML private MoodController moodController;
    @FXML private HappinessController happyController;
    @FXML private LeaderboardController leaderboardController;
    @FXML private HellohackController hellohackController;

    @FXML private Text actiontarget;

    public MoodController getMoodController() {
        return moodController;
    }

    public HappinessController getHappinessController() {
        return happyController;
    }

    public LeaderboardController getLeaderboardController() {
        return leaderboardController;
    }

    public HellohackController getHellohackController() {
        return hellohackController;
    }

    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed");
    }
}
