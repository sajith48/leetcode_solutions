// Last updated: 7/18/2026, 9:24:37 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int roundedAmount = ((purchaseAmount + 5) / 10) * 10;
        return 100 - roundedAmount;
    }
}