package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class JobTest {
    Job test_job1;
    Job test_job2;

    @Before
    public void createJobObject() {
        test_job1 = new Job();
        test_job2 = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertTrue((test_job1.getId() != test_job2.getId()) && (test_job2.getId() - test_job1.getId() == 1));
        //System.out.println(test_job1.getId());
        //System.out.println(test_job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", test_job3.getName());
        System.out.println(test_job3.getName());
        assertTrue("ACME" == test_job3.getEmployer().toString());
        System.out.println(test_job3.getEmployer());
        //test instanceof? to make sure class is employer
        assertTrue(true == test_job3.getEmployer() instanceof Employer);
        assertTrue("Desert" == test_job3.getLocation().toString());
        assertTrue(true == test_job3.getLocation() instanceof Location);
        assertTrue("Quality control" == test_job3.getPositionType().getValue().toString());
        assertTrue(true == test_job3.getPositionType() instanceof PositionType);
        System.out.println(test_job3.getPositionType().getValue().toString());
        assertTrue("Persistence" == test_job3.getCoreCompetency().toString());
        assertTrue(true == test_job3.getCoreCompetency() instanceof CoreCompetency);


    }

    @Test
    public void testJobsForEquality() {
        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(test_job3 == test_job4);
    }

    @Test
    public void returnBlankLineBeforeAndAfterJobInfo() {
        Job test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String expectedResult = "\n";
        expectedResult += "ID: 3\n";
        expectedResult += "Name: Product tester\n";
        expectedResult += "Employer: ACME\n";
        expectedResult += "Location: Desert\n";
        expectedResult += "Position Type: Quality control\n";
        expectedResult += "Core Competency: Persistence\n";

        assertThat(test_job4.toString(), is(expectedResult));
    }

    @Test
    public void returnLabelFollowedByDataOnItsOwnLine() {
        Job test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertThat(test_job4.toString(), is("\n" + "ID: " + test_job4.getId() + "\n" + "Name: " + test_job4.getName() + "\n" + "Employer: " + test_job4.getEmployer() + "\n" + "Location: " + test_job4.getLocation() + "\n" + "Position Type: " + test_job4.getPositionType() + "\n" + "Core Competency: " + test_job4.getCoreCompetency() + "\n"));
    }

    @Test
    public void returnDataNotAvailableIfFieldEmpty() {
        Job test_jobEmptyField = new Job("", null,null,null, null);
        assertThat(test_jobEmptyField.toString(), is("\n" + "ID: " + test_jobEmptyField.getId() + "\n" + "Name: " + "Data not available" + "\n" + "Employer: " + "Data not available" + "\n" + "Location: " + "Data not available" + "\n" + "Position Type: " + "Data not available" + "\n" + "Core Competency: " + "Data not available" + "\n"));
        }

    }



