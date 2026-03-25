package BaseClassesForProject;

import java.net.PasswordAuthentication;
import java.time.LocalDate;
import java.time.LocalDateTime;

class products {
    private int productID;
    private String productname;
    private double price;
    private int quantity;
    private String productDescription;

    public int getProductID() {
        return productID;
    }
    public void setProductID(int productID) {
        this.productID = productID;
    }


    public String getProductname() {
        return productname;
    }
    public void setProductname(String productname) {
        this.productname = productname;
    }


    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
}



class warehouse {
    private int locationID;
    private String locationname;
    private String locationaddress;
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }


    public String getLocationaddress() {
        return locationaddress;
    }

    public void setLocationaddress(String locationaddress) {
        this.locationaddress = locationaddress;
    }


    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname;
    }
}

class inventory{
    private int inventoryID;
    private int productID;
    private int locationID;
    private int quantity;

    public int getInventoryID() {
        return inventoryID;
    }
    public void setInventoryID(int inventoryID) {
        this.inventoryID = inventoryID;
    }


    public int getProductID() {
        return productID;
    }
    public void setProductID(int productID) {
        this.productID = productID;
    }


    public int getLocationID() {
        return locationID;
    }
    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


class transfer {
    private int transferID;
    private int productID;
    private int sourcelocationID;
    private int destinationlocationID;
    private int quantity;
    private String transferstatus;
    public LocalDate requestdate;


    public int getTransferID() {
        return transferID;
    }
    public void setTransferID(int transferID) {
        this.transferID = transferID;
    }


    public int getProductID() {
        return productID;
    }
    public void setProductID(int productID) {
        this.productID = productID;
    }


    public int getSourcelocationID() {
        return sourcelocationID;
    }
    public void setSourcelocationID(int sourcelocationID) {
        this.sourcelocationID = sourcelocationID;
    }


    public int getDestinationlocationID() {
        return destinationlocationID;
    }
    public void setDestinationlocationID(int destinationlocationID) {
        this.destinationlocationID = destinationlocationID;
    }


    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public String getTransferstatus() {
        return transferstatus;
    }
    public void setTransferstatus(String transferstatus) {
        this.transferstatus = transferstatus;
    }


    public LocalDate getRequestdate() {
        return requestdate;
    }
    public void setRequestdate(LocalDate requestdate) {
        this.requestdate = requestdate;
    }
}


class user{
    private int userID;
    private String username;
    private String email;
    private PasswordAuthentication password;
    private String role;


    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }


    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public PasswordAuthentication getPassword() {
        return password;
    }
    public void setPassword(PasswordAuthentication password) {
        this.password = password;
    }


    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}





    public class InventoryTransferManagementSystem {




}
