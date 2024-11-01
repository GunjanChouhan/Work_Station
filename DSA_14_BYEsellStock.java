package Company;

public class DSA_14_BYEsellStock {
    public static int buyandsellStocks(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i< prices.length;i++){
            //Profit
            if(buyprice<prices[i]){
                //Today's profit
                int profit = prices[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }
            else {
                buyprice=prices[i];
            }
        }
        return maxprofit;
    }


    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println("Maximum Profit : "+buyandsellStocks(prices));
    }
}
