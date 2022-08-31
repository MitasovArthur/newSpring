package impl.navigation;

import interfaces.NavigationSystem;

public class Navitel implements NavigationSystem {

    @Override
    public boolean createRoute() {
        System.out.println("**********************");
        System.out.println("Route create by Navitel ");
        System.out.println("**********************");
        return true;
    }
}
