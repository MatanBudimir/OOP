package fraction;

public class Fraction {
    private final int brojnik;
    private final int nazivnik;

    public Fraction(int brojnik, int nazivnik) {
        this.brojnik = (nazivnik > 0) ? brojnik : -brojnik;
        this.nazivnik = Math.abs(nazivnik);
    }

    public Fraction add(Fraction f) {
        int zajednicki = zajednickiDjeljitelj(nazivnik, f.nazivnik);
        int prvi = zajednicki / nazivnik;
        int drugi = zajednicki / f.nazivnik;
        int br = brojnik * prvi + f.brojnik * drugi;
        int djeljitelj = gcd(br, zajednicki);

        return new Fraction(br / djeljitelj, zajednicki / djeljitelj);
    }

    public Fraction subtract(Fraction f) {
        int zajednicki = zajednickiDjeljitelj(nazivnik, f.nazivnik);
        int prvi = zajednicki / nazivnik;
        int drugi = zajednicki / f.nazivnik;
        int br = brojnik * prvi - f.brojnik * drugi;
        int djeljitelj = Math.abs(gcd(br, zajednicki));

        return new Fraction(br / djeljitelj, zajednicki / djeljitelj);
    }

    public Fraction invert() {
        return new Fraction(nazivnik, brojnik);
    }

    public Fraction negate() {
        return new Fraction(-brojnik, nazivnik);
    }

    public Fraction multiply(Fraction f) {
        int br = brojnik * f.brojnik;
        int naz = nazivnik * f.nazivnik;
        int zajednicki = gcd(br, naz);

        return new Fraction(br / zajednicki, naz / zajednicki);
    }

    public Fraction divide(Fraction f) {
        return multiply(new Fraction(f.nazivnik, f.brojnik));
    }

    private int zajednickiDjeljitelj(int x, int y) {
        if (x == y)
            return x;

        int veci = Math.max(x, y);
        int manji = Math.min(x, y);

        if (veci % manji == 0)
            return veci;

        return x * y;
    }

    private static int gcd(int x, int y) {
        return (y == 0) ? x : gcd(y, x % y);
    }

    @Override
    public String toString() {
        return String.format("%d / %d", brojnik, nazivnik);
    }
}
