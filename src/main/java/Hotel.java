import java.util.ArrayList;

public class Hotel {
    private ArrayList<BedRoom> bedrooms;
    private ArrayList<ConferenceRoom> conferencerooms;

    public Hotel(){
        this.bedrooms = new ArrayList<BedRoom>();
        this.conferencerooms = new ArrayList<ConferenceRoom>();
    }

    public void checkIn(int room, Guest guest){
        for (BedRoom currentroom : this.bedrooms){
            if (room == currentroom.getRoomNumber()){
                currentroom.addGuest(guest);
            }
        }

    }

    public void checkOut(int room, Guest guest){
        for (BedRoom currentroom : this.bedrooms){
            if (room == currentroom.getRoomNumber()){
                currentroom.checkoutGuest(guest);
            }
        }

    }



    public void checkIn(String room, Guest guest){
        for (ConferenceRoom currentroom : this.conferencerooms){
            if (room == currentroom.getName()){
                currentroom.addGuest(guest);
            }
        }

    }

    public void checkOut(String room, Guest guest){
        for (ConferenceRoom currentroom : this.conferencerooms){
            if (room == currentroom.getName()){
                currentroom.checkoutGuest(guest);
            }
        }

    }



    public void addBedRoom(BedRoom bedroom){
        this.bedrooms.add(bedroom);
    }
    public void addConferenceRoom(ConferenceRoom conferenceroom){
        this.conferencerooms.add(conferenceroom);
    }
    public int amountOfBedRooms(){
       return this.bedrooms.size();
    }
    public int amountOfConferenceRooms(){
        return this.conferencerooms.size();
    }




}
