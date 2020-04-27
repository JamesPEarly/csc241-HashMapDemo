package csc241;

public class CompactDisc {

    // Instance variables
    private String upc;
    private double price;
    private String artist, title;

    // Constructor
    public CompactDisc(String upc, double price, String artist, String title){
        this.upc = upc;
        this.price = price;
        this.artist = artist;
        this.title = title;
    }

    // "Getters"
    public String getUpc() {
        return upc;
    }

    public double getPrice() {
        return price;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }
}
