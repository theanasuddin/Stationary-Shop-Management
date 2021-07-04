package BO;

/**
 *
 * @author Anas
 */
public class Purchase extends OperationOnProduct {

    private String vendorName;
    private double totalAmount;

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
