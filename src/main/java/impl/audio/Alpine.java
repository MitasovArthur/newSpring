package impl.audio;

import interfaces.AudioSystems;

public class Alpine implements AudioSystems {
    @Override
    public void playCD() {
        System.out.println("**********************");
        System.out.println("Music from alpine CD ");
        System.out.println("**********************");
    }

    @Override
    public void playRadio() {
        System.out.println("**********************");
        System.out.println("Radio from alpine radio ");
        System.out.println("**********************");
    }
}
