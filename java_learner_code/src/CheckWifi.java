public class CheckWifi {

    public void searchWifi() {
        for (int i = 1; i <= 10; i++) {
//      ASSUME checkForWifi() is a method does what it says
            boolean wifiAvailable = checkForWifi();
            if (wifiAvailable) {
                System.out.print("Wifi Found");
                break;
            }

        }
    }
}
