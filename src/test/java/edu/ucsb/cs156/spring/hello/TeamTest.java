package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
       assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_same_object() {
       assert(team.equals(team));
    }

    @Test
    public void equals_different_class() {
       String str = "Hi";    
       assert(!team.equals(str));
    }

    @Test
    public void equals_different_object_different_name() {
       Team team2 = new Team("Team2");  
       assert(!team.equals(team2));
    }

    @Test
    public void equals_different_object_same_name_same_team() {
       Team team2 = new Team("test-team");  
       assert(team.equals(team2));
    }

    @Test
    public void equals_different_object_same_name_different_team() {
       Team team2 = new Team("test-team");  
       team2.addMember("Tuan");
       assert(!team.equals(team2));
    }

    @Test
    public void hashCode_returns_correct_hash() {
        Team team1 = new Team("test-team2");  
        team1.addMember("Tuan");
        Team team2 = new Team("test-team2");  
        team2.addMember("Tuan");
        assertEquals(team1.hashCode(), team2.hashCode());
    }

    @Test
    public void hashCode_returns_correct_hash2() {
        Team t = new Team("test-team2");  
        int result = t.hashCode();
        int expectedResult = 639446139;
        assertEquals(expectedResult, result);
    }
}
