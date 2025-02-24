package scu.wcc.abs_interface;

public class PingPangPlayer extends Player implements SpeakEnglish{

    public PingPangPlayer() {

    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study(){
        System.out.println("学打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }
}
