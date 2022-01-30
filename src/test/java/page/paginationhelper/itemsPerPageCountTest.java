package page.paginationhelper;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * itemsPerPageCountTest - Contains the Unit test for the itemsPerPageCount method in the Pagination Helper class
 * @author Antonio Navas
 */
public class itemsPerPageCountTest {

    /**
     * emptyDataset() - Unit test for an empty dataset
     *                  Items per page count should be zero for an empty data set
     */
    @Test
    public void emptyDataset() {
        Object[] data = {};

        PaginationHelper pageHelperEmptyDataset = new PaginationHelper(data, 4);
        assertEquals(-1, pageHelperEmptyDataset.itemsPerPageCount(0)); // Minus one is expected for an invalid page
    }

    /**
     * oneItemDataset() - Unit test for a data set with one item
     *                    Items per page count should be one in the first page for a data set with one item
     */
    @Test
    public void oneItemDataset() {
        Object[] data = {"a"};

        PaginationHelper pageHelper1ItemDataset = new PaginationHelper(data, 4);
        assertEquals(1, pageHelper1ItemDataset.itemsPerPageCount(0));
        assertEquals(-1, pageHelper1ItemDataset.itemsPerPageCount(1)); // Minus one is expected for an invalid page
    }

    /**
     * twoItemsDataset() - Unit test for a data set with two items
     *                     Items per page count should be two in the first page for a data set with two items
     */
    @Test
    public void twoItemsDataset() {
        Object[] data = {"a", "b"};

        PaginationHelper pageHelper2ItemsDataset = new PaginationHelper(data, 4);
        assertEquals(2, pageHelper2ItemsDataset.itemsPerPageCount(0));
        assertEquals(-1, pageHelper2ItemsDataset.itemsPerPageCount(1)); // Minus one is expected for an invalid page
    }

    /**
     * threeItemsDataset() - Unit test for a data set with three items
     *                       Items per page count should be three in the first page for a data set with three items
     */
    @Test
    public void threeItemsDataset() {
        Object[] data = {"a", "b", "c"};

        PaginationHelper pageHelper3ItemsDataset = new PaginationHelper(data, 4);
        assertEquals(3, pageHelper3ItemsDataset.itemsPerPageCount(0));
        assertEquals(-1, pageHelper3ItemsDataset.itemsPerPageCount(1)); // Minus one is expected for an invalid page
    }

    /**
     * fourItemsDataset() - Unit test for a data set with four items
     *                      Items per page count should be four in the first page for a data set with four items
     */
    @Test
    public void fourItemsDataset() {
        Object[] data = {"a", "b", "c", "d"};

        PaginationHelper pageHelper4ItemsDataset = new PaginationHelper(data, 4);
        assertEquals(4, pageHelper4ItemsDataset.itemsPerPageCount(0));
        assertEquals(-1, pageHelper4ItemsDataset.itemsPerPageCount(1)); // Minus one is expected for an invalid page
    }

    /**
     * fiveItemsDataset() - Unit test for a data set with five items
     *                      Items per page count should be four in the first page for a data set with five items
     *                      Items per page count should be one in the second page for a data set with five items
     */
    @Test
    public void fiveItemsDataset() {
        Object[] data = {"a", "b", "c", "d", "e"};

        PaginationHelper pageHelper5ItemsDataset = new PaginationHelper(data, 4);
        assertEquals(4, pageHelper5ItemsDataset.itemsPerPageCount(0)); // Four items expected in the first page
        assertEquals(1, pageHelper5ItemsDataset.itemsPerPageCount(1)); // One item expected in the second page
        assertEquals(-1, pageHelper5ItemsDataset.itemsPerPageCount(2)); // Minus one is expected for an invalid page
    }

    /**
     * sixItemsDataset() - Unit test for a data set with six items
     *                     Items per page count should be four in the first page for a data set with six items
     *                     Items per page count should be two in the second page for a data set with six items
     *                     This is the sample dataset provided in the exercise
     */
    @Test
    public void sixItemsDataset() {
        Object[] data = {"a", "b", "c", "d", "e", "f"};

        PaginationHelper pageHelper6ItemsDataset = new PaginationHelper(data, 4);
        assertEquals(4, pageHelper6ItemsDataset.itemsPerPageCount(0)); // Four items expected in the first page
        assertEquals(2, pageHelper6ItemsDataset.itemsPerPageCount(1)); // One item expected in the second page
        assertEquals(-1, pageHelper6ItemsDataset.itemsPerPageCount(2)); // Minus one is expected for an invalid page
    }

    /**
     * oneItemDataset() - Unit test for a data set with one item
     *                    Items per page count should always be (number of items in the dataset) / (items per page) for any given dataset where the number of items remaining is equal to zero
     *                    Items per page count should always be [(number of items in the dataset) / (items per page) + 1] for any given dataset where the number of items remaining is larger than zero
     *                    Items per page count should be four for the first six pages for the data set given in this example
     *                    Items per page count should be one for the last page for the data set given in this example
     */
    @Test
    public void multipleItemsDataset() {
        Object[] data = {"a", "b", "c", "d", "e", "f", "aa", "ab", "abc", "abcd", "abcde", "abcdef", "a&", "b&",  "c&", "1", "2", "3", "4", "5", "12", "123", "1234", "12345", "a & 1 # b 2 c $ 3"};

        PaginationHelper pageHelperMultipleItemsDataset = new PaginationHelper(data, 4);
        assertEquals(4, pageHelperMultipleItemsDataset.itemsPerPageCount(0)); // Four items expected in the first page
        assertEquals(4, pageHelperMultipleItemsDataset.itemsPerPageCount(1)); // Four items expected in the first page
        assertEquals(4, pageHelperMultipleItemsDataset.itemsPerPageCount(2)); // Four items expected in the first page
        assertEquals(4, pageHelperMultipleItemsDataset.itemsPerPageCount(3)); // Four items expected in the first page
        assertEquals(4, pageHelperMultipleItemsDataset.itemsPerPageCount(4)); // Four items expected in the first page
        assertEquals(4, pageHelperMultipleItemsDataset.itemsPerPageCount(5)); // Four items expected in the first page
        assertEquals(1, pageHelperMultipleItemsDataset.itemsPerPageCount(6)); // One item expected in the last page
        assertEquals(-1, pageHelperMultipleItemsDataset.itemsPerPageCount(7)); // Minus one is expected for an invalid page
    }
}

