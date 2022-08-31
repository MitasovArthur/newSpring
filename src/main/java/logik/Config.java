package logik;

import impl.audio.Sony;
import impl.car.Audi;
import impl.navigation.Garmin;
import interfaces.AudioSystems;
import interfaces.NavigationSystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public AudioSystems sonyAudio() {
        return new Sony();
    }

    @Bean
    public NavigationSystem garminNavigation() {
        return new Garmin();
    }

    @Bean
    public Audi car(AudioSystems audioSystems, NavigationSystem navigationSystem) {
        return new Audi(audioSystems, navigationSystem);
    }
}
