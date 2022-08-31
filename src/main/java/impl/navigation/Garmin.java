package impl.navigation;

import interfaces.NavigationSystem;

public class Garmin implements NavigationSystem {
    @Override
    public boolean createRoute() {
        System.out.println("**********************");
        System.out.println("Route create by Garmin");
        System.out.println("**********************");
        return true;
    }
}
