package StrategyPattern.CameraApp;

public class ShareByEmail implements Shareable{

    @Override
    public void sharePhoto() {
        System.out.println("Photo Shared on Social Media");
    }
}
