package com.narenjha.dp.command.example.smarthomeremote;

// ========== Commands for Stereo ==========
class StereoOnCommand implements Command {
    private final Stereo stereo;
    private boolean prevOn;
    private int prevVolume;

    public StereoOnCommand(Stereo stereo) { this.stereo = stereo; }

    @Override public void execute() {
        prevOn = stereo.isOn();
        prevVolume = stereo.getVolume();
        stereo.on();
        stereo.setVolume(12);
    }

    @Override public void undo() {
        if (!prevOn) stereo.off();
        stereo.setVolume(prevVolume);
    }
}

class StereoOffCommand implements Command {
    private final Stereo stereo;
    private boolean prevOn;
    private int prevVolume;

    public StereoOffCommand(Stereo stereo) { this.stereo = stereo; }

    @Override public void execute() {
        prevOn = stereo.isOn();
        prevVolume = stereo.getVolume();
        stereo.off();
    }

    @Override public void undo() {
        if (prevOn) stereo.on();
        stereo.setVolume(prevVolume);
    }
}
