package spotify;

public class MusicManeger implements MusicService {

    private Music[] musics = new Music[5];
    private int count;

    public Music[] getMusics() {
        return musics;
    }

    @Override
    public void add(Music music) {
        if (count < musics.length) {
            musics[count++] = music;
            System.out.println("musiqi alboma elave olundu");
        } else {
            System.out.println("albom artiq doludur");
        }
    }

    @Override
    public void delete(String singerName) {
        for (int i = 0; i < count; i++) {
            if (musics[i].getSingerName().equals(singerName)) {
                musics[count - 1] = null;
                count--;
                System.out.println("musiqi silindi");
            }
        }
    }

    @Override
    public void uptade(int id, String musicName, String singerName, String odenisUsulu, boolean isPremium) {
        for (int i=0; i<count; i++){
            if (musics[i].getId()==id){
                musics[i].setMusicName(musicName);
                musics[i].setPremium(isPremium);
                musics[i].setOdenisUsulu(odenisUsulu);
                musics[i].setSingerName(singerName);
                return;

            }
            System.out.println("uptade edildi");
        }
        System.out.println("uygun musuqu albomu yoxdur");
    }


    @Override
    public Music[] getMusic(String singerName) {
        for (int i=0;i<count;i++){
            if (musics[i].getSingerName()==singerName){
                return new Music[]{musics[i]};
            }
        }
        return null;
    }
}
