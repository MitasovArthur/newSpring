package impl.navigation;

import interfaces.NavigationSystem;

public class Pioner implements NavigationSystem {
    @Override
    public boolean createRoute() {
        System.out.println("**********************");
        System.out.println("Route create by Pioner ");
        System.out.println("**********************");
        return true;
    }
}
