public class ChipsDecorator extends HamburgerDecorator {
    public ChipsDecorator(Hamburger hamburger){
        super(hamburger);
    }

    @Override
    public String serve() {
        return super.serve() + decorateWithChips();
    }

    private String decorateWithChips(){
        return " with chips";
    }
}
