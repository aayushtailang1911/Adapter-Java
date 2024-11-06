/**
 * A Class which implements iPhone
 * and is used to convert the android type-C charger to Iphone's charger
 */
public class ChargerAdapter implements iPhone{

    //it takes a androidCharger instance
    private AndroidCharger androidCharger;

    //this is for loose coupling
    public ChargerAdapter(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    //overriding the chargeWithIphoneCharger method of Iphone interface
    @Override
    public void chargeWithIphoneCharger() {
        System.out.println("Adapter: Converting USB-C to Iphone Charger...");
        androidCharger.chargeWithUSBC(); // Call the Android charger's USB-C method

    }

}
