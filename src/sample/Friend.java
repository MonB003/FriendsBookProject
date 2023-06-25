/* Unit 6 Friends Book Friend class
By: Monica 
 */

package sample;

public class Friend {
    // Fields for Friend object
    String name;
    String hairColour;
    String favouriteFood;
    String hobby;

    // Constructor for Friend object
    Friend(String name, String hairColour, String favouriteFood, String hobby) {
        this.name = name;
        this.hairColour = hairColour;
        this.favouriteFood = favouriteFood;
        this.hobby = hobby;
    }

    // Getters to get fields
    public String getName() {
        return name;
    }

    public String getHairColour() {
        return hairColour;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public String getHobby() {return hobby;}

    // toString Method that displays friend's name in friendsList
    public String toString() {
        return name;
    }

}
