package io.github.susimsek.solid.dip.problem;

/*
A. High-level modules should not depend on low-level modules. Both should depend on abstractions.
Our high-level ElectricPowerSwitch class is directly dependent on the low-level LightBulb class.
if you see in the code, the LightBulb class is hardcoded in ElectricPowerSwitch. But, a switch should not be tied to a bulb.
It should be able to turn on and off other appliances and devices too, say a fan, an AC, or the entire lightning system of an amusement park
 */

public class ElectricPowerSwitch {
    public LightBulb lightBulb;
    public boolean on;

    public ElectricPowerSwitch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }
    public void press(){
        boolean checkOn = isOn();
        if (checkOn) {
            lightBulb.turnOff();
            this.on = false;
        } else {
            lightBulb.turnOn();
            this.on = true;
        }
    }
}