public abstract class HamburgerDecorator implements Hamburger {
    public Hamburger hamburger;
    public HamburgerDecorator(Hamburger newHamburger) { this.hamburger = newHamburger;}

    @Override
    public String serve(){
        return hamburger.serve();
    }
}
