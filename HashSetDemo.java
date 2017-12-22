import java.util.*;
class HashSetDemo 
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();

		sop(hs.add("java01"));
		sop(hs.add("java01"));
		hs.add("java02");
		hs.add("java03");

		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			sop(it.next());
		}
	}
}
