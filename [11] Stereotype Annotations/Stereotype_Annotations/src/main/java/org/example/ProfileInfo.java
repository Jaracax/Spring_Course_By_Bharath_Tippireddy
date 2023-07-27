package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// POJO class to be used as a reference to the Instructor class
@Component
public class ProfileInfo {

    @Value("Java Architect")
    private String title;
    @Value("Some Company")
    private String company;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "title='" + title + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
