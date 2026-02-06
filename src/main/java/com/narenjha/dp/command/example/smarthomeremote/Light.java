package com.narenjha.dp.command.example.smarthomeremote;

// ========== Receivers (Devices) ==========

class Light {
    private final String location;
    private boolean isOn;

    public Light(String location) { this.location = location; }

    public void on()  { isOn = true;  System.out.println(location + " light ON"); }
    public void off() { isOn = false; System.out.println(location + " light OFF"); }
    public boolean isOn() { return isOn; }
}

class CeilingFan {
    enum Speed { OFF, LOW, MEDIUM, HIGH }
    private final String location;
    private Speed speed = Speed.OFF;

    public CeilingFan(String location) { this.location = location; }

    public void high()   { speed = Speed.HIGH;   System.out.println(location + " fan HIGH"); }
    public void medium() { speed = Speed.MEDIUM; System.out.println(location + " fan MEDIUM"); }
    public void low()    { speed = Speed.LOW;    System.out.println(location + " fan LOW"); }
    public void off()    { speed = Speed.OFF;    System.out.println(location + " fan OFF"); }

    public Speed getSpeed() { return speed; }
    public void setSpeed(Speed s) {
        switch (s) {
            case HIGH -> high();
            case MEDIUM -> medium();
            case LOW -> low();
            default -> off();
        }
    }
}

class AirConditioner {
    private boolean isOn;
    private int temperature = 24;

    public void on()  { isOn = true;  System.out.println("AC ON"); }
    public void off() { isOn = false; System.out.println("AC OFF"); }

    public void setTemperature(int t) {
        temperature = t;
        System.out.println("AC temperature set to " + temperature);
    }

    public boolean isOn() { return isOn; }
    public int getTemperature() { return temperature; }
}

class GarageDoor {
    public void up()   { System.out.println("Garage door OPEN"); }
    public void down() { System.out.println("Garage door CLOSE"); }
}

class Stereo {
    private boolean isOn;
    private int volume = 5;

    public void on()  { isOn = true;  System.out.println("Stereo ON"); }
    public void off() { isOn = false; System.out.println("Stereo OFF"); }
    public void setVolume(int v) { volume = v; System.out.println("Stereo volume set to " + volume); }
    public boolean isOn() { return isOn; }
    public int getVolume() { return volume; }
}

class Sprinkler {
    private boolean running;
    public void start() { running = true; System.out.println("Sprinkler START"); }
    public void stop()  { running = false; System.out.println("Sprinkler STOP"); }
    public boolean isRunning() { return running; }
}

class Curtains {
    private boolean open;
    public void open()  { open = true;  System.out.println("Curtains OPEN"); }
    public void close() { open = false; System.out.println("Curtains CLOSE"); }
    public boolean isOpen() { return open; }
}
