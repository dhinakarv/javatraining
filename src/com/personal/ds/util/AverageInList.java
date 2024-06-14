package com.personal.ds.util;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AverageInList {
    public static void main(String[] args) {
        List<List<String>> stu = List.of(List.of("Dhina", "100", "400"),
                List.of("abc", "10", "40") );
        int max = 0;
        String studentName = "";
        for (int i = 0; i < stu.size(); i++){
            int avg = Integer.parseInt(stu.get(i).get(1))+Integer.parseInt(stu.get(i).get(2))/2;
            if(avg > max){
                max = avg;
                studentName= stu.get(i).get(0);
            }else if(avg== max){
                studentName = studentName + " "+stu.get(i).get(0);
            }
        }
        System.out.println("Student:"+studentName+":Average:"+max);


        List<Integer> avg = List.of(5, 10, 50, 36);
        System.out.println(avg.stream().mapToInt(i -> i).summaryStatistics());
        Student s1 = new Student("dhina",100,95,85);
        Student s2 = new Student("mina",70,80,60);
        Student s3 = new Student("gana",50,55,45);

        List<Student> stuList = List.of(s1,s2,s3);
        Double average = stuList.stream().mapToDouble(Student::avg).max().orElse(Double.NaN);
        stuList.stream().filter(s-> s.avg()==average).forEach(s->System.out.println(s.name+":"+s.avg()));
    }


    record Student(String name, int s1, int s2, int s3){
        public double avg(){
            return (s1+s2+s3)/3;
        }
    };



}
