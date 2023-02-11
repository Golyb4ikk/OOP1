package transport;

public enum Capacity {
    VERYSMALL(0,10),
    SMALL(0,25),
    NORM(25,50),
    BIG(50,80),
    VERYBIG(80,120);

    private  Integer low;
    private  Integer max;
    Capacity(Integer low,Integer max) {
        this.low=low;
        this.max=max;
    }

    public Integer getLow() {
        return low;
    }

    public void setLow(Integer low) {
        this.low = low;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }
    @Override
    public String toString() {
        if (getLow() == null) {
            return "вместимость до" + getMax() + "границы";
        }
        if (getMax() == null) {
            return "вместимость от" + getLow() + "границы";
        } else {
            return "вместимость от" + getLow() + "границы и до" + getMax() + "границы";
        }

    }
}
