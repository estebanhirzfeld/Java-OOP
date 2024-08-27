public class Movie {
    String name;
    boolean has_sage;
    double rate;

    public Movie(String name) {
        this.name = name;
    }

    public boolean isHas_sage() {
        return has_sage;
    }

    public void setHas_sage(boolean has_sage) {
        this.has_sage = has_sage;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
