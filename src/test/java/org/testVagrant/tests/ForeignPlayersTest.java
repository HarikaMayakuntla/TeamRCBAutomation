    package org.testVagrant.tests;

    import io.restassured.RestAssured;
    import io.restassured.mapper.ObjectMapperType;
    import io.restassured.response.Response;
    import org.testVagrant.pojo.TeamDetails.Player;
    import org.testVagrant.pojo.TeamDetails.TeamDetails;
    import org.testVagrant.utils.Endpoints;
    import org.testVagrant.utils.RestAssuredUtil;
    import org.testng.annotations.Test;

    import java.util.List;

    public class ForeignPlayersTest extends BaseTest {

        TeamDetails teamDetails = new TeamDetails();
        private int expectedForeignPlayerCount;

        @Test
        public void verifyForeignPlayersTest(){
            RestAssured.requestSpecification= requestSpecBuilder.build();
            response= RestAssuredUtil.getResponse(Endpoints.ENDPOINT);
            BASE_LOGGER.info(response.asString());
            validateResponse(response);
        }

        private void validateResponse(Response response) {
            teamDetails = response.as(TeamDetails.class, ObjectMapperType.GSON);
            List<Player> players = teamDetails.getPlayer();
            for (Player player : players) {
                if (!player.getCountry().equalsIgnoreCase("india")) {
                    expectedForeignPlayerCount++;
                }
            }
            softAssert.assertEquals(expectedForeignPlayerCount,4);
            softAssert.assertEquals(teamDetails.getLocation(), "Bangalore");
            softAssert.assertAll();
        }

    }
