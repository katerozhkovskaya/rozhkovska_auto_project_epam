import entities.MyAnnotationTest;

@MyAnnotationTest(message = "Kate1")
public class Shop {
    private int number;
    private String phoneNumber;
    private String directorName;
    private String address;
    private String shopName;


    private Shop(int numberOfShop, String address, String shopName, String phoneNumber, String directorName) {
        this.number = numberOfShop;
        this.address = address;
        this.shopName = shopName;
        this.phoneNumber = phoneNumber;
        this.directorName = directorName;
    }

    public Shop() {
    }

    private void methodOne() {
    }

    private String methodTwo() {
        return null;
    }

    private static int methodTree() {
        return 0;
    }
}
