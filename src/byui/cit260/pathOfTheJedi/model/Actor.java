/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.model;

import java.io.Serializable;

/**
 *
 * @author Kika
 */
public enum Actor implements Serializable{
    
    /*public static void findSomeone(int direction){
        
    String goodGuy[] = new String[5];
    goodGuy[0] = "Lando Carlissian";
    goodGuy[1] = "Mace Windu";
    goodGuy[2] = "Bail Organa";
    goodGuy[3] = "Wedge Antilles";
    goodGuy[4] = "Captain Typho";
    
    String badGuy[] = new String[5];
    badGuy[0] = "Darth Zannah";
    badGuy[1] = "Darth Plagueis";
    badGuy[2] = "Darth Sidious";
    badGuy[3] = "Darth Bane";
    badGuy[4] = "Darth Lumiya";
    
    String planet = Player.getHome();
    
    
    
    }
    */
    
    //Kashyyk
    lando("\nLando Carlissian: You look like your freash out of Jedi school. "
            + "\nBe careful, there are reports of a Sith somewhere in the area. "
            + "\nYou dont look ready to handle something like that. Go train firts."),
    zannah("\nDarth Zannah: Fool you dare to approch me? I eat Jedis for breakfast."
            + "\nNo like literaly, I'm a canabal. Prepare to die, I'm hungry."),//first sith
    //Mandalore
    mace("\nMace Windu: Hello there, fancy meeting another good guy on Mandalore. "
            + "\nGo find some trianing holograms, and get your skills up, maybe you"
            + "\ncan help me kill the Sith thats been lurking around here."),
    plagueis("\nDarth Plagueis: You dare to challenge me, do you see how increadibly fancy"
            + "\nmy glow sticks are."),//second sith
    //New Tatooine
    bail("\nBail Organa: Isn't it increadibly convinient that the league of really good guys"
            + "\n sent one high ranking good guy to each place you have visited. Go train, "
            + "\nkill sith, bla, bla, bla."),
    sidious("\nDarth Sidious: YOU JEDI!!!!"
            + "\nME SMASH!!!"),//third sith
    //Rantine Space Station
    wedge("\nWedge Antilles: Welcome to Rantine Space Station. I heard you killed Darth Sidious."
            + "\nWell congratulations on taking down a half wit. We never bothered, we figured "
            + "\neventually he would eat enough glue that things would handle themselves..."
            + "\nbut your way works too."),
    bane("\nDarth Bane: You will never make to the destroyer. My name is Darth Bane, and bane "
            + "\nmeans the end of, get it. I have the coolest name ever, it makes me scary."
            + "\nYou will die now!"),//fourth sith
    //New Super Star Destroyer
    typho("\nCaptain Typho: Hey you made it. Ok stay with me here, we're on a giant space ship"
            + "\nbuilt by the Sith, yes it is a sphere...which makes no sense, like how do they"
            + "\neven steer this thing. Anyway the Queen Sith is on board, as big as this thing"
            + "\n is you would think you wouldn't run into her, but hey, who knows."),
    lumiya("\nDarth Lumiya: I'm the Queen Sith...What you think girls can't be Sith. I'll have"
            + "\nyou know that girls can be just as good at Sithing as boys, better even."
            + "\nI still get paid less though. prepare to die.");//final sith


    
    // class instance variables
   
    private final String description;
    //private final Double type;
    //private final Point coordinates;

    Actor(String description) {
        this.description = description;
        //type = 2.00;        
    }

    public String getDescription() {
        return description;
    }
    
}
