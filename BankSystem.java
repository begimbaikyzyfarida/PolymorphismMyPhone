public class BankSystem{
    private String bankName;
    private String userName;
    private String bankAddress;
    private String userAddress;
    private int userPIN;
    private String totalMoney;

    public BankSystem(String bankName, String userName, String bankAddress, String userAddress, int userPIN, String totalMoney) {
        this.bankName = bankName;
        this.userName = userName;
        this.bankAddress = bankAddress;
        this.userAddress = userAddress;
        this.userPIN = userPIN;
        this.totalMoney = totalMoney;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public int getUserPIN() {
        return userPIN;
    }

    public void setUserPIN(int userPIN) {
        this.userPIN = userPIN;
    }

    public String getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(String totalMoney) {
        this.totalMoney = totalMoney;
    }

    public void transfer(BankSystem recipient, int amount) {
        if (recipient != null && amount > 0) {
            int senderTotalMoney = Integer.parseInt(totalMoney);
            int recipientTotalMoney = Integer.parseInt(recipient.getTotalMoney());

            if (senderTotalMoney >= amount) {
                senderTotalMoney -= amount;
                recipientTotalMoney += amount;

                totalMoney = String.valueOf(senderTotalMoney);
                recipient.setTotalMoney(String.valueOf(recipientTotalMoney));

                System.out.println("Transfer successful.");
            } else {
                System.out.println("Insufficient funds for transfer.");
            }
        } else {
            System.out.println("Invalid recipient or amount for transfer.");
        }
    }

    public void makePayment(int amount) {
        int userTotalMoney = Integer.parseInt(totalMoney);

        if (userTotalMoney >= amount) {
            userTotalMoney -= amount;
            totalMoney = String.valueOf(userTotalMoney);
            System.out.println("Payment successful.");
        } else {
            System.out.println("Insufficient funds for payment.");
        }
    }

    @Override
    public String toString() {
        return "BankSystem{" +
                "bankName='" + bankName + '\'' +
                ", userName='" + userName + '\'' +
                ", bankAddress='" + bankAddress + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userPIN=" + userPIN +
                ", totalMoney='" + totalMoney + '\'' +
                '}';
    }
}
