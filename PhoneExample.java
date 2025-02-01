class CellPhone{
    public void PickUpCall(){
        System.out.println("Picking up the call");
    }
    public void EndCall(){
        System.out.println("Ending the call...");
    }
    public void IncomingCall(int number){
        System.out.println("Call coming from no. " + number);
    }
    public void OutgoingCall(){
        System.out.println("Calling...");
    }
}

interface Camera{
    public void clickPicture();
    public void recordVideo();
}

interface WiFi{
    public void showWifiNetworks(String[] names, int n);
    public void ConnectWifi();
}

interface GPS{
    public void locate();
}

class SmartPhone extends CellPhone implements Camera, WiFi, GPS {
    @Override
    public void clickPicture(){
        System.out.println("Clicking the Picture...");
    }
    @Override
    public void recordVideo(){
        System.out.println("Recording the video...");
    }
    @Override
    public void showWifiNetworks(String[] names, int n){
        for(int i=0; i<n; i++){
        System.out.println(names[i]);
        }
    }
    @Override
    public void ConnectWifi(){
        System.out.println("Connecting to the network...");
    }
    @Override
    public void locate(){
        System.out.println("Locating your location");
    }

}

public class PhoneExample {
    public static void main(String[] args) {
        SmartPhone galaxy = new SmartPhone();
        galaxy.clickPicture();
        galaxy.EndCall();
        String[] names = {"Chotu", "Aditya", "Kanhaiya"};
        galaxy.showWifiNetworks(names,3);
    }
}
