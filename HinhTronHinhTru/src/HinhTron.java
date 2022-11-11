public class HinhTron {
    private double bankinh;
    private String mausac;

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }
    public double dientich(){
        return bankinh*bankinh*3.14;
    }
    public String toString(){
        return "hinh tron co ban kinh: " + bankinh + "va dien tich: " + dientich();
    }
}
