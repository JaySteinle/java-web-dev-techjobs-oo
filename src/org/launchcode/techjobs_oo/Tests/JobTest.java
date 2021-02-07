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
    Job job_3;
    Job newJob;
    Job jobEmptyFields;

    @Before
    public void createJobObjects() {
        job_0 = new Job("Default Name", new Employer("Default Employer"), new Location("Default Location"), new PositionType("Default Position Type"), new CoreCompetency("Default Core Competency"));
        job_1 = new Job("A", new Employer("B"), new Location("C"), new PositionType("D"), new CoreCompetency("E"));
        job_2 = new Job("A", new Employer("B"), new Location("C"), new PositionType("D"), new CoreCompetency("E"));
        job_3 = new Job("Product tester", new Employer(""), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobEmptyFields = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        assertFalse(job_1.equals(job_2));
    }

    @Test
    public void checkIdsIncrementing() {
        assertEquals(job_1.getId() + 1, job_2.getId());
    }

    @Test
    public void testForBlankSpacesAtBeginningAndEnd() {
        assertEquals(0, newJob.toString().indexOf('\n'));
        assertTrue(newJob.toString().endsWith("\n"));
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
    public void testJobsForInequality(){
        assertFalse(job_1.getId() == job_2.getId());
    }

    @Test
    public void checkForLabels(){
        assertTrue(job_1.toString().contains("\nName"));
        assertTrue(job_1.toString().contains("\nEmployer"));
        assertTrue(job_1.toString().contains("\nLocation"));
        assertTrue(job_1.toString().contains("\nPosition Type"));
        assertTrue(job_1.toString().contains("\nCore Competency"));
    }

    @Test
    public void checkForEmptyString(){
        assertEquals("Data not available", jobEmptyFields.getCoreCompetency().toString());
        assertEquals("Data not available", jobEmptyFields.getEmployer().toString());
        assertEquals("Data not available", jobEmptyFields.getLocation().toString());
        assertEquals("Data not available", jobEmptyFields.getPositionType().toString());
    }

}