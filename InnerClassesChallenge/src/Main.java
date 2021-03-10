import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums=new ArrayList<Album>();
    public static void main(String[] args) {
	// write your code here
        Album album= new Album("Stormbringer","Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 3.23);
        album.addSong("Holy man", 3.01);
        album.addSong("Hold on", 6.03);
        album.addSong("lady double dealer", 4.55);
        album.addSong("You can't do it right", 5.11);
        album.addSong("high ball shooter", 2.58);
        album.addSong("The gypsy", 2.32);
        album.addSong("Soldier of fortune", 3.52);
        albums.add(album);
        album = new Album("For those about to rock","ACDC");
        album.addSong("For those about to rock", 4.22);
        album.addSong("I put the finger on you", 3.11);
        album.addSong("Lets go", 3.33);
        album.addSong("Inject the venom", 2.55);
        album.addSong("Snowballed", 4.04);
        album.addSong("Evil walks", 3.47);
        album.addSong("COD", 2.31);
        album.addSong("Breaking the rules", 5.06);
        album.addSong("Night of the long knives", 6.12);
        albums.add(album);

        LinkedList<Song> playList=new LinkedList<Song>();
        albums.get(0).addToPlaylist("You can't do it right",playList);
        albums.get(0).addToPlaylist("Holy man",playList);
        albums.get(0).addToPlaylist("Speed king",playList);//does not exist

        albums.get(0).addToPlaylist(9,playList);
        albums.get(1).addToPlaylist(8,playList);
        albums.get(1).addToPlaylist(3,playList);
        albums.get(1).addToPlaylist(2,playList);
        albums.get(1).addToPlaylist(24,playList);//does not exist

        play(playList);
    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner=new Scanner(System.in);
        boolean quit=false;
        boolean forward=true;
        ListIterator<Song> listIterator= playList.listIterator();
        if (playList.size()==0){
            System.out.println("No songs in playlist");
            return;
        }else{
            System.out.println("Now playing "+listIterator.next().toString());
            printMenu();
        }
        while(quit==false){
            int action=scanner.nextInt();
            scanner.nextLine();

            switch (action){

                case 0:
                    System.out.println("Playlist complete");
                    quit=true;
                    break;
                case 1:
                    if (forward==false){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward=true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now playing "+listIterator.next().toString());
                    }else{
                        System.out.println("We've reached the end of the playlist");
                        forward=false;
                    }
                    break;
                case 2:
                    if (forward==true){
                        if (listIterator.hasPrevious()==true){
                            listIterator.previous();
                        }
                        forward=false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing "+listIterator.previous().toString());
                    }else{
                        System.out.println("We are at the start of the playlist");
                        forward=true;
                    }
                    break;
                case 3:
                    if (forward==true){
                        if (listIterator.hasPrevious()){
                            System.out.println("Now replaying "+listIterator.previous().toString());
                            forward=false;
                        }else{
                            System.out.println("We are at the start of the list");
                        }

                    }else{
                        if (listIterator.hasNext()==true){
                            System.out.println("Now replaying "+listIterator.next().toString());
                            forward=true;
                        }else{
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4: printList(playList); break;
                case 5: printMenu(); break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Actions: \npress");
        System.out.println("0 to quit \n"+
                "1 to play next song\n"+
                "2 to play previous song\n"+
                "3 to replay the current song\n"+
                "4 to list songs in playlist\n"+
                "5 print actions\n");
    }

    private static void printList(LinkedList<Song> playlist){
        for (int i=0; i< playlist.size();i++){
            System.out.println(playlist.get(i).toString());
        }
        System.out.println("================");
    }


}
