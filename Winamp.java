public class Winamp {

    public static void main(String[] args) {

        Playlist playlist = new Playlist("My Favorite Songs");

        playlist.addSong("Clairo - Bugs");
        playlist.addSong("Biig Piig - Lavender");
        playlist.addSong("Cream Soda - Internet friends");

        playlist.getSong(1);

        playlist.updateSong(2, "Locked Club - Egipet");
      
        playlist.removeSong(0);

        // Вывод всего плейлиста
        System.out.println("\nИтоговый плейлист:");
        System.out.println(playlist);
    }
}
