package page.paginationhelper;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * itemsCountTest - Contains the Unit test for the itemsCount method in the Pagination Helper class
 * @author Antonio Navas
 */
public class itemsCountTest {

    /**
     * emptyDataset() - Unit test for an empty dataset
     *                  Item count should be zero for an empty data set
     */
    @Test
    public void emptyDataset() {
        Object[] data = {};

        PaginationHelper pageHelperEmptyDataset = new PaginationHelper(data, 4);
        assertEquals(0, pageHelperEmptyDataset.itemsCount());
    }

    /**
     * oneItemDataset() - Unit test for a data set with one item
     *                    Item count should be one for a data set with one item
     */
    @Test
    public void oneItemDataset() {
        Object[] data = {"a"};

        PaginationHelper pageHelper1ItemDataset = new PaginationHelper(data, 4);
        assertEquals(1, pageHelper1ItemDataset.itemsCount());
    }

    /**
     * twoItemsDataset() - Unit test for a data set with two items
     *                     Item count should be two for a data set with two items
     */
    @Test
    public void twoItemsDataset() {
        Object[] data = {"a", "b"};

        PaginationHelper pageHelper2ItemsDataset = new PaginationHelper(data, 4);
        assertEquals(2, pageHelper2ItemsDataset.itemsCount());
    }

    /**
     * threeItemsDataset() - Unit test for a data set with three items
     *                       Item count should be three for a data set with three items
     */
    @Test
    public void threeItemsDataset() {
        Object[] data = {"a", "b", "c"};

        PaginationHelper pageHelper3ItemsDataset = new PaginationHelper(data, 4);
        assertEquals(3, pageHelper3ItemsDataset.itemsCount());
    }

    /**
     * fourItemsDataset() - Unit test for a data set with four items
     *                      Item count should be four for a data set with four items
     */
    @Test
    public void fourItemsDataset() {
        Object[] data = {"a", "b", "c", "d"};

        PaginationHelper pageHelper4ItemsDataset = new PaginationHelper(data, 4);
        assertEquals(4, pageHelper4ItemsDataset.itemsCount());
    }

    /**
     * fiveItemsDataset() - Unit test for a data set with five items
     *                      Item count should be five for a data set with five items
     */
    @Test
    public void fiveItemsDataset() {
        Object[] data = {"a", "b", "c", "d", "e"};

        PaginationHelper pageHelper5ItemsDataset = new PaginationHelper(data, 4);
        assertEquals(5, pageHelper5ItemsDataset.itemsCount());
    }

    /**
     * sixItemsDataset() - Unit test for a data set with six items
     *                     Item count should be six for a data set with six items
     *                     This is the sample dataset provided in the exercise
     */
    @Test
    public void sixItemsDataset() {
        Object[] data = {"a", "b", "c", "d", "e", "f"};

        PaginationHelper pageHelper6ItemsDataset = new PaginationHelper(data, 4);
        assertEquals(6, pageHelper6ItemsDataset.itemsCount());
    }

    /**
     * oneItemDataset() - Unit test for a data set with one item
     *                    Item count should always be (number of items in the dataset) for any given dataset
     *                    Item count should be twenty-five for the data set given in this example
     */
    @Test
    public void multipleItemsDataset() {
        Object[] data = {"a", "b", "c", "d", "e", "f", "aa", "ab", "abc", "abcd", "abcde", "abcdef", "a&", "b&",  "c&", "1", "2", "3", "4", "5", "12", "123", "1234", "12345", "a & 1 # b 2 c $ 3"};

        PaginationHelper pageHelperMultipleItemsDataset = new PaginationHelper(data, 4);
        assertEquals(25, pageHelperMultipleItemsDataset.itemsCount());
    }
}
