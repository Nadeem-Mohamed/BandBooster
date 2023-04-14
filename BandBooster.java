public class BandBooster{
  private String bname;
  private int boxesSold;
  public BandBooster(String name){
    bname=name;
    boxesSold=0;
  }
  public String getName(){
    return bname;
  }
  public void updateSales(int adnboxes){
    boxesSold+=adnboxes;
  }
  public String toString(){
    return bname+": "+ boxesSold+" Boxes";
  }
}