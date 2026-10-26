import java.util.Scanner;  
public class SachThamKhao extends Sach{
    protected Integer TienThue;
    public void Nhap(Scanner inp)
    {
        System.out.print("Hay nhap ma sach: ");
        MaSach = inp.nextLine();
        System.out.print("Hay nhap ten sach: ");
        TenSach = inp.nextLine();
        System.out.print("Hay nhap so luong sach: ");
        SoLuong = Integer.parseInt(inp.next());
        System.out.print("Hay nhap don gia sach: ");
        DonGia = Integer.parseInt(inp.next());
        System.out.print("Hay nhap tien thue: ");
        TienThue = Integer.parseInt(inp.next());
        System.out.println();
    }
    public void Xuat()
    {
        System.out.println("Ma sach la: " + MaSach);
        System.out.println("Ten sach la: " + TenSach);
        System.out.println("So luong sach la: " + SoLuong);
        System.out.println("Don gia sach la: " + DonGia);
        System.out.println("Tien thue sach la: " + TienThue);
        System.out.println();
    }
    public Integer GetLoai()
    {
        return 2;
    }
    public String GetTenSach()
    {
        return TenSach;
    }
    public Integer GetTien()
    {
        return SoLuong*DonGia + TienThue;
    }
}
