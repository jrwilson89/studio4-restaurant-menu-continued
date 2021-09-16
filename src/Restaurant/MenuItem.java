package Restaurant;

public class MenuItem {
    //Class Variables
    private String name;
    private String description;
    private Double price;
    private String category;
    private Boolean isNew;

    //Constructors
    public MenuItem(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = "Not characterized";
        this.isNew = false;
    }

    public MenuItem (String name, String description, Double price, String category, Boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;

    }

    //Methods
    //Create Getters and Setters
    public String getName() {return this.name;}

    public void setName(String name) {this.name = name;}

    public String getDescription() {return this.description;}

    public void setDescription(String description) {this.description = description;}

    public Double getPrice() {return this.price;}

    public void setPrice(Double price) {this.price = price;}

    public String getCategory() {return this.category;}

    public void setCategory(String category) {this.category = category;}

    public Boolean isNew() {return this.isNew;}

    public void setIsNew(Boolean isNew) {this.isNew = isNew;}

//Other Methods
//isNew PseudoCode
//isNew()
//  return this.isNew;
    @Override
    public String toString() {
        //PseudoCode
        //printOutMenuItem()
        String returnString = "";
        //print itemName
        returnString += "Item Name: " + this.name + "\n";
        //print itemDescription
        returnString += "Item Description: " + this.description + "\n";
        //print itemPrice
        returnString += "Item Price: " + this.price + "\n";
        //print itemCategory
        returnString += "Item Category: " + this.category + "\n";
        //print itemIsNew
        returnString += "Item Is New: " + this.isNew + "\n";

        return returnString;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof MenuItem)) {
            return false;
        }

        MenuItem menuItem = (MenuItem) obj;
        if (menuItem.name.equals(this.name)
                && menuItem.description.equals(this.description)
                && menuItem.price.equals(this.price)
                && menuItem.category.equals(this.category))
            return true;

        else return false;
    }
}
