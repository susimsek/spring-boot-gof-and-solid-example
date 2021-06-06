package io.github.susimsek.solid.dip.solution;

/*
Dependency Inversion is more focused on the structure of your code, its focus is keeping your code loosely coupled.
On the other hand, Dependency Injection is how the code functionally works.
 */
public class ElectricPowerSwitch implements Switch {

    public Switchable client;
    public boolean on;

    public ElectricPowerSwitch(Switchable client) {
        this.client = client;
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

   public void press(){
       boolean checkOn = isOn();
       if (checkOn) {
           client.turnOff();
           this.on = false;
       } else {
             client.turnOn();
             this.on = true;
       }
   }
}
