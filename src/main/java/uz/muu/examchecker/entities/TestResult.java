package uz.muu.examchecker.entities;

import java.util.LinkedList;
import java.util.List;

public class TestResult {
    int allTests;
    int failTests;
    List<String> messages = new LinkedList<>();

    public int getAllTests() {
        return allTests;
    }

    public void setAllTests(int allTests) {
        this.allTests = allTests;
    }

    public int getFailTests() {
        return failTests;
    }

    public void setFailTests(int failTests) {
        this.failTests = failTests;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}
