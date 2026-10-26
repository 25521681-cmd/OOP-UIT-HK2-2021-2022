import java.util.Scanner;  
public class SachGiaoKhoa extends Sach{
    private Integer TinhTrang;
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
        System.out.print("Hay nhap tinh trang sach 0/1: ");
        TinhTrang = Integer.parseInt(inp.next());
        System.out.println();
    }
    public void Xuat()
    {
        System.out.println("Ma sach la: " + MaSach);
        System.out.println("Ten sach la: " + TenSach);
        System.out.println("So luong sach la: " + SoLuong);
        System.out.println("Don gia sach la: " + DonGia);
        if(TinhTrang == 1)
        {
            System.out.println("Tinh trang sach la: moi");
        }
        else
        {
            System.out.println("Tinh trang sach la: cu");
        }
        System.out.println();
    }
    public Integer GetLoai()
    {
        return 1;
    }
    public String GetTenSach()
    {
        return TenSach;
    }
    public Integer GetTien()
    {
        if(TinhTrang == 1)
        {
            return SoLuong*DonGia;
        }
        return SoLuong*DonGia/2;
    }
}
