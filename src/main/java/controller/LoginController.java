package controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.stream.Collectors;


import view.*;

import javax.swing.text.html.ImageView;


public class LoginController {
    @FXML
    private ImageView closeBtn;
    @FXML
    private Button singInBtn;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Label warnLabel;
    @FXML
    private Label warnLableClose;

    @FXML
    private void closeBtnMouseEntered(MouseEvent e){
//        closeBtn.setCursor(Cursor.HAND_CURSOR);
    }

    @FXML
    private void closeBtnMouseCliecked(){
        System.exit(0);
    }

    @FXML
    private void singInBtnAction(ActionEvent e){

    }


    private static LoginController loginController = null;

    private LoginController() {

    }

    public static LoginController getInstance() {
        if (loginController == null)
            loginController = new LoginController();

        return loginController;
    }


    public void createNewUser(String nickName, String password, String userName) {
        Player player = new Player(nickName, password, userName);
    }

    public String createUser(String userName, String nickName, String password) {
        if (checkUserName(userName)) {
            if (checkNickName(nickName)) {
                createNewUser(nickName, password, userName);
                return ("user created successfully!");
            } else
                return ("user with nickname " + nickName + " already exists");
        } else
            return ("user with username " + userName + " already exists");

    }


    public boolean checkUserName(String username) {
        for (Player player : Player.getAllPlayers()) {
            if (player.getUsername().equals(username))
                return false;
        }
        return true;
    }


    public boolean checkNickName(String nickName) {
        for (Player player : Player.getAllPlayers()) {
            if (player.getNickname().equals(nickName))
                return false;
        }
        return true;
    }


    public boolean checkPassword(Player player, String password) {

        if (player.getPassword().equals(password)) return true;

        return false;
    }


    public String loginUser(String username, String password) {
        if (Player.getPlayerByUser(username) != null) {
            if (checkPassword(Player.getPlayerByUser(username), password)) {
                GlobalVariable.setPlayer(Player.getPlayerByUser(username));

                return ("user logged in successfully!");
            } else
                return ("Username and password didn't match!");
        } else return ("Username and password didn't match!");
    }

    private void logIn(){
        String username = this.username.getText().toString();
        String password = this.password.getText().toString();
    }
    public void textFieldMouseClicked(){

    }
    public void warnLableCloseMouseClicked(){}


}