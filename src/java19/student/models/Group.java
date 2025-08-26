package java19.student.models;

import java19.student.enums.Language;

import java.util.Arrays;

public class Group {
    private Long id;
    private  String groupName;


    public Group(Long id, String groupName ) {
        this.id = id;
        this.groupName = groupName;

    }

    public Long getId() {
        return id;
    }

    public String getGroupName() {
        return groupName;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }



    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +

                '}';
    }
}
