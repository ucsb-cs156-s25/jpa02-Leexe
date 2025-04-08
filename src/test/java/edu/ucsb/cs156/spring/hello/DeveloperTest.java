package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Tuan L.", Developer.getName());
    }

    @Test
    public void getGithubId_returns_correct_githubID() {
        assertEquals("Leexe", Developer.getGithubId());
    }

    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team t = Developer.getTeam();
        assertEquals("s25-13", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_correct_teamMembers() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Tuan L."), "Team should contain Tuan L.");
        assertTrue(t.getMembers().contains("Conner S."), "Team should contain Conner S.");
        assertTrue(t.getMembers().contains("Cheng X."), "Team should contain Cheng X.");
        assertTrue(t.getMembers().contains("Kenneth T."), "Team should contain Kenneth T.");
        assertTrue(t.getMembers().contains("Nikunj P."), "Team should contain Nikunj P.");
        assertTrue(t.getMembers().contains("Timothy W."), "Team should contain Timothy W.");
    }

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
