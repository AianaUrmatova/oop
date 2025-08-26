package java19.student.servise.impl;

import java19.student.models.Group;
import java19.student.servise.GroupServise;


public class GroupServiseImpl implements GroupServise {
    Group[] groups = new Group[10];
    int Groupcount;

    @Override
    public void addGroup(Group newGroup) {
        groups[Groupcount++] = newGroup;
        System.out.println("koshuldu");
    }
}
