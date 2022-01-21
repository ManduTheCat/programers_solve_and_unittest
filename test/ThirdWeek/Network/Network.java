package ThirdWeek.Network;
import org.junit.Test;
import org.junit.Assert;

public class Network {
	@Test
	public void solutionTest(){
		Solution test = new Solution();
		int [][] input1 = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
		int n1 = 3;
		int [][] input2 = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
		int n2 = 3;
		Assert.assertEquals(test.solution(n1, input1), 2);
		Assert.assertEquals(test.solution(n2, input2), 1);
	}

}
