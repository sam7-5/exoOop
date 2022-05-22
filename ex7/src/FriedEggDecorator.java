public class FriedEggDecorator extends HamburgerDecorator {
    public FriedEggDecorator(Hamburger hamburger){
        super(hamburger);
    }

    @Override
    public String serve() {
        return super.serve() + decorateWithFriedEgg();
    }

    private String decorateWithFriedEgg(){
        return " with fried egg";
    }
}
