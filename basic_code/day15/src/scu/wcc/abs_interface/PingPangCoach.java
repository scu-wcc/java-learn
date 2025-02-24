package scu.wcc.abs_interface;

public class PingPangCoach extends Coach implements SpeakEnglish{
    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }
}
