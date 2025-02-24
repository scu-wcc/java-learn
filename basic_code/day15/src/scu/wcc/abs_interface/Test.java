package scu.wcc.abs_interface;

public class Test {
    public static void main(String[] args) {
        PingPangPlayer pps = new PingPangPlayer();
        pps.study();
        pps.speakEnglish();

        BasketballCoach bbc = new BasketballCoach();
        bbc.teach();
    }
}
