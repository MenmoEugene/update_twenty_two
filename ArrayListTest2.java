import java.util.*;
//List集合判断元素是否相同时，依据的是元素的equals方法。
class ArrayListTest2 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(new Person("wangwu01",26));
		al.add(new Person("wangwu01",26));//al.add(Object obj); Object obj = new Person("wangwu",26);类型提升
		al.add(new Person("wangwu02",27));
		al.add(new Person("wangwu03",28));
		al.add(new Person("wangwu03",28));

		al = singleElement(al);

		sop("remove 03:"+al.remove(new Person("wangwu03",28)));

		Iterator it = al.iterator();

		while(it.hasNext())
		{
			Person p = (Person)it.next();//父类Object中没有getName这个功能，所以需要向下转型。
			sop(p.getName()+"::"+p.getAge());
		}
	}

	public static ArrayList singleElement(ArrayList al)
	{
		//定义一个临时容器
		ArrayList newAl = new ArrayList();

		Iterator it = al.iterator();

		while(it.hasNext())
		{
			Object obj = it.next();
			if(!newAl.contains(obj))
				newAl.add(obj);
		}
		return newAl;
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
class Person
{
	private String name;
	private int age;
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Person))
			return false;

		Person p = (Person)obj;
		System.out.println(this.name+"......"+p.name);

		return this.name.equals(p.name) && this.age == p.age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}
