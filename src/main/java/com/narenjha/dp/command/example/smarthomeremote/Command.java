package com.narenjha.dp.command.example.smarthomeremote;

interface Command {
    void execute();
    void undo();   // optional but super useful
}