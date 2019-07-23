package session1;

import java.util.Scanner;

public class Session1 {
    
    static void Dequy1(int n){
        if(n > 0){
            System.out.print(n + " ");
            Dequy1(n - 1);
        }
        else{
            System.out.println(0);
        }
    }
    
    static void SoNguyenTo(int n){
        int i, count = 0;
        for(i = 2; i <= n-1; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count > 0){
            System.out.println(n + " không phải là số nguyên tố.");
        }
        else{
            System.out.println(n + " là số nguyên tố.");
        }
    }
    
    static void GPTB1(int m, int n){
        int a, b;
        float x;
        
        a = m;
        b = n;
        
        if(a == 0){
            if(b == 0)
                System.out.println("Phuong trinh co vo so nghiem.");
            else
                System.out.println("Phuong trinh vo nghiem.");
        }
        else{
            x = (float) -b/a;
            System.out.println("Nghiem cua phuong trinh la: " + x);
        }
    }
    
    static void GPTB1(){
        int a, b;
        float x;
        Scanner nhap = new Scanner(System.in);
        
        System.out.print("Nhap a: ");
        a = nhap.nextInt();
        System.out.print("Nhap b: ");
        b = nhap.nextInt();
        
        if(a == 0){
            if(b == 0)
                System.out.println("Phuong trinh co vo so nghiem.");
            else
                System.out.println("Phuong trinh vo nghiem.");
        }
        else{
            x = (float) -b/a;
            System.out.println("Nghiem cua phuong trinh la: " + x);
        }
    }
    
    static void GPTB2(){
        Scanner nhap = new Scanner(System.in);
        int a, b, c, d;
        float x, x1, x2;
        
        System.out.print("Nhap a: ");
        a = nhap.nextInt();
        System.out.print("Nhap b: ");
        b = nhap.nextInt();
        System.out.print("Nhap c: ");
        c = nhap.nextInt();
        
        if(a == 0){
            GPTB1(b, c);
        }
        else{
            d = b*b - 4*a*c;
            if(d < 0)
                System.out.println("Phuong trinh vo nghiem.");
            else if( d == 0){
                x = (float) -b /(2*a);
                System.out.println("Phuong trinh co nghiem kep: " + x);
            }
            else{
                x1 = (float) (-b + Math.sqrt(d)) / (2*a);
                x2 = (float) (-b - Math.sqrt(d)) / (2*a);
                System.out.println("Nghiem thu nhat: " + x1);
                System.out.println("Nghiem thu hai: " + x2);
            }
        }
    }
    
    static void TinhEmuX(){
        Scanner nhap = new Scanner(System.in);
        float kq, epsilon, x, T;
        int n;
        
        System.out.print("Nhap x: ");
        x = nhap.nextFloat();
        System.out.print("Nhap sai so epsilon: ");
        epsilon = nhap.nextFloat();
        
        kq = 1;
        n = 1;
        T = x;
        
        while(T > epsilon){
            kq = kq + T;
            n++;
            T = T * (x / n);
        }
        System.out.println("E mu " + x + " =: " + kq);
    }
    
    static void DientichHinhVuong(){
        Scanner nhap = new Scanner(System.in);
        float a, s;
        
        System.out.print("Nhap do dai canh: ");
        a = nhap.nextFloat();
        s = a*a;
        System.out.println("Dien tich hinh vuong la: " + s);
    }
    
    static void DientichHinhTron(){
        float R, s;
        
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        R = nhap.nextFloat();
        s = (float) (R * R * Math.PI);
        System.out.println("Dien tich hinh tron la: " + s);
    }
    
    static void DientichHinhThang(){
        float a, b, h, s;
        
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap canh tren: ");
        a = nhap.nextFloat();
        System.out.print("Nhap canh duoi: ");
        b = nhap.nextFloat();
        System.out.print("Nhap chieu cao: ");
        h = nhap.nextFloat();
        s = (a + b) * h / 2;
        System.out.println("Dien tich hinh thang la: " + s);
    }
    
    static int DaysoFibonaci(int n){
        int f;
        
        if(n <= 2)
            f = 1;
        else
            f = DaysoFibonaci(n-2) + DaysoFibonaci(n-1);
        return f;
    }
    
