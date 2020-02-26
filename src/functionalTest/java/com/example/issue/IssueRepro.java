package com.example.issue;

import org.gradle.testkit.runner.GradleRunner;
import org.testng.annotations.Test;
import org.gradle.testkit.runner.BuildResult;

import java.io.File;

public class IssueRepro {

    @Test
    public void reproduce() {
        BuildResult result = GradleRunner.create()
                .withProjectDir(new File("src/functionalTest/resources"))
                .withArguments(":clean")
                .build();

        String output = result.getOutput();
        System.out.println(output);
    }
}
