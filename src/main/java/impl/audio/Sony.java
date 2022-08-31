package impl.audio;

import interfaces.AudioSystems;
import lombok.NoArgsConstructor;

public class Sony implements AudioSystems {
    @Override
    public void playCD() {
        System.out.println("**********************");
        System.out.println("Music from sony CD ");
        System.out.println("**********************");
    }

    @Override
    public void playRadio() {
        System.out.println("**********************");
        System.out.println("Radio from sony radio ");
        System.out.println("**********************");
    }
}
