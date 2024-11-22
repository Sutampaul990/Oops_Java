import Hill_Stations.*;

public class Main_HillStations {
    public static void main(String[] args) {
        HillStations station;

        station = new Manali();
        station.location();
        station.famousfor();

        station = new Mussoorie();
        station.location();
        station.famousfor();

        station = new Gulmarg();
        station.location();
        station.famousfor();
    }
}

/*
 * Output :
 * Manali is located in Himachal Pradesh...
 * Manali is famous for its snow-covered mountains and adventurous sports...q
 * Mussoorie is located in Uttarakhand...
 * Mussoorie is famous for its scenic beauty and 'The Mall Road'...
 * Gulmarg is located in Jammu and Kashmir...
 * Gulmarg is famous for its ski resorts and meadows...
 * 
 */