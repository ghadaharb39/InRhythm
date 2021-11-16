
import java.util.ArrayList;
import java.util.List;


public class PaginationHelper<I> {
    private int totalCount = 0;
    private int itemsPerPage = 0;
    /**
     * An array of items and an integer is sent to the constructor.
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.totalCount = collection.size();
        this.itemsPerPage = itemsPerPage;
    }


    /**
     * this method returns the number of pages
     */
    public int pageCount() {
        return (totalCount-1)/itemsPerPage+1;
    }

    /**
     * this method returns the number of items within the entire collection
     */
    public int itemCount() {
        return totalCount;
    }
    
    
    /**
     * this returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        int c = pageCount();
        if(pageIndex < 0 || pageIndex >= c) return -1;
        if(pageIndex == c-1)
            return totalCount%itemsPerPage;
        else
            return itemsPerPage;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if(itemIndex < 0 || itemIndex >= totalCount) return -1;
        return (itemIndex-1)/itemsPerPage;
    }

    public static void main(String args[])
    {
        ArrayList<Character> array = new ArrayList<>();
        array.add('a');array.add('b');array.add('c');array.add('d');array.add('e');array.add('f');array.add('g');
        array.add('h');array.add('i');array.add('j');array.add('k');array.add('l');array.add('m');array.add('n');
        
        PaginationHelper<Character> helper = new PaginationHelper(array, 8);
        System.out.println(helper.pageCount()); //should == 2
        System.out.println(helper.itemCount()); //should == 14
        System.out.println(helper.pageItemCount(0)); //should == 8
        System.out.println(helper.pageItemCount(1)); // last page - should == 6
        System.out.println(helper.pageItemCount(2)); // should == -1 since the page is out of range
        System.out.println(helper.pageItemCount(-2)); // should == -1 since the page is out of range

        // pageIndex takes an item index and returns the page that it belongs on
        System.out.println(helper.pageIndex(4)); //should == 0 (zero based index)
        System.out.println(helper.pageIndex(9)); //should == 1
        System.out.println(helper.pageIndex(20)); //should == -1 since the page is out of range
        System.out.println(helper.pageIndex(-50)); //should == -1 since the page is out of range
    }
}