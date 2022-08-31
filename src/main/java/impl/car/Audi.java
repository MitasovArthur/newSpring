package impl.car;

import interfaces.AudioSystems;
import interfaces.Car;
import interfaces.NavigationSystem;

public class Audi implements Car {
    private AudioSystems audioSystems;
    private NavigationSystem navigationSystem;

    public Audi(AudioSystems audioSystems, NavigationSystem navigationSystem) {
        this.audioSystems = audioSystems;
        this.navigationSystem = navigationSystem;
    }

    public Audi() {

    }

    public void init() {
        System.out.println("Composing your new car...");
    }

    @Override
    public void move() {
        System.out.println("**********************");
        System.out.println("Audi in action");
        System.out.println("**********************");
    }

    public AudioSystems getAudioSystems() {
        return audioSystems;
    }

    public void setAudioSystems(AudioSystems audioSystems) {
        this.audioSystems = audioSystems;
    }

    public NavigationSystem getNavigationSystem() {
        return navigationSystem;
    }

    public void setNavigationSystem(NavigationSystem navigationSystem) {
        this.navigationSystem = navigationSystem;
    }
}
