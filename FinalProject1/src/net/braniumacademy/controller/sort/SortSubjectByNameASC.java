package net.braniumacademy.controller.sort;

import java.util.Comparator;
import net.braniumacademy.model.Subject;

/**
 *
 * @author braniumacademy <braniumacademy.net>
 */
public class SortSubjectByNameASC implements Comparator<Subject> {

    @Override
    public int compare(Subject o1, Subject o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
}
//Ghi đè compare -> so sánh hai đối tượng Subject
// o1 > o2 -> int dương
// o1 < o2 -> int âm
// o1 = o2 -> 0