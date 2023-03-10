package views;

import exceptions.DuplicateNameException;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import model.network.Client;
import viewModel.ChatApp;
import viewModel.WelcomeViewViewModel;

/**
 * This class initializes the welcome window with user registration
 *
 * @author Ehbal, Elias
 */
public class WelcomeView {

    @FXML
    private AnchorPane rootPaneWelcome;
    @FXML
    private TextField userNameField;
    @FXML
    private Button submitButton;
    @FXML
    private Label nameTakenLabel;

    private final WelcomeViewViewModel viewModel = new WelcomeViewViewModel();

    private final ChatApp chatApp = new ChatApp();

    @FXML

    /**
     * Binding userNameFiled, submitButton to the WelcomeViewModel
     */
    void initialize() {


        userNameField.textProperty()
                .bindBidirectional(viewModel.userNameProperty());
        submitButton.defaultButtonProperty()
                .bindBidirectional(viewModel.submitButtonProperty());

    }

    /**
     * passes the current stage to the viewModel and
     * catches the DuplicateNameException if the username
     * is already taken
     */

    public void submitUserName() {

        try {
            //Passing the current stage to the ViewModel
            Stage stage = (Stage) submitButton.getScene().getWindow();
            viewModel.submitUserName(stage);

            //Client-Constructor throws DuplicateNameException if name already taken
        } catch (DuplicateNameException e) {
            nameTakenLabel.setText(e.getMessage());
            nameTakenLabel.setVisible(true);  // Display notification
        }
    }

    @FXML

    /**
     * Hint label / notification can only be seen if userName is already taken
     */
    public void hideNameTakenLabel() {
        nameTakenLabel.setVisible(false);
    }

}
