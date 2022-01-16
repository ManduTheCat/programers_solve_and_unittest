package FirstWeek.mockExam;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {
	/*
	 학생이늘어날때 를 생각해서 찍기배열을 추가 할 수 있게 한다.
	 생성자로 만들지 그냥 Arraylist로 만들지 어떤게 더 좋을지 고민해보자
	 패턴을 추가 할수 있는 클래스를 목표로 만들었다.
	 스트림 정리 한번 하자
	 ArrayList 사용법 get,set
	 객체 만들면서 처음에 init 메소드를 만들어 p1 p2 p3 를 넣고 따로
	add 를 만들려다가 add 를 안쓰게 되어서 그냥 add 만 만듦
	생성자도 고민해봤는 solution 내 add 를 안쓰게 될거 같아서 안만듦
함*/
	// 학생객체  추가해보자
	public int[] solution(int[] answers) {
		int[] p1 = {1, 2, 3, 4, 5};
		int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		NoMathPeople1 nmp = new NoMathPeople1();
		Student s1 = new Student( p1);
		Student s2 = new Student( p2);
		Student s3 = new Student( p3);
		nmp.addPattern(s1.pattern);
		nmp.addPattern(s2.pattern);
		nmp.addPattern(s3.pattern);

		for(int i = 0; i < nmp.peoplePatterns.size(); i++){
			for(int j = 0; j < answers.length; j++){
				Integer[] pattern = nmp.peoplePatterns.get(i);
				if(answers[j] == pattern[j % pattern.length]){
					nmp.counts.set(i, nmp.counts.get(i) + 1);
				}
			}
		}

		int max = nmp.counts.stream().mapToInt(i->i).max().orElse(-1);
		int [] countArr = nmp.counts.stream().mapToInt(i->i).toArray();
		return findSameIndex(max, countArr);

	}

	private int[] findSameIndex(int max, int[] countArr) {
		ArrayList<Integer> countPath = new ArrayList<>();
		for (int i = 0; i < countArr.length; i++) {
			if (max == countArr[i]) {
				countPath.add(i);
			}
		}
		return countPath.stream().mapToInt(i -> i + 1).toArray();
	}
}
class NoMathPeople1{
	ArrayList<Integer[]> peoplePatterns = new ArrayList<>();
	ArrayList<Integer> counts = new ArrayList<>();

	public void addPattern(int[] pattern){
		peoplePatterns.add(Arrays.stream(pattern).boxed().toArray(Integer[]::new));
		counts.add(0);
	}
}
//	학생 한 명 한 명을 클래스로 만들어서 처리해 보면 어떨까요?
//	Student 클래스를 도입해 봅시다.
class Student{
	int [] pattern;
	public Student(int[] pattern){
		this.pattern = pattern;
	}
}