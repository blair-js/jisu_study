package com.stream.practice;

import java.io.File;
import java.util.stream.Stream;

public class Ex14_6 {

	public static void main(String[] args) {

		File[] fileArr = 
		{
			new File("Ex1.java"),
			new File("Ex1.bak"),
			new File("Ex2.java"),
			new File("Ex1"),
			new File("Ex1.txt")
		};
	
		Stream<File> fileStream = Stream.of(fileArr);
		
		//map()으로 Stream<File>을 Stream<String>으로 변환 
		Stream<String> filenameStream = fileStream.map(File::getName);
		filenameStream.forEach(System.out::println); 
		
		fileStream = Stream.of(fileArr); //스트림 재생성
		fileStream.map(File::getName)
				.filter(s->s.indexOf('.')!=-1) //확장자가 없는것은 제외 
				.peek(s->System.out.printf("filename=%s%n", s))
				.map(s->s.substring(s.indexOf('.')+1)) //확장자만 추출
				.peek(s->System.out.printf("extension=%s%n", s))
				.map(String::toUpperCase)
				.distinct()
				.forEach(System.out::print);
		
		System.out.println();
	}

}
