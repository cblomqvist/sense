package com.mechanitis.demo.sense.client.user;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;

public class HellohackController {


  @FXML
  private Text actiontarget;

  @FXML
  protected void handleActionButtonAction(ActionEvent event) {
    actiontarget.setText("Action button pressed");
  }

}
