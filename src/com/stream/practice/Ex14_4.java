package com.stream.practice;

import java.util.Comparator;
import java.util.stream.Stream;

public class Ex14_4 {

	public static void main(String[] args) {

		Stream<Student> studentStream = Stream.of(
					new Student("이자바", 3, 300),
					new Student("김자바", 1, 200),
					new Student("안자바", 2, 100),
					new Student("박자바", 2, 150),
					new Student("소자바", 1, 200),
					new Student("나자바", 3, 290),
					new Student("감자바", 3, 180)
				);
		
//		studentStream.sorted(Comparator.comparing(Student::getBan).reversed()
//				.thenComparing(Comparator.naturalOrder()).reversed())
//		.forEach(System.out::println);
		
		//람다로 바꾸기
		studentStream.sorted(Comparator.comparing((Student s)->s.getBan()).reversed()
				.thenComparing(Comparator.naturalOrder()).reversed())
		.forEach(System.out::println);
	}

}

class Student implements Comparable<Student>{
	
	String name; 
	int ban; 
	int totalScore;
	
	public Student(String name, int ban, int totalScore) {
		super();
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	
	@Override
	public String toString() {
		return String.format("[%s, %d, %d]", name, ban, totalScore);
	}

	@Override
	public int compareTo(Student s) {

		return s.totalScore - this.totalScore;
		
	}
	
}