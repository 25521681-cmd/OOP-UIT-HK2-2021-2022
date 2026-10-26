import java.util.HashMap;
import java.util.Scanner;
public class DanhSach_Sach {
    private Sach[] ds; private Integer SoLuongSach;
    private HashMap<String,Integer> Tim_Kiem_Sach;
    public void Nhap(Scanner inp)
    {
        System.out.print("Hay nhap so luong sach: ");
        SoLuongSach = Integer.parseInt(inp.next());
        ds = new Sach[SoLuongSach];
        Tim_Kiem_Sach = new HashMap<>();
        for(int i = 0; i<SoLuongSach; i+=1)
        {
            System.out.print("Nhan 1/2 tuong ung voi sach giao khoa/sach tham khao: ");
            Integer Loai = Integer.parseInt(inp.next());
            inp.nextLine();
            if(Loai == 1)
            {
                Sach sach = new SachGiaoKhoa();
                sach.Nhap(inp);
                Tim_Kiem_Sach.put(sach.GetTenSach(), i);
                ds[i] = sach;
            }
            else
            {
                Sach sach = new SachThamKhao();
                sach.Nhap(inp);
                Tim_Kiem_Sach.put(sach.GetTenSach(), i);
                ds[i] = sach;
            }
        }
    }
    public void Xuat()
    {
        for(int i = 0; i<SoLuongSach; i+=1)
        {
            System.out.println("Thong tin sach thu " +(i+1) + ":");
            ds[i].Xuat();
        }
    }
    public void TongTienChoTungLoaiSach()
    {
        Integer TongTien_SGK = 0;
        Integer TongTien_STK = 0;
        for(int i = 0; i<SoLuongSach; i+=1)
        {
            if(ds[i].GetLoai() == 1)
            {
                TongTien_SGK += ds[i].GetTien();
            }
            else
            {
                TongTien_STK += ds[i].GetTien();
            }
        }
        System.out.println("Tong tien sach giao khoa la: " + TongTien_SGK);
        System.out.println("Tong tien sach tham khao la: " + TongTien_STK);
    }
    public void SachTongTienItNhat()
    {
        Integer so_tien_it_nhat = Integer.MAX_VALUE;
        Integer vi_tri_sach = 0;
        for(int i = 0; i<SoLuongSach; i+=1)
        {
            if(ds[i].GetTien() < so_tien_it_nhat)
            {
                so_tien_it_nhat = ds[i].GetTien();
                vi_tri_sach = i;
            }
        }
        System.out.println("Sach co tong tien it nhat co thong tin la: ");
        ds[vi_tri_sach].Xuat();
    }
    public void TimSach(Scanner inp)
    {
        inp.nextLine();
        System.out.println("Hay nhap ten sach can tim: ");
        String TenSachCanTim = inp.nextLine();
        if(Tim_Kiem_Sach.containsKey(TenSachCanTim))
        {
            Integer DiaChi = Tim_Kiem_Sach.get(TenSachCanTim);
            ds[DiaChi].Xuat();
        }
        else
        {
            System.out.println("Khong tim thay sach");
        }
    }
}
