package Experiment.HashTest;
import java.util.*;
public class HashTest {
	private class Identifier {
		private long A;
		private long B;
		private long C;

		public Identifier(long A, long B, long C) {
			this.A = A;
			this.B = B;
			this.C = C;
		}

		public boolean equals(Object o) {
			if(this == o) return true;
			if(o == null || getClass() != o.getClass()) return false;

			Identifier other = (Identifier)o;

			return other.A == A && other.B == B && other.C == C;
		}

		@Override
		public int hashCode() {
			return Objects.hash(A, B, C); // import java.util.Objects;
		}
	}


	public void Test() {
		HashMap<Identifier, String> map = new HashMap<Identifier, String>();
		Identifier id1 = new Identifier(1, 2, 3);
		map.put(id1,"White");
		Identifier id2 = new Identifier(2, 1, 3);
		map.put(id2,"Yellow");
		Identifier id3 = new Identifier(2, 1, 3);
		map.put(id3,"Red");
		System.out.println(map.get(id2));
	}


}