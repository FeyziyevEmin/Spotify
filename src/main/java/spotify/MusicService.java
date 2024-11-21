package spotify;

public interface MusicService {
    void add(Music music);
    void delete(String singerName);
    void uptade(int id, String musicName, String singerName, String odenisUsulu, boolean isPremium);
    Music[] getMusic(String singerName);

}
