package org.testVagrant.tests;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class VerifyWicketKeeperTest {
    int count;

    @Test
    public void verifyWicketKeeperTest()  {
        File responseFile = new File("src/test/java/org/testVagrant/resources/TeamRCB.json");
        JsonPath jsonPath = new JsonPath(responseFile);
        List<String> roles = jsonPath.getList("player.role");
        System.out.println(roles);
        for (String role : roles) {
            if (role.equalsIgnoreCase("Wicket-keeper")) {
                count = 1;
            }
        }
            if (count < 1) {
                Assert.fail("No wicket-keeper role found");
            }
        }

    }
