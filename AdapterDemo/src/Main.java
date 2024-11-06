public class Main {
    public static void main(String[] args) {

        System.out.println("Program Started");

        // Android charger with USB-C
        AndroidCharger androidCharger = new AndroidChargerCompany();

        // Use the adapter to convert the Android charger to Lightning for the iPhone
        iPhone iPhone = new ChargerAdapter(androidCharger);

        // Charge the iPhone using the USB-C charger, via the adapter
        iPhone.chargeWithIphoneCharger(); // Charging through the Adapter


    }
}