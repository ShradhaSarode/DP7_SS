package com.hashset;

import java.util.HashSet;

public class ItemHashSet {

	public static void main(String[] args)
	{
		HashSet<Item>hs=new HashSet<>();
		hs.add(new Item(1,"sugar",34));
		hs.add(new Item(2,"biscuit",100));
		hs.add(new Item(3,"chips",50));
		hs.add(new Item(4,"ghee",300));
		hs.add(new Item(5,"flour",150));
		hs.add(new Item(1,"sugar",34));
		hs.add(new Item(7,"red-label",250));
		
		for(Item i: hs)
		{
			System.out.println(i);
		}
	}

}
