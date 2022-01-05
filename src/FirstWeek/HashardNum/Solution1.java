package FirstWeek.HashardNum;

public class  Solution1{
		public boolean solution(int x) {
			// int integer 차이 ..
			int num = x;
			int sum = 0;
			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}
			// 리턴을 이렇게 할 수 있다.
			return x % sum == 0;
		}
}
