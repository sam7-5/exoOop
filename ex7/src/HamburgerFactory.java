public class HamburgerFactory {
    public static Hamburger createHamburger(String code) {

        if (code.equals("cl")) return new ClassicHamburger();
        if (code.equals("sp")) return new SpicyHamburger();
        if (code.equals("la")) return new LambHamburger();
        if (code.equals("hm")) return new HomemadeHamburger();

        throw new RuntimeException("wrong Hamburger");
    }
}

