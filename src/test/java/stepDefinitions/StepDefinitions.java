package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import scoringSystem.NameSaver;


import static org.junit.Assert.assertEquals;
public class StepDefinitions {
 /*   double p=0;
    double a=0;
    double b=0;
    double c=0;
    double d=0;
    double e=0;
    int result=0;

Score for 100m
  I want set result on 100m and get my points.
  Scenario: Add a result get points
    Given I want to add my result 10 sek
    When I press add
    Then My points would be 1096
       @Given("I want to add my result {double} sek")
        public void i_want_to_add_my_result_sek(double time) {
            p= time;
            System.out.println("your time in 100m are " + p + " sek");
    }

        @When("I press add")
        public void i_press_add() {
            a=25.4347;                  //  (a(b-p)^c)
            b=18;
            c=1.81;
            d=b-p;
            e= Math.pow(d,c);
            result= (int) (a*e);

    }



        @Then("My points would be {int}")
        public void my_points_would_be(Integer int1) {
            //assertEquals(String.valueOf(int1), String.valueOf(result));
            System.out.println("your score was " + result +" point´s");

       */

    private NameSaver nameSaver = new NameSaver ();
    @Given("I have entered number {int} of athlets")
    public void i_have_entered_number_of_athlets(Integer numberOfAthlets) {

        nameSaver.setAthlets(numberOfAthlets);
    }

    @Given("I have entered nr {int} athlets name {string}")
    public void i_have_entered_nr_athlets_name(Integer place, String name) {

        nameSaver.setName(place - 1, name);
    }

    @When("i done")
    public void i_done() {

    }

    @Then("the athlets should be shown")
    public void the_athlets_should_be_shown() {
        String[] names;
        names = nameSaver.getNames();
        assertEquals(3, names.length);
        assertEquals("Carolina",names [0] );

    }


            }



