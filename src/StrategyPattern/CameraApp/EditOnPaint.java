package StrategyPattern.CameraApp;

public class EditOnPaint implements Editable {

    public void openPaintAndEdit(){
        System.out.println("opening photo on paint and editing");
    }

    @Override
    public void editPhoto(){
        System.out.println("Editing photo on paint");
    }
}
