package UdemyInterfaces;

public interface ITelephone {
//    access modifiers are not necessary
    void powerOn();
    void dial(int phoneNumber);
    void answerCall();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
