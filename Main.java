import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String b1=sc.next();
    String b2=sc.next();
    BandBooster bc1=new BandBooster(b1);
    BandBooster bc2=new BandBooster(b2);
    for(int i=1;i<=3;i++){
      System.out.print("Enter the number of boxes sold by "+b1+" in Week "+i+": ");
      int bsold=sc.nextInt();
      bc1.updateSales(bsold);
    }
    for(int i=1;i<=3;i++){
      System.out.print("Enter the number of boxes sold by "+b2+" in Week "+i+": ");
      int bsold=sc.nextInt();
      bc2.updateSales(bsold);
    }
    System.out.println(bc1.toString());
    System.out.println(bc2.toString());
  }
}