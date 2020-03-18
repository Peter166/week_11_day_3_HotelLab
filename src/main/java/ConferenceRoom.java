import java.util.ArrayList;

public class ConferenceRoom {
    private int capacity;
    private ArrayList<Guest> tenants;
    private String name;

    public ConferenceRoom(String name,int capacity){
        this.name=name;
        this.capacity=capacity;
        this.tenants=new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getTenants() {
        return tenants;
    }

    public String getName() {
        return name;
    }

    public void setTenants(ArrayList<Guest> tenants) {
        this.tenants = tenants;
    }

    public void addGuest(Guest guest){
       if( this.tenantsCount() < this.capacity) {
           this.tenants.add(guest);
       }
    }


    public void  checkoutGuest(Guest guest) {
        this.tenants.remove(guest);

    }
    public int tenantsCount(){
        return this.tenants.size();
    }
}

