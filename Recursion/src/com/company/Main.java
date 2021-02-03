package com.company;

public class Main {

    public static void printF(){
        System.out.println("F");
        printF();
    }
        // Tính n! ( return n!)
    public static int Giaithua(int n){
        // Bài toán cơ sở
        if (n == 0)
            return 1;
        // Công thức quy nạp
        int t = n * Giaithua(n-1);
        return t;
    }
        // Tìm số Fibonaci thứ n
    public static int []F_save = new int [101];
    public static int Fibo(int n){
        // Bài toán cơ sở
        if (n <= 1)
            return n;
        // Công thức quy nạp
        int Fn = Fibo(n-1) + Fibo(n-2);
        return Fn;
    }

    public static void printElemnt(int[] arr, int index){
        // Bài toán cơ sở ( Dk dừng )
        if (index < 0 || index >= arr.length)
            return;
        // Công thức quy nạp : in phần tử index và print index + 1
        System.out.println(arr[index]); // cho xuống dưới printElemnt thì sẽ in được hàm ngược lại
        printElemnt(arr, index + 1);
//        printElemnt(arr, index - 1);
    }


    public static void main(String[] args) {
	// write your code here
//        printF();

//        System.out.println(Giaithua(1));
//        System.out.println(Giaithua(2));
//        System.out.println(Giaithua(3));
//        System.out.println(Giaithua(4));
//        System.out.println(Giaithua(5));
//        System.out.println(Giaithua(6));

        System.out.println(Fibo(0));
        System.out.println(Fibo(2));
        System.out.println(Fibo(9));

//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        printElemnt(arr, 0);
//        printElemnt(arr, arr.length - 1);
    }
}



// quicksort : n/2^i = 1 là tính độ phức tạp của 1 hàm => i = log2 n độ phức tạp là n log n
// ( nếu chia được ở giữa  nếu tệ nhất thì là n^2 = với thuật toán nổi bọt)
