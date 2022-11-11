public class HinhTru extends HinhTron{
    private double chieucao;
    public HinhTru(){

    }

    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }
    public double thetich(){
        return dientich()*chieucao;
    }
    @Override
    public String toString() {
        return "hinh tru co ban kinh" + getBankinh() + "chieu cao" + chieucao + "the tich" + thetich() ;
    }

}
