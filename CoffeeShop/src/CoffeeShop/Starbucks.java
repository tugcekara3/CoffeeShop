package CoffeeShop;

public class Starbucks extends CoffeeShop {

    public String adress;
    public String shopName;
    
    private int AmericanoTallcost;
    private int AmericanoGrandecost;
    private int AmericanoVenticost;
    private int MacchiatoTallcost;
    private int MacchiatoGrandecost;
    private int MacchiatoVenticost;
    private int browniecost;
    private int AmericanoTallProfit;
    private int AmericanoGrandeProfit;
    private int AmericanoVentiProfit;
    private int MacchiatoTallProfit;
    private int MacchiatoGrandeProfit;
    private int MacchiatoVentiProfit;
    private int brownieProfit;
            
    Starbucks () {
        adress = "idealtepe mah";
        shopName = "Starbucks Küçükyalý";  
        DeterminePrices();
    }
    Starbucks (String a, String b) {
        adress = a;
        shopName = b;        
        DeterminePrices();
    }
    
    private void DeterminePrices(){
        AmericanoTallcost= 15;
        AmericanoGrandecost= 18;
        AmericanoVenticost= 20;
        MacchiatoTallcost= 22;
        MacchiatoGrandecost= 25;
        MacchiatoVenticost= 27;
        browniecost= 21;
        AmericanoTallProfit= 12;
        AmericanoGrandeProfit= 15;
        AmericanoVentiProfit= 17;
        MacchiatoTallProfit= 18;
        MacchiatoGrandeProfit= 20;
        MacchiatoVentiProfit= 22;
        brownieProfit =18;
    }
    private void IncreasePrices(){
        AmericanoTallcost+=1;
        AmericanoGrandecost+=1;
        AmericanoVenticost+=1;
        MacchiatoTallcost+=1;
        MacchiatoGrandecost+=1;
        MacchiatoVenticost+=1;
        browniecost+=1;
        AmericanoTallProfit+=1;
        AmericanoGrandeProfit+=1;
        AmericanoVentiProfit+=1;
        MacchiatoTallProfit+=1;
        MacchiatoGrandeProfit+=1;
        MacchiatoVentiProfit+=1;
        brownieProfit+=1;
    }
    private void DecreasePrices(){
        AmericanoTallcost-=1;
        AmericanoGrandecost-=1;
        AmericanoVenticost-=1;
        MacchiatoTallcost-=1;
        MacchiatoGrandecost-=1;
        MacchiatoVenticost-=1;
        browniecost-=1;
        AmericanoTallProfit-=1;
        AmericanoGrandeProfit-=1;
        AmericanoVentiProfit-=1;
        MacchiatoTallProfit-=1;
        MacchiatoGrandeProfit-=1;
        MacchiatoVentiProfit-=1;
        brownieProfit-=1;
    }
    private int STARBUCKS_STAR = 15;
    public int RewardStarCount() {
        return STARBUCKS_STAR;
        
    }
           
    public int SellAmericano(String type)
    {
        int cost =0;
        int profit = 0;
        if(type.equals("Tall"))
        {
            cost = AmericanoTallcost;
            profit = AmericanoTallProfit;
        }
        if(type.equals("Grande"))
        {
            cost = AmericanoGrandecost;
            profit = AmericanoGrandeProfit;
            
        }
        if(type.equals("Venti"))
        {            
            cost = AmericanoVenticost;
            profit = AmericanoVentiProfit;            
        }
        
        totalProfit += profit;
        totalSales += cost;
        return cost;
            
    }
    public int SellMacchiato(String type)
    {
        int cost =0;
        int profit = 0;
        if(type.equals("Tall"))
        {
            cost = MacchiatoTallcost;
            profit = MacchiatoTallProfit;
        }
        if(type.equals("Grande"))
        {
            cost = MacchiatoGrandecost;
            profit = MacchiatoGrandeProfit;
            
        }
        if(type.equals("Venti"))
        {            
            cost = MacchiatoVenticost;
            profit = MacchiatoVentiProfit;            
        }
        
        totalProfit += profit;
        totalSales += cost;
        return cost;            
    }
    
    public int sellBrownie(){
        int brownieCost = browniecost;
        int profit = brownieProfit;
        totalProfit += profit;
        totalSales += brownieCost;
        return brownieCost;
    }
    
    public boolean discount(int star)
    {
        if(star == STARBUCKS_STAR)
            return true;
        else return false;
    }
    
    public void printMenu() {
        System.out.println("Americano" );
        System.out.println("     Tall: "+ AmericanoTallcost);
        System.out.println("     Grande: "+ AmericanoGrandecost);
        System.out.println("     Venti: " + AmericanoVenticost);
        System.out.println("Macchiato");
        System.out.println("     Tall: "+ MacchiatoTallcost);
        System.out.println("     Grande: "+ MacchiatoGrandecost);
        System.out.println("     Venti: "+ MacchiatoVenticost);;
        System.out.println("Starbucks Brownie "+ browniecost);
        
        
    }

}
