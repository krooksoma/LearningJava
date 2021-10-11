package UdemyInterfaces;

public class Deskphone implements ITelephone{
    private int myNumber;
    private boolean isRinging;

    public Deskphone(int myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("phone powering on...");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now dialing " + phoneNumber + " from deskphone");
    }

    @Override
    public void answerCall() {
        if(isRinging){
            System.out.println("Answering deskphone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Ring Ring");
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
