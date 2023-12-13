package com.ComparableComparatorAssignments;
//15. Observe the sorted outputs in case the name, age and name + age are same
import java.util.Comparator;

public class NameAgeComparator implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2)
	{
		if(s1.getName().compareTo(s2.getName())==0)
		{
			if(s1.getAge()>s2.getAge())
				return 1;
			else
				if(s1.getAge()<s2.getAge())
					return -1;
				else
					return 0;
		}
		else
			return s1.getName().compareTo(s2.getName());
	}

}
