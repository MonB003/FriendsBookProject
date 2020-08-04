/* Unit 6 Friends Book Controller class
By: Monica Bacatan
 */

package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class Controller {
    public TextField textGetName;
    public TextField textGetHairColour;
    public TextField textGetFavouriteFood;
    public TextField textGetHobby;
    public ListView <Friend> friendsList = new ListView<>();
    public Button btnAddFriend;
    public Label lblName;
    public Label lblHairColour;
    public Label lblFavouriteFood;
    public Label lblHobby;
    public Button btnDeleteFriend;


    // Boolean methods for fields of friend object that return true when there's user input
    public boolean enterName() {
        if (textGetName.getText() != null) {
            btnAddFriend.setDisable(false);
        }
        return true;
    }

    public boolean enterHairColour() {
        if (textGetHairColour.getText() != null) {
            btnAddFriend.setDisable(false);
        }
        return true;
    }

    public boolean enterFavouriteFood() {
        if (textGetFavouriteFood.getText() != null) {
            btnAddFriend.setDisable(false);
        }
        return true;
    }

    public boolean enterHobby() {
        if (textGetHobby.getText() != null) {
            btnAddFriend.setDisable(false);
        }
        return true;
    }

    // Method that enables btnAddFriend when there's input in all the text fields
    public void checkUserInput(KeyEvent keyEvent) {
        if (enterName() && enterHairColour()) {
            if (enterFavouriteFood() && enterHobby()) {
                btnAddFriend.setDisable(false);
            }
        }
    }

    // Method to add friend to friendsList when btnAddFriend is pressed
    public void addFriend(ActionEvent actionEvent) {
        // Get user input for all fields of Friend object
        String name = textGetName.getText();
        String hairColour = textGetHairColour.getText();
        String favouriteFood = textGetFavouriteFood.getText();
        String hobby = textGetHobby.getText();

        // Add friend object with fields to friendsList
        Friend temp = new Friend(name, hairColour, favouriteFood, hobby);
        friendsList.getItems().add(temp);

        // Reset text fields and button
        textGetName.clear();
        textGetHairColour.clear();
        textGetFavouriteFood.clear();
        textGetHobby.clear();
        btnDeleteFriend.setDisable(true);
    }

    // Method to display a friend when selected
    public void displayFriend(MouseEvent mouseEvent) {
        // Select a friend
        Friend temp;
        temp = friendsList.getSelectionModel().getSelectedItem();

        // Set labels to the user's input from the text fields
        // This displays all the friend's properties
        lblName.setText(temp.getName());
        lblHairColour.setText(temp.getHairColour());
        lblFavouriteFood.setText(temp.getFavouriteFood());
        lblHobby.setText(temp.getHobby());

        // Enable button to delete a friend
        btnDeleteFriend.setDisable(false);
    }

    // Method to delete friend when btnDeleteFriend is pressed
    public void deleteFriend(ActionEvent actionEvent) {
        // Select a friend
        Friend temp;
        temp = friendsList.getSelectionModel().getSelectedItem();
        friendsList.getSelectionModel().select(temp);

        // Remove friend from friendsList
        friendsList.getItems().remove(temp);

        // Clear labels for each field
        lblName.setText("");
        lblHairColour.setText("");
        lblFavouriteFood.setText("");
        lblHobby.setText("");

        // Disable button to delete friend until another friend from the friendsList is selected
        btnDeleteFriend.setDisable(true);
    }

}
