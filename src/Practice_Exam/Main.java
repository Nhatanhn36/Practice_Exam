package Practice_Exam;

public class Main {
    public static void main(String[] args){
        Complex cp1 = new Complex();
        Complex cp2 = new Complex();
        Complex cp = new Complex();

        //nhap
        System.out.println("Nhap vao so phuc 1: ");
        cp1.input();
        System.out.println("Nhap vao so thuc 2: ");
        cp2.input();
        //hien thi
        System.out.println("So thuc 1 là: ");
        cp1.hienthi();
        System.out.println("So thuc 2 la: ");
        cp2.hienthi();

        cp = cp1.Add(cp2);
        System.out.println("Tong 2 so thuc: " );
        cp.hienthi();
        cp = cp1.Subtract(cp2);
        System.out.println("Hieu 2 so thuc: ");
        cp.hienthi();
        cp = cp1.Multiply(cp2);
        System.out.println("Tich 2 so thuc: " );
        cp.hienthi();
        cp = cp1.Divide(cp2);
        System.out.println("Thuong 2 so thuc: ");
        cp.hienthi();
    }
}
