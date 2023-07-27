package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
// POJO class in which it is shown how the injection of different types of values is performed

/* We can add a custom name to the bean being created using parenthesis and quotation marks as follows
@Component("bean custom name)
*/
@Component
public class Instructor {

    @Value("10")
    private int id;
    @Value("Name")
    private String name;

    @Value("#{topics}")
    private List<String> topics;

    @Autowired
    private ProfileInfo profileInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public ProfileInfo getProfileInfo() {
        return profileInfo;
    }

    public void setProfileInfo(ProfileInfo profileInfo) {
        this.profileInfo = profileInfo;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", topics=" + topics +
                ", profileInfo=" + profileInfo +
                '}';
    }
}
