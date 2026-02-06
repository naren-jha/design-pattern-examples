package com.narenjha.dp.command.example.smarthomeremote;

// ========== Commands for Curtains ==========
class CurtainsOpenCommand implements Command {
    private final Curtains curtains;
    public CurtainsOpenCommand(Curtains curtains) { this.curtains = curtains; }

    @Override public void execute() { curtains.open(); }
    @Override public void undo()    { curtains.close(); }
}

class CurtainsCloseCommand implements Command {
    private final Curtains curtains;
    public CurtainsCloseCommand(Curtains curtains) { this.curtains = curtains; }

    @Override public void execute() { curtains.close(); }
    @Override public void undo()    { curtains.open(); }
}