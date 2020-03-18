import java.awt.print.Book;
import java.util.ArrayList;

public class BedRoom {
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> tenants;
    private String type;

    public BedRoom(int roomNumber, int capacity, String type){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.tenants = new ArrayList<Guest>();
        this.type = type;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getTenants() {
        return tenants;
    }

    public String getType() {
        return type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setTenants(ArrayList<Guest> tenants) {
        this.tenants = tenants;
    }
    public int tenantsCount(){
        return this.tenants.size();
    }
    public void addGuest(Guest guest){
        this.tenants.add(guest);
    }


    public void  checkoutGuest(Guest guest) {
        this.tenants.remove(guest);

    }

    public boolean guestPresent(Guest guest){
        if( this.tenants.contains(guest)){
            return true;
        }else{
            return false;
        }
    }
}

