package test;

public class CloneSub {
	
	
	public int k = 10;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + k;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CloneSub other = (CloneSub) obj;
		if (k != other.k)
			return false;
		return true;
	}
	
	
}
