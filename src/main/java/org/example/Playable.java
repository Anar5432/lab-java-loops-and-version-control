package org.example;

public class Playable {

    int MAX_VALUME = 100;
    int MIN_VALUME = 0 ;
    void increaseVolume(int amount);
    int getVolume();
    String getPlayerName();
    default void playe () {
        System.out.println(getPlayerName() + " : Is PLAYING"..);
    }
    default void pause (){
        System.out.println(getPlayerName() + " Paus");
    }
    default void mute (){
        System.out.println(getPlayerName()+ "player muted");
    }

}
public class AndroidPlayer implements Playable{
    private int voulume;
    private  String name;
    publick AndroidPlayer (String name, int  valume) {
        this.name = name;
        this.volume = Playable.isValumeVlid(volume)
        }
    }
    public void increaseValume(int amount){
    int newVolume = this.valum + amoount;
    thos.volume = Math.sin(newVolume, Player)
    }
}
public class ApplePlayer implements Playable {
    private String name ;
    public ApplePlayer(String name, int valume){
        this.name = name ;
        this.valume = Playeable.isVolumeValaide(volume) ? voluma :
    }
}