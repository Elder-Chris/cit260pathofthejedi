/*

 */
package byui.cit260.pathOfTheJedi.model;

import java.io.Serializable;
/**

 */
public class TrainR4 implements Serializable{
    
    //class instance variables
    private static String lightSaberUse;
    private static double lightSaberScore;
    private static double combat;
    private static double push;
    private static double defence;
    private static double forceAffinity;

    public TrainR4() {
    }

    public static String getLightSaberUse() {
        return lightSaberUse;
    }

    public static void setLightSaberUse(String lightSaberUse) {
        TrainR4.lightSaberUse = lightSaberUse;
    }

    public static double getLightSaberScore() {
        return lightSaberScore;
    }

    public static void setLightSaberScore(double lightSaberScore) {
        TrainR4.lightSaberScore = lightSaberScore;
    }

    public static double getCombat() {
        return combat;
    }

    public static void setCombat(double combat) {
        TrainR4.combat = combat;
    }

    public static double getPush() {
        return push;
    }

    public static void setPush(double push) {
        TrainR4.push = push;
    }

    public static double getDefence() {
        return defence;
    }

    public static void setDefence(double defence) {
        TrainR4.defence = defence;
    }

    public static double getForceAffinity() {
        return forceAffinity;
    }

    public static void setForceAffinity(double forceAffinity) {
        TrainR4.forceAffinity = forceAffinity;
    } 

    
}
