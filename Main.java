import java.util.Scanner;  
public class Main{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        DanhSach_Sach DS = new DanhSach_Sach();
        DS.Nhap(inp);
        DS.Xuat();
        DS.TongTienChoTungLoaiSach();
        DS.SachTongTienItNhat();
        DS.TimSach(inp);
        inp.close();
    }
}