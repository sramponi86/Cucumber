package linkedinlearning.cucumbercourse;

import java.util.ArrayList;

public class RestaurantMenu {

	ArrayList<RestaurantMenuItem> MenuItems = new ArrayList<RestaurantMenuItem>();

	
	public boolean addMenuItem(RestaurantMenuItem newMenuItem) {
		if(DoesItemExist(newMenuItem))
		{
			throw new IllegalArgumentException("Duplicate item");
		}
		return MenuItems.add(newMenuItem);
	}
	
	public boolean DoesItemExist(RestaurantMenuItem newMenuItem) {
		boolean Exists = false;
		if (MenuItems.contains(newMenuItem)) {
			Exists = true;
		}
		return Exists;
	}

	
}
