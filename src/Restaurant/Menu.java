package Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    //Class Variables
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;


    //Constructors
    public Menu() {
        this.lastUpdated = new Date();
    }

    //Methods
    //Getters and Setters
    public ArrayList<MenuItem> getMenuItems() {return this.menuItems;}

    public void setMenuItems(ArrayList<MenuItem> menuItems) {this.menuItems = menuItems;}

    public Date getLastUpdated() { return this.lastUpdated;}

    public void setLastUpdated(Date lastUpdated) {this.lastUpdated = lastUpdated;}

    public void addMenuItem(MenuItem item) {
        //Add to the list of menu items
        this.menuItems.add(item);
        //Update lastUpdated property (class variable)
        this.lastUpdated = new Date();
    }

    public void removeMenuItem(MenuItem item) {
        //remove the item from the list
        this.menuItems.remove(item);
        //update the lastUpdated property (class variable)
        this.lastUpdated = new Date();
    }

    @Override
    public String toString() {
        String returnString = "";
        //for menuItem in listOfMenuItems
        for (MenuItem item : this.menuItems) {
            returnString += item.toString() + "\n\n";

        }

        //menuItem.printOutMenuItem();

        return returnString;
    }
}
