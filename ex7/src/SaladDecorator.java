public class SaladDecorator extends HamburgerDecorator {
    public SaladDecorator(Hamburger hamburger){
        super(hamburger);
    }

    @Override
    public String serve() {
        return super.serve() + decorateWithSalad();
    }

    private String decorateWithSalad(){
        return " with salad";
    }
}
