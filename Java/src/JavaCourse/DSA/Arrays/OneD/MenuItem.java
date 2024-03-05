package JavaCourse.DSA.Arrays.OneD;

public class MenuItem{
    public static int findMenuitem(String[] menuItems, String findItem)
    {
        for(int i=0;i<menuItems.length;i++)
        {
            if(menuItems[i].equals(findItem))
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] menuItems = {"Pizza", "Pasta", "Salad", "Soup", "Bread", "cheese", "fruit", "coffee", "tea", "water"};
        String findItem = "cheese";
        int result = findMenuitem(menuItems,findItem);
        if(result == -1)
        {
            System.out.println("Item not found");
        }
        else
        {
            System.out.println("Item found at index: "+ result);
        }
    }
}