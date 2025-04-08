package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Tuan L.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "Leexe";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s25-13");
        team.addMember("Cheng X.");
        team.addMember("Conner S.");
        team.addMember("Tuan L.");
        team.addMember("Kenneth T.");
        team.addMember("Nikunj P.");
        team.addMember("Timothy W.");
        return team;
    }
}
