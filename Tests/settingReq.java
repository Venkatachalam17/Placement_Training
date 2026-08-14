package Tests;

class bk {

    private String mobileNumber;

    
    bk(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

 
    public String getMobileNumber() {
        return mobileNumber;
    }

    
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}

public class settingReq {

    public static void main(String[] args) {

        bk account = new bk("9876543210");

        System.out.println("Old Mobile Number: " + account.getMobileNumber());

        account.setMobileNumber("9999999999");

        System.out.println("New Mobile Number: " + account.getMobileNumber());
    }
}