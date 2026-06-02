import java.util.ArrayList;

public class Playlist {

    private String name;
    private ArrayList<String> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

  public void addSong(String song) {
        songs.add(song);
        System.out.println("Добавлена песня: " + song);
    }

    public void removeSong(int index) {
        if (index >= 0 && index < songs.size()) {
            String removedSong = songs.remove(index);
            System.out.println("Удалена песня: " + removedSong);
        } else {
            System.out.println("Ошибка: неверный индекс.");
        }
    }

    public void updateSong(int index, String newSong) {
        if (index >= 0 && index < songs.size()) {
            String oldSong = songs.set(index, newSong);
            System.out.println("Песня \"" + oldSong + "\" заменена на \"" + newSong + "\"");
        } else {
            System.out.println("Ошибка: неверный индекс.");
        }
    }

    public String getSong(int index) {
        if (index >= 0 && index < songs.size()) {
            String song = songs.get(index);
            System.out.println("Получена песня: " + song);
            return song;
        }

        System.out.println("Ошибка: неверный индекс.");
        return null;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "name='" + name + '\'' +
                ", songs=" + songs +
                '}';
    }
}
