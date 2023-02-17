package transport;

public enum WeightUp {
    N1(null,3.5F),N2(3.5F,12F),N3(12F,null);

    private Float low;
    private Float max;
    WeightUp(Float low ,Float max){
        this.low=low;
        this.max=max;
    }

    public Float getLow() {
        return low;
    }

    public void setLow(Float low) {
        this.low = low;
    }

    public Float getMax() {
        return max;
    }

    public void setMax(Float max) {
        this.max = max;
    }

    @Override
    public String toString() {
        if (getLow() == null) {
           return "грузоподьемность до" + getMax() + "границы";
        }
        if (getMax() == null) {
            return "грузоподьемность от" + getLow() + "границы";
        } else {
            return "грузоподьемность от" + getLow() + "границы и до" + getMax() + "границы";
        }

    }

}

