package UdemyInterfaces;

public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging, isOn = false;

    public MobilePhone(int myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("mobilePhone powering on...");
        isOn = true;
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
        System.out.println("Now dialing " + phoneNumber + " from mobilephone");
        }else{
            System.out.println("phone is switched off");
        }
    }

    @Override
    public void answerCall() {
        if(isRinging){
            System.out.println("Answering mobilePhone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Rang Ring");
        }else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}