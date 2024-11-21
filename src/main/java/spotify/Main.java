package spotify;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MusicManeger musicManeger=new MusicManeger();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("1.Musiqi elvae et");
            System.out.println("---");
            System.out.println("2.musiqini sil");
            System.out.println("---");
            System.out.println("3.Musiqi update et");
            System.out.println("---");
            System.out.println("4.Musiqinin melumatlarin getir");
            System.out.println("---");
            System.out.println("5.musiqi siyahisin getir");
            System.out.println("---");
            System.out.println("6.Sistemden cix");

            System.out.println("Secmek isdediyiniz emeliyyati daxil edin: ");
            int a= scanner.nextInt();

            switch (a){
                case 1:
                    System.out.println("id'ni daxil et");
                    int id= scanner.nextInt();
                    System.out.println("musiqinin adini daxil et");
                    System.out.println("---");
                    String musicName= scanner.nextLine();
                    System.out.println("musiqicinin adini daxil et");
                    System.out.println("---");
                    String singerName= scanner.nextLine();
                    System.out.println("odenis usulunu secin");
                    System.out.println("---");
                    String odenisUsulu= scanner.nextLine();
                    System.out.println("premium hesab olub olmadigini daxil edin");
                    boolean isPremium= Boolean.parseBoolean(scanner.next());
                    musicManeger.add(new Music(id, musicName,singerName,odenisUsulu,isPremium));
                    break;


                case 2:
                    System.out.println("silmek isdediyinin musiqinin mugennisin qeyd edin");
                    singerName= scanner.next();
                    musicManeger.delete(singerName);
                    break;


                case 3:
                    System.out.println("uptade edeceyin musiqinin id sini daxil et");
                    id= scanner.nextInt();
                    System.out.println("musiqinin adini daxil et");
                    musicName= scanner.next();
                    System.out.println("musiqicinin adini daxil et");
                    singerName= scanner.next();
                    System.out.println("odenis usulunu secin");
                    odenisUsulu= scanner.next();
                    System.out.println("premium hesab olub olmadigini daxil edin");
                    isPremium= Boolean.parseBoolean(scanner.next());
                    musicManeger.uptade(id,musicName,singerName,odenisUsulu,isPremium);
                    break;


                case 4:
                    System.out.println("melumatlarin getireceyimiz musiqinin mugennisi adin qeyd edin");
                    singerName= scanner.next();
                    musicManeger.getMusic(singerName);
                    break;


                case 5:
                    Music[] musics=musicManeger.getMusics();
                    for (int i=0; i< musics.length;i++){
                        if (musics[i]!=null){
                            System.out.println(musics[i]);
                        }
                    }
                    break;


                case 6:
                    System.out.println("sistemmden cixdi");
                    scanner.close();
                    return;
                default:
                    System.out.println("input dogru deyil");

            }
        }

    }
}
