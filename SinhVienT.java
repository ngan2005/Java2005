import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class SinhVienT {
   private String hoTen;
   private String ngaySinh;
   private double diem1, diem2, diem3;
   SinhVienT(){
       this.hoTen=" ";
       this.ngaySinh=" ";
       this.diem1=0.0;
       this.diem2=0.0;
       this.diem3=0.0;
   }
   public void In(){
       System.out.println(hoTen + " " + ngaySinh+" "+diem1+" "+diem2+" "+diem3);
   }
   public void nhap(){
       Scanner  sc=new Scanner(System.in);
       this.hoTen=sc.nextLine();
       this.ngaySinh=sc.nextLine();
       this.diem1=sc.nextDouble();
       this.diem2=sc.nextDouble();
       this.diem3=sc.nextDouble();
       sc.nextLine();
   }
    public void XepDiem() {
        Double[] a = {diem1, diem2, diem3}; // Dùng Double (phải viết hoa)
        Arrays.sort(a, Collections.reverseOrder());
        for (double x : a) System.out.println(x);
    }
    public String chuanHoaTen(String hoTen){
        StringBuilder sb = new StringBuilder(hoTen.trim());
        if (sb.length() > 50) {
            sb.delete(50, sb.length()); // ✅ an toàn: cắt từ 50 trở đi
        }
        this.hoTen = sb.toString();
        return this.hoTen;
    }
    public String ngayChuanHoa(String  ngaySinh) {
       StringBuilder sb = new StringBuilder(ngaySinh);
       if(sb.charAt(1) == '/') {
           sb.insert(0, "0");
       }
       if(sb.charAt(4) == '/') {
           sb.insert(3, "0");
       }
       return this.ngaySinh=sb.toString();
   }

    public static void main(String[] args) {
        SinhVienT sv=new SinhVienT();
        sv.nhap();
        sv.chuanHoaTen(sv.hoTen);
        sv.ngayChuanHoa(sv.ngaySinh);
        sv.XepDiem();
        sv.In();
    }
}

