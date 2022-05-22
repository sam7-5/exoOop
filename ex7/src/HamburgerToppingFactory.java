public class HamburgerToppingFactory {
    public static Hamburger addTopping(String topping, Hamburger hamburger){
        if (topping.equalsIgnoreCase("ch")) return new ChipsDecorator(hamburger);
        if (topping.equalsIgnoreCase("or")) return new OnionRingsDecorator(hamburger);
        if (topping.equalsIgnoreCase("sa")) return new SaladDecorator(hamburger);
        if (topping.equalsIgnoreCase("fe")) return new FriedEggDecorator(hamburger);

        throw new RuntimeException("wrong topping");
    }
}
