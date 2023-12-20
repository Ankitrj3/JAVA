import java.util.*;
class Item{
    String product;
    int no;
    int price;
    int dis;
    public void getdata(){
        Scanner sc = new Scanner(System.in);
        product = sc.nextLine();
        no = sc.nextInt();
        price = sc.nextInt();
        dis = sc.nextInt();
    }
}
class print1 extends Item{
    float Discount;
    public void pri(){
        price = price*no;
        System.out.println("Item - wise bill ");
        System.out.println("Item name "+product);
        System.out.println("Item number "+no);
        System.out.println("Item price "+price);
        System.out.println("Item discounted percentage is "+dis);
        Discount = (price*dis)/100;
        System.out.println("Discounted price is "+(price-Discount));
    }
    
}

class main2{
    public static void main(String args []){
        print1 k = new print1();
        k.getdata();
        k.pri();
    }
}