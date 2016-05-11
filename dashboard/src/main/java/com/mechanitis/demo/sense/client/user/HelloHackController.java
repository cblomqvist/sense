package com.mechanitis.demo.sense.client.user;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HellohackController {

  @FXML
  private Text actiontarget;

  @FXML
  protected void handleActionButtonAction(ActionEvent event) {

    OkHttpClient okClient = new OkHttpClient();
    final Request request = new Request.Builder().url("http://localhost:8080/ping").build();
    final Call call = okClient.newCall(request);
    try {
      final Response response = call.execute();
      final int code = response.code();
      actiontarget.setText("Response code: "+code+", message: "+response.body().string());
      log.debug("Code {}", code);

    } catch (IOException e) {
      actiontarget.setText(String.format("Action button pressed but something went wrong: %s", e.getMessage()));
      e.printStackTrace();
    }

  }

}
