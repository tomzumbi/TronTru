public class Main {
    public static void main(String[] args) {
        HinhTru hinhTru = new HinhTru();

        HinhTron hinhTron = new HinhTron();
        hinhTron.setBankinh(2);
        hinhTru.setBankinh(3);
        hinhTru.setChieucao(2);
        System.out.println(hinhTron.toString());
        System.out.println(hinhTru.toString());
    }
}