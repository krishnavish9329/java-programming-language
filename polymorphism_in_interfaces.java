interface myCamera2
{
    void takeSnap();
    void recordVideo();
    private void greet()
    {
        System.out.println("good morning :");
    }
    default void record4KVideo()
    {
        greet();
        System.out.println("recording in 4k ........");
    }
}
interface myWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class mycallphone2
{
    void callNumber(int phoneNumber)
    {
        System.out.println("calling "+ phoneNumber);
    }
    void pickCall()
    {
        System.out.println("connerting ...");
    }
}
class mySmartPhone2 extends mycallphone2 implements myWifi2,myCamera2
{
    public void takeSnap()
    {
        System.out.println("takeing snap");
    }
    public void recordVideo()
    {
        System.out.println("taking snap");
    }
    public String[] getNetworks()
    {
        System.out.println("getting list of networks ");
        String[] networkList={"krishna","sangam","prashant" };
        return networkList;
    }
    public void connectToNetwork(String network)
    {
        System.out.println("connection to "+ network);
    }
}
class polymorphism_in_interfaces {
    public static void main(String[] args) {
        myCamera2 sp =new mySmartPhone2();
        sp.record4KVideo();

        mySmartPhone2 s=new mySmartPhone2();
        s.recordVideo();
        s.getNetworks();
        s.callNumber(932922953);

    }
    
}
