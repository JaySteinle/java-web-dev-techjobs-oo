package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.CoreCompetency;

import static org.junit.Assert.*;

public class JobTest {
    Job job_0;
    Job job_1;
    Job job_2;
    Job newJob;

    @Before
    public void createJobObject() {
        job_0 = new Job("Default Name", new Employer("Default Employer"), new Location("Default Location"), new PositionType("Default Position Type"), new CoreCompetency("Default Core Competency"));
        job_1 = new Job("A", new Employer("B"), new Location("C"), new PositionType("D"), new CoreCompetency("E"));
        job_2 = new Job("A", new Employer("B"), new Location("C"), new PositionType("D"), new CoreCompetency("E"));
        newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        assertFalse(job_1.equals(job_2));
    }

    @Test
    public void checkIds() {
//        assertEquals(1, job_1.getId(), 0);
//        assertEquals(2, job_2.getId(), 0);
//        assertEquals(job_1.getId() + 1, job_2.getId(), 0);
        assertEquals(job_1.getId() + 1, job_2.getId());
    }

    @Test
    public void toString(Job jobAllFields) {
        jobAllFields.toString();
//        assertEquals(1, 1);

//        System.out.println("\n");
//        System.out.println(job_0.getId());
//        System.out.println(job_0.getEmployer());
//        System.out.println(job_0.getLocation());
//        System.out.println(job_0.getPositionType());
//        System.out.println(job_0.getCoreCompetency());
//        System.out.println("\n");
    }


    //TODO  Test the Full Constructor
    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(newJob.getName().contains("Product tester"));
        assertTrue(newJob.getEmployer().getValue().contains("ACME"));
        assertTrue(newJob.getLocation().getValue().contains("Desert"));
        assertTrue(newJob.getPositionType().getValue().contains("Quality control"));
        assertTrue(newJob.getCoreCompetency().getValue().contains("Persistence"));

        assertTrue(newJob instanceof Job);
        assertTrue(newJob.getEmployer() instanceof Employer);
        assertTrue(newJob.getLocation() instanceof Location);
        assertTrue(newJob.getPositionType() instanceof PositionType);
        assertTrue(newJob.getCoreCompetency() instanceof CoreCompetency);
    }

    //TODO   Test for equality
    @Test
    public void testJobsForEquality(){
//        assertNotEquals(job_1.getId(), (job_2.getId()));
        assertFalse(job_1.getId() == job_2.getId());
    }

}