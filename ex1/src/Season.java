public enum Season {
    WINTER, SPRING, SUMMER, FALL;

    private static Season[] vals = values();
    public Season next()
    {
        return vals[(this.ordinal()+1) % vals.length];
    }
}
