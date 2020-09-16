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
    public void firstTestForToString() {
        Job test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertThat(test_job4.toString(), is("\n" + "ID: " + test_job4.getId() + "\n" + "Name: " + test_job4.getName()));
        }


    }



