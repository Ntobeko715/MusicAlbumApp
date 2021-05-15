
package za.ac.wsu.220224404
import package com.gmail.linahrose06

//MusicAlbumApp.java

public class MusicAlbumApp
{
	public static void main( String[] args)
	{
		MusicAlbum Album1 = new MusicAlbum();
		Album1.setNumberOfTracks(1);
		Album1.settitleOfAlbum("Groove");
		Album1.setnameOfArtists("Rihanna");
		Album1.getnamesOfTracks("Stupid in love");
		Album1.getnumberOfMiutes(3.5);
	
		MusicAlbum Album2 = new MusicAlbum();
		Album2.setNumberOfTracks(1);
		Album2.settitleOfAlbum("Love");
		Album2.setnameOfArtists("Justin");
		Album1.getnamesOfTracks("Holy");
		Album1.getnumberOfMiutes(5);
		
		MusicAlbum Album3 = new MusicAlbum();
		Album3.Album1.setNumberOfTracks(1);
		Album3.settitleOfAlbum("Rare");
		Album3.setnameOfArtists("Katy Perry");
		Album3.getnamesOfTracks("Dark Horse");
		Album3.getnumberOfMiutes(5);
		
		MusicAlbum Album4 = new MusicAlbum("Spirit",6, "Khalid", "Better",4);
		Album4.setNumberOfTracks(1);
		Album4.settitleOfAlbum("Spirit");
		Album4.setnameOfArtists("Khalid");
		Album4.getnamesOfTracks("Better");
		Album4.getnumberOfMiutes(4);
	
		
		MusicAlbum Album5 = new MusicAlbum("Live forever", 7, "LuckyDube","Soldier",2);
		Album5.Album1.setNumberOfTracks(1);
		Album5.setNumberOfTracks("Forever");
		Album1.settitleOfAlbum("Soldier");
		Album1.setnameOfArtists("LuckyDube");
		Album1.getnamesOfTracks("Freedom");
		Album1.getnumberOfMiutes(5);
		
		Album1.System.out.println( "ALBUM 1\n" + "Album Title: "  + gettitleOfAlbum() + "\nNumber of Tracks: " + getNumberOfTracks() + "\nArtist: " + getnameOfArtists() + "TrackName: " + getnamesOfTracks() + "\nNumber Of Minutes: " + getnumberOfMiutes() + "\n\n\n");
		Album2.System.out.println( "ALBUM 2\n" + "Album Title: "  + gettitleOfAlbum() + "\nNumber of Tracks: " + getNumberOfTracks() + "\nArtist: " + getnameOfArtists() + "TrackName: " + getnamesOfTracks() + "\nNumber Of Minutes: " + getnumberOfMiutes() + "\n\n\n" );
		Album3.System.out.println( "ALBUM 3\n" + "Album Title: "  + gettitleOfAlbum() + "\nNumber of Tracks: " + getNumberOfTracks() + "\nArtist: " + getnameOfArtists() + "TrackName: " + getnamesOfTracks() + "\nNumber Of Minutes: " + getnumberOfMiutes() + "\n\n\n");
	    Album4.System.out.println( "ALBUM 4\n" + "Album Title: "  + gettitleOfAlbum() + "\nNumber of Tracks: " + getNumberOfTracks() + "\nArtist: " + getnameOfArtists() + "TrackName: " + getnamesOfTracks() + "\nNumber Of Minutes: " + getnumberOfMiutes() + "\n\n\n");
        Album5.System.out.println( "ALBUM 5\n" + "Album Title: "  + gettitleOfAlbum() + "\nNumber of Tracks: " + getNumberOfTracks() + "\nArtist: " + getnameOfArtists() + "TrackName: " + getnamesOfTracks() + "\nNumber Of Minutes: " + getnumberOfMiutes() + "\n\n\n");
        
		System.exit(0);
	}
}