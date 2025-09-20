package prelim;

import java.util.LinkedList;

public class linked_list_demo {
    public static void main(String[] args){
        LinkedList<String> playlist = new LinkedList<>();
        
        //Adding Elements
        playlist.add("Wildflower");
        playlist.add("You belong with me");
        playlist.addFirst("Love Story");
        playlist.addLast("Written in red");
        playlist.add("Wildflower");
        playlist.add("L-O-V-E");
        playlist.addFirst("Eternity");
        playlist.addFirst("First Burn");
        
        //Printing
        System.out.println("Playlist: \n" + playlist);
        System.out.println("Total number of elements: " + playlist.size());
        
        System.out.print("\n");
        //Accessing Elements
        System.out.println("6th Song: " + playlist.get(5));
        System.out.println("3rd Song: " + playlist.get(2));
        System.out.println("1st Song: " + playlist.getFirst());
        
        System.out.print("\n");
        //Searching Elements
        System.out.println("Does it have You belong with me? " + playlist.contains("You belong with me"));
        System.out.println("Does it have His Way is Perfect? " + playlist.contains("His Way is Perfect"));
        System.out.println("What number is Love Story in the order of songs? " + playlist.indexOf("Love Story"));
        
        System.out.print("\n");
        //Removing Elements
        playlist.remove();
        System.out.println(playlist);
        playlist.remove("L-O-V-E");
        System.out.println(playlist);
        playlist.removeFirst();
        System.out.println(playlist);
        
        System.out.print("\n");
        //Clearing Elements
        System.out.println("Clearing Playlist...");
        playlist.clear();
        System.out.println("Playlist is empty: " + playlist.isEmpty());
        
    }
}
