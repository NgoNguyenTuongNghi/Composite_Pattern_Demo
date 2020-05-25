import composite_pattern.File;
import composite_pattern.Folder;

public class App {
    public static void main(String[] args) throws Exception {
        Folder data = new Folder("Data", "19/05/2020");
        Folder toan = new Folder("Toan", "19/05/2020");
        Folder ly = new Folder("Ly", "19/05/2020");
        Folder hoa = new Folder("Hoa", "19/05/2020");
        File ds = new File("DanhSanhSV.xls", "19/05/2020");
        Folder daiso = new Folder("DaiSo", "19/05/2020");
        Folder giaitich = new Folder("GiaiTich", "19/05/2020");
        File tichphan = new File("TichPhan.docx", "19/05/2020");
        File cohoc = new File("CoHoc.pdf", "19/05/2020");
        Folder huuco = new Folder("HuuCo", "19/05/2020");
        Folder voco = new Folder("VoCo", "19/05/2020");
        File hoa12 = new File("Hoa12.pdf", "19/05/2020");
        data.add(toan);
        toan.add(daiso);
        toan.add(giaitich);
        daiso.add(tichphan);
        data.add(ly);
        ly.add(cohoc);
        data.add(hoa);
        hoa.add(huuco);
        hoa.add(voco);
        huuco.add(hoa12);
        data.add(ds);
        data.getTreeFolder();
        System.out.println(data.getTreeFolder());
    }
}