    static void TinhGiaiThua(){
        Scanner nhap = new Scanner(System.in);
        int n, gt = 1;
        
        System.out.print("Nhap N: ");
        n = nhap.nextInt();
        
        while(n < 0){
            System.out.println("Nhap lai. N phai la so duong.");
            n = nhap.nextInt();
        }
        
        if(n == 0)
            gt = 1;
        else{
            for(int i = 1; i <= n; i++){
                gt = gt * i;
            }
        }
        
        System.out.println(n + " giai thua bang: " + gt);
    }
    
    static int TinhGiaiThua(int n){
        int f;
        
        if(n == 0)
            f = 1;
        else{
            f = n * TinhGiaiThua(n-1);
        }
        return f;
    }
    
    static void HinhCau(){
        Scanner nhap = new Scanner(System.in);
        float R, S, V;
        
        System.out.print("Nhap ban kinh: ");
        R = nhap.nextFloat();
        S = (float) (4 * Math.PI * (R *R));
        V = (S * R) / 3;
        System.out.println("Dien tich hinh cau: " + S);
        System.out.println("The tich hinh cau: " + V);
    }
    
    static void InHoaDon(){
        int stt, ngay, thang, nam;
        float tong = 0;
        String ten1, ten2;
        String[] mh = new String[10];
        float[] dg = new float[10];
        float[] tien = new float[10];
        int[] sl = new int[10];
        String s;
        
        Scanner nhap = new Scanner(System.in);
        System.out.print("So mat hang khach mua: ");
        stt = nhap.nextInt();
        System.out.print("Ngay: ");
        ngay = nhap.nextInt();
        System.out.print("Thang: ");
        thang = nhap.nextInt();
        System.out.print("Nam: ");
        nam = nhap.nextInt();
        s = nhap.nextLine();
        System.out.print("Nguoi lap hoa don: ");
        ten1 = nhap.nextLine();
        System.out.print("Nguoi ban hang: ");
        ten2 = nhap.nextLine();
        System.out.println();
        for(int i = 1 ; i <= stt; i++){
            System.out.print("Mat hang thu " + i + ": ");
            mh[i] = nhap.nextLine();
            System.out.print("So luong: ");
            sl[i] = nhap.nextInt();
            System.out.print("Don gia: ");
            dg[i] = nhap.nextInt();
            tien[i] = dg[i] * sl[i];
            tong = tong + tien[i];
            s = nhap.nextLine();
        }
        System.out.println();
        System.out.println("          HOA DON BAN HANG          ");
        System.out.println("             ---o0o---              ");
        System.out.println();
        System.out.println("STT     Danh Muc     SL     Don Gia     Thanh Tien");
        for(int i = 1; i <= stt; i++){
            System.out.println(" " + i + "      " + mh[i] + "     " + sl[i]
            + "     " + dg[i] + "     " + tien[i]);
        }
        System.out.println("Tong: " + tong);
        System.out.println();
        System.out.println("Ha Noi, ngay " + ngay + " thang " + thang
        + " nam " + nam);
        System.out.println("Nguoi lap hoa don: " + ten1);
        System.out.println("Nguoi ban hang: " + ten2);
    }
    
    static void Luythua(){
        int i, y;
        float lt, x;
        Scanner nhap = new Scanner(System.in);
        
        System.out.print("Nhap x: ");
        x = nhap.nextFloat();
        System.out.print("Nhap y: ");
        y = nhap.nextInt();
        
        
        if(((x == 0) && (y == 0)) || ((x == 0) && (y < 0))){
            System.out.println("Math error.");
        }
        else{
            lt = 1;
            if(y < 0){
                for(i = 1; i <= Math.abs(y); i++)
                    lt = lt * x;
                lt = 1 / lt;
            }else if(y == 0)
                lt = 1;
            else{
                for(i = 1; i <= y; i++)
                    lt = lt * x;
            }
            System.out.println("Ket qua cua " + x + " mu " + y + ": " + lt);
        }
    }
    
    static float Luythua(float x, int y){
        float lt;
        
        if(x == 0){
            if((y == 0) || (y < 0)){
                System.out.println("Math error.");
                return 0;
            }
            else{
                lt = 0;
                return lt;
            }
        }
        else{
            if(y < 0){
                lt = (1 / x) * Luythua(x, y+1);
            }
            else if(y > 0){
                lt = x * Luythua(x, y-1);
            }
            else
                lt = 1;
            return lt;
        }
    }
    
    static void Mang1Chieu(){
        Scanner nhap = new Scanner(System.in);
        int n;
        int[] a = new int[50];
        
        System.out.print("Nhap N: ");
        n = nhap.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.print("a[" + i + "]=: ");
            a[i] = nhap.nextInt();
        }
        
        for(int i = 1; i <= n; i++)
            System.out.println(a[i]);
    }
    
    static void Mang2Chieu(){
        Scanner nhap = new Scanner(System.in);
        int[][] a = new int[10][10];
        int m, n, i, j;
        
        System.out.print("Nhap M: ");
        m = nhap.nextInt();
        System.out.print("Nhap N: ");
        n = nhap.nextInt();
        for(i = 1; i <= m; i++){
            for(j = 1; j <= n; j++){
                System.out.print("a[" + i + "][" + j + "]=: ");
                a[i][j] = nhap.nextInt();
            }
        }
        for(i = 1; i <= m; i++){
            System.out.println();
            for(j = 1; j <= n; j++)
                System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
    
    static void Mang2Chieu2(){
        Scanner nhap = new Scanner(System.in);
        int m, n, i, j, x, y;
        int[][] a = new int[10][10];
        
        System.out.print("Nhap so sinh vien: ");
        m = nhap.nextInt();
        System.out.print("Nhap so mon hoc cua moi sinh vien: ");
        n = nhap.nextInt();
        for(i = 1; i <= m; i++){
            for(j = 1; j <= n; j++){
                System.out.print("a[" + i + "][" + j + "]=: ");
                a[i][j] = nhap.nextInt();
            }
        }
        System.out.print("Tim diem cua sinh vien thu may: ");
        x = nhap.nextInt();
        System.out.print("Diem mon thu may: ");
        y = nhap.nextInt();
        System.out.println("Ket qua: " + a[x][y]);
    }
    
    static void SelectionSort(){
        Scanner nhap = new Scanner(System.in);
        int n, i, j, x, m;
        int[] a = new int[50];
        
        System.out.print("Nhập số phần tử của mảng: ");
        n = nhap.nextInt();
        for(i = 0; i < n; i++){
            System.out.print("a[" + (i + 1) + "]=: ");
            a[i] = nhap.nextInt();
        }
        
        for(i = 0; i < (n - 1); i++){
            m = i;
            for(j = (i + 1); j < n; j++){
                if(a[j] < a[m]){
                    m = j;
                }
            }
            
            if(m != i){
                x = a[i];
                a[i] = a[m];
                a[m] = x;
            }
        }
        
        
        for(i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    static void InterchangeSort(){
        Scanner nhap = new Scanner(System.in);
        int n, i, j, x;
        int[] a = new int[50];
        
        System.out.print("Nhập số phần tử của mảng: ");
        n = nhap.nextInt();
        for(i = 0; i < n; i++){
            System.out.print("a[" + (i + 1) + "]=: ");
            a[i] = nhap.nextInt();
        }
        
        for(i = 0; i < (n - 1); i++){
            for(j = (i + 1); j < n; j++){
                if(a[j] < a[i]){
                    x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
        
        for(i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    static void InsertionSort(){
        Scanner nhap = new Scanner(System.in);
        int n, i, j, x;
        int[] a = new int[50];
        
        System.out.print("Nhap so phan tu: ");
        n = nhap.nextInt();
        for(i = 0; i < n; i++){
            System.out.print("a[" + i + "]=: ");
            a[i] = nhap.nextInt();
        }
        
        for(i = 1; i < n; i++){
            x = a[i];
            j = i - 1;
            while((j >= 0) && (a[j] > x)){
                a[j+1] = a[j];
                j = j - 1;
            }
            a[j+1] = x;
        }
        
        for(i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    
    static void BubbleSort(){
        Scanner nhap = new Scanner(System.in);
        int n, i, j, x;
        int[] a = new int[50];
        
        System.out.print("Nhap so phan tu: ");
        n = nhap.nextInt();
        for(i = 1; i <= n; i++){
            System.out.print("a[" + i + "]=: ");
            a[i] = nhap.nextInt();
        }
        
        for(i = 1; i <= (n-1); i++){
            for(j = n; j >= (i+1); j--){
                if(a[j] < a[j-1]){
                    x = a[j];
                    a[j] = a[j-1];
                    a[j-1] = x;
                }
            }
        }
        for(i = 1; i <= n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    
    static void QuickSort(int[] a, int low, int hight){
        int i, j, k, x, tg;
        
        
        i = low;
        j = hight;
        k = (i+j) / 2;
        x = a[k];
        while(i < j){
            while(a[i] < x){
                i++;
            }
            while(a[j] > x){
                j--;
            }
            if(i <= j){
                tg = a[i];
                a[i] = a[j];
                a[j] = tg;
                i++;
                j--;
            }
        }
        if(low < j)
            QuickSort(a, low, j);
        if(i < hight)
            QuickSort(a, i, hight);
    }
    
    static void BinarySort(int[] a, int n){
        int i, j, bot, top, mid, T;
        
        for(i = 1; i < n; i++){
            T = a[i];
            bot = 0;
            top = i - 1;
            while(bot <= top){
                mid = (bot + top) / 2;
                if(T < a[mid])
                    top = mid - 1;
                else
                    bot = mid + 1;
            }
            for(j = (i - 1); j >= bot; j--)
                a[j+1] = a[j];
            a[bot] = T;
        }
    }
    
    static void ThapHaNoi(int n, String a, String b, String c){
        
        if(n == 1){
            System.out.println(a + " -> " + b + ": " + n + " dia.");
        }
        else{
            ThapHaNoi((n-1), a, c, b);
            ThapHaNoi(1, a, b, c);
            ThapHaNoi((n-1), c, b, a);
        }
    }
    
    static void TimSoNgay(){
        Scanner nhap = new Scanner(System.in);
        int ngay, thang, nam, du;
        
        System.out.print("Nhap thang may: ");
        thang = nhap.nextInt();
        System.out.print("Nam nao: ");
        nam = nhap.nextInt();
        switch(thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                ngay = 31;
                System.out.println("Thang " + thang + " nam " + nam +
                        " co " + ngay + " ngay.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                ngay = 30;
                System.out.println("Thang " + thang + " nam " + nam +
                        " co " + ngay + " ngay.");
                break;
            case 2:
                du = (nam % 4);
                switch(du){
                    case 0:
                        ngay = 29;
                        System.out.println("Thang " + thang + " nam " + nam +
                        " co " + ngay + " ngay.");
                        break;
                    case 1:
                    case 2:
                    case 3:
                        ngay = 28;
                        System.out.println("Thang " + thang + " nam " + nam +
                        " co " + ngay + " ngay.");
                        break;
                }
                break;
            default:
                System.out.println("Thang chi co tu 1 den 12.");
        }
    }
    
    static void TinhLaiSuat(){
        Scanner nhap = new Scanner(System.in);
        float a, s, lai, tien;
        int i, thang;
        
        System.out.print("Nhap so tien gui vao: ");
        a = nhap.nextFloat();
        System.out.print("Nhap lai suat hang thang: ");
        s = nhap.nextFloat();
        System.out.print("Gui trong bao nhieu thang: ");
        thang = nhap.nextInt();
        tien = a;
        for(i = 1; i <= thang; i++){
            lai = tien * s;
            tien = tien + lai;
        }
        System.out.println("So tien nhan duoc: " + tien);
    }
    
    static void UocChungLonNhat(int a, int b){
        while(a != b){
            if(a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        
        System.out.println("Ước chung lớn nhất của 2 số là: " + a);
    }
    
    static void Sort(int[] a, int i, int j, int n, int m){
        int t;
    
        if(j < n){
            if(a[i] > a[j]){
                t = a[i];
                a[i] = a[j];
                a[j] = t;
                    
                m++;
                j = i+m;
                Sort(a, i, j, n, m);
            }
            m++;
            j = i+m;
            Sort(a, i, j, n, m);
        }
        i++;
        m = 1;
        j = i+m;
        SortWithoutLoop(a, i, j, n, m);
    }
    
    static void SortWithoutLoop(int[] a, int i, int j, int n, int m){
        if(i < n){
            Sort(a, i, j, n, m);
        }
    }
    
    static void sum(int a, long b){
        System.out.println(a + b);
        System.out.println("Kieu int");
    }
    
    static void sum(long a, int b){
        System.out.println(a + b);
        System.out.println("Kieu long");
    }
    
    public static void main(String[] args) {
        int a = 32, b = 12;
        UocChungLonNhat(a, b);
    }
}