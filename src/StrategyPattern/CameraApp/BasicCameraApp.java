package StrategyPattern.CameraApp;

public class BasicCameraApp extends PhoneCameraApp{
    Shareable shareBehavior;
    Editable editBehavior;


    public BasicCameraApp(){
    }

    public void setShareBehavior(Shareable sB){shareBehavior = sB;}

    public void setEditBehavior(Editable eB){editBehavior = eB;}

    @Override
    public void savePhoto() {
        super.savePhoto();
    }

    @Override
    public void takePhoto() {
        super.takePhoto();
    }

    @Override
    public void displayPhoto() {
        super.displayPhoto();
    }
}
