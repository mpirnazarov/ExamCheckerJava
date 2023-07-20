package uz.muu.examchecker.controller;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.springframework.web.bind.annotation.*;


import uz.muu.examchecker.ExamCheckerApplication;
import uz.muu.examchecker.entities.TestResult;

import java.util.LinkedList;
import java.util.List;


@RestController
public class MainController {

    @GetMapping(value= "/shutDown")
    public String shutDown(){
        ExamCheckerApplication.exitApplication();
        return "Program killed";
    }


    @GetMapping(value = "runJUnit")
    public TestResult runJUnit(){
        Result result= JUnitCore.runClasses(uz.tiss.tests.CalculatorTest.class);
        TestResult testResult = new TestResult();
        testResult.setAllTests(result.getRunCount());
        List<String> failMessages = new LinkedList<>();
        for (Failure failure :
             result.getFailures()) {
            failMessages.add(failure.getMessage());
        }
        testResult.setMessages(failMessages);
        testResult.setFailTests(failMessages.size());
        return testResult;
    }

    @GetMapping(value = "/hello")
    public Boolean helloMethod(){
        return Boolean.TRUE;
    }
}
