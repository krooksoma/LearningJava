package StrategyPattern.CameraApp;

public abstract class PhoneCameraApp {

    Shareable shareable;
    Editable editable;

    public PhoneCameraApp(){}

    public void displayPhoto(){
        System.out.println("Photo is being displayed");
    }

    public void takePhoto(){
        System.out.println("Click");
    }

    public void savePhoto(){
        System.out.println("Photo saved in the DB");
    }
}
