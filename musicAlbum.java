
package com.gmail.linahrose06;

//Music class Source Code

public class MusicAlbum()
{
//private members of the class
private String titleOfAlbum;
private int numberOfTracks;
private String nameOfArtist;
private String namesOfTracks;
private double numberOfMinutes;

//set methods
public void setNumberOfTracks( int trackNumber)
{
   return numberOfTracks;
}


public void settitleOfAlbum( String AlbumName)
{
     titleOfAlbum = AlbumName;
}


public void setnameOfArtists( String artistName)
{
      nameOfArtist = artistName;
}


public void getnamesOfTracks( String trackName)
{
      namesOfTracks = trackName;
}


public void getnumberOfMiutes( double trackTime)
{   
      numberOfMinutes = trackTime;
}

//get methods
public int getNumberOfTracks()
{
   return numberOfTracks;
}


public String gettitleOfAlbum()
{
    return titleOfAlbum;
}


public String getnameOfArtists()
{
     return nameOfArtist;
}


public String getnamesOfTracks()
{
     return namesOfTracks;
}


public double getnumberOfMiutes()
{   
     return numberOfMinutes;
}

}