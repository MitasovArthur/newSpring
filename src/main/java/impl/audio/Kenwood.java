package impl.audio;

import interfaces.AudioSystems;

public class Kenwood implements AudioSystems {
    @Override
    public void playCD() {
        System.out.println("**********************");
        System.out.println("Music from kenwood CD ");
        System.out.println("**********************");
    }

    @Override
    public void playRadio() {
        System.out.println("**********************");
        System.out.println("Radio from kenwood radio ");
        System.out.println("**********************");

    }
}
