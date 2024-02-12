public class NC_121 {

    public static void main(String[] args) {
        NC_121 test = new NC_121();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(test.maxProfit(prices));
    }
    public int maxProfit(int[] prices) {

        //L and R pointer
        int indexLeft = 0;
        int indexRight = 1;
        int maxProfit = 0;
        int profit = 0;

        while (indexRight < prices.length) {
            // L < R, increase in price, profitable
            if (prices[indexLeft] < prices[indexRight]) {
                System.out.println("profitable reached");
                profit = prices[indexRight] - prices[indexLeft];
                if (profit > maxProfit) {
                    maxProfit = profit;
                    System.out.println("New max profit:" +maxProfit);
                }
            } 
            else { //not profitable
                System.out.println("not profitable reached");
                indexLeft = indexRight; //the current indexRight is the new minimum
            }
            indexRight++;

        }
        return maxProfit;
    }
}
