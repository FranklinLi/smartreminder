package com.example.franklin.smartreminder;

public interface TTSListener{
    public void speak(String text);
    public void pause(long duration);
}