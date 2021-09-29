package StrategyPattern.CameraApp;

public class ShareInSocialMedia implements Shareable{

    @Override
    public void sharePhoto() {
        System.out.println("Photo being Shared in Social Media");
    }
}
