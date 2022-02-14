package com.lambda.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Ex14_2 {

	public static void main(String[] args) {

		Supplier<Integer> s = () -> (int)(Math.random()*100)+1;
		Consumer<Integer> c = i -> System.out.print(i + ", ");
		Predicate<Integer> p = i -> i%2 == 0;
		Function<Integer, Integer> f = i -> i/10*10;
		
		List<Integer> list = new ArrayList<>();

		makeRandomList(s, list); //list�� ���������� ä���
		System.out.println(list);
	
		printEvenNum(p, c, list); //¦���� ���
		
		System.out.println();
		
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList); //���� �ڸ��� ���ش�
		
	}
	
	static <T> List<T> doSomething(Function<T, T> f, List<T> list){
		List<T> newList = new ArrayList<T>(list.size());
		
		for(T i : list) {
			newList.add(f.apply(i)); //�����ڸ��� ���ּ� ���ο� list�� ����
		}
		
		return newList;
	}
	
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		
		for(T i : list) {
			if(p.test(i)) { //¦������ �˻�
				c.accept(i); //¦���� ���
			}
		}//for
		System.out.print("]");
	}

	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0; i<10; i++) {
			list.add(s.get()); //Supplier�κ��� 1~100�� ������ �޾� list�� �߰� 
		}
	}
}
