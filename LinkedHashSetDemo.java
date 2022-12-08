package com.jojuskills;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
public class LinkedHashSetDemo {
public static void main(String[] args) {
// TODO Auto-generated method stub
LinkedHashSet<String> lhs=new LinkedHashSet<String>();
lhs.add("Suresh");
lhs.add("Mahesh");
lhs.add("Rajesh");
lhs.forEach(System.out::println);
System.out.println("after sorting using stream");
List<String> lhslist=lhs.stream().sorted().collect(Collectors.toList());
lhslist.forEach(System.out::println);}}