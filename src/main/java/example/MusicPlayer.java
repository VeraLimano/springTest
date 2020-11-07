package example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int  volume;

    public MusicPlayer(ClassicalMusic classicalBean, RockMusic rockBean) {
    }

    public String getName() {
        return name;
    }

    public int getValuem() {
        return volume;
    }

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

//    public void playMusic() {
//        System.out.println("Playing: " + music.getSong());
//    }

    public String playMusic() {
        return "Plaing: " + music1.getSong() + ", " + music2.getSong();
//        System.out.println("Plaing: " + rockMusic.getSong());

    }


}
