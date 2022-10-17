public class Player {
    
    private int darah= 1000;
    
    public String getName(){
        return null;
    }
    
    public int getSerangan (){
        return 0;
    }
    public void diSerang (Player player){
        diSerang(player.getSerangan());
    }
    public void diSerang (int serangan){
        darah -=serangan;
        System.out.println(getName()+"Terkena Serangan"+serangan);
    }
    public void print (){
        System.out.println("Nama Player : "+getName());
        System.out.println("Damage Player :"+ getSerangan());
        System.out.println("Darah Player: "+darah);
        
    }
}