package FirstWeek.HashardNum;

public class  Solution1{
		public boolean solution(int x) {
			Integer num = x;
			int sum = 0;
			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}

			if (x % sum == 0) {
				return true;
			}
			return false;
		}
}
