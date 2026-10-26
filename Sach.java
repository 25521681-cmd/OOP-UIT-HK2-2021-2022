import java.util.Scanner;  
abstract public class Sach {
    protected String MaSach; protected String TenSach;
    protected String NhaXB; protected Integer SoLuong;
    protected Integer DonGia;
    abstract public void Nhap(Scanner inp);
    abstract public void Xuat();
    abstract Integer GetLoai();
    abstract Integer GetTien();
    abstract String GetTenSach();
}
