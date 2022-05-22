public class OnionRingsDecorator extends HamburgerDecorator {
    public OnionRingsDecorator(Hamburger hamburger){
        super(hamburger);
    }

    @Override
    public String serve() {
        return super.serve() + decorateWithOnionRings();
    }

    private String decorateWithOnionRings(){
        return " with onion rings";
    }

}
