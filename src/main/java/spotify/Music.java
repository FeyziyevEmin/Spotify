package spotify;

public class Music {
    private int id;
    private String musicName;
    private String singerName;
    private String odenisUsulu;
    private boolean isPremium;

    public  Music(int id, String musicName, String singerName,String odenisUsulu, boolean isPremium){
        this.id=id;
        this.musicName=musicName;
        this.singerName=singerName;
        this.odenisUsulu=odenisUsulu;
        this.isPremium=isPremium;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getOdenisUsulu() {
        return odenisUsulu;
    }

    public void setOdenisUsulu(String odenisUsulu) {
        this.odenisUsulu = odenisUsulu;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    @Override
    public String toString() {
        return "Music{" +
                "id=" + id +
                ", musicName='" + musicName + '\'' +
                ", singerName='" + singerName + '\'' +
                ", odenisUsulu='" + odenisUsulu + '\'' +
                ", isPremium=" + isPremium +
                '}';
    }
}
