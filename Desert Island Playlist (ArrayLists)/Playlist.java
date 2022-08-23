import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Shelter");
    desertIslandPlaylist.add("Love it if we made it");
    desertIslandPlaylist.add("Sincerity is scary");
    desertIslandPlaylist.add("It's not living if it's not with you");
    desertIslandPlaylist.add("Issunboushi");
    desertIslandPlaylist.add("Everything Goes On");

    //checking songs number
    System.out.println(desertIslandPlaylist.size());

    //remove songs
    desertIslandPlaylist.remove(5);

    System.out.println(desertIslandPlaylist.size());

    //Swap songs 
    int aIndex = desertIslandPlaylist.indexOf("Shelter");
    int bIndex = desertIslandPlaylist.indexOf("Issunboushi");

    String tempA = "Shelter";

    desertIslandPlaylist.set(0, "Issunboushi");
    desertIslandPlaylist.set(4, tempA);

    System.out.println(desertIslandPlaylist);


  }
  
}