package page.paginationhelper;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * pagesCountTest() - Contains the Unit test for the pagesCount method in the Pagination Helper class
 * @author Antonio Navas
 */
public class pagesCountTest {

    /**
     * emptyDataset() - Unit test for an empty dataset
     *                  Page count should be zero for an empty data set
     */
    @Test
    public void emptyDataset() {
        Object[] data = {};

        PaginationHelper pageHelperEmptyDataset = new PaginationHelper(data, 4);
        assertEquals(0, pageHelperEmptyDataset.pagesCount());
    }

    /**
     * oneItemDataset() - Unit test for a data set with one item
     *                    Page count should be one for a data set with one item
     */
    @Test
    public void oneItemDataset() {
        Object[] data = {"a"};

        PaginationHelper pageHelper1ItemDataset = new PaginationHelper(data, 4);
        assertEquals(1, pageHelper1ItemDataset.pagesCount());
    }

    /**
     * twoItemsDataset() - Unit test for a data set with two items
     *                     Page count should be one for a data set with two items
     */
    @Test
    public void twoItemsDataset() {
        Object[] data = {"a", "b"};

        PaginationHelper pageHelper2ItemsDataset = new PaginationHelper(data, 4);
        assertEquals(1, pageHelper2ItemsDataset.pagesCount());
    }

    /**
     * threeItemsDataset() - Unit test for a data set with three items
     *                       Page count should be one for a data set with three items
     */
    @Test
    public void threeItemsDataset() {
        Object[] data = {"a", "b", "c"};

        PaginationHelper pageHelper3ItemsDataset = new PaginationHelper(data, 4);
        assertEquals(1, pageHelper3ItemsDataset.pagesCount());
    }

    /**
     * fourItemsDataset() - Unit test for a data set with four items
     *                      Page count should be one for a data set with four items
     */
    @Test
    public void fourItemsDataset() {
        Object[] data = {"a", "b", "c", "d"};

        PaginationHelper pageHelper4ItemsDataset = new PaginationHelper(data, 4);
        assertEquals(1, pageHelper4ItemsDataset.pagesCount());
    }

    /**
     * fiveItemsDataset() - Unit test for a data set with five items
     *                      Page count should be two for a data set with five items
     */
    @Test
    public void fiveItemsDataset() {
        Object[] data = {"a", "b", "c", "d", "e"};

        PaginationHelper pageHelper5ItemsDataset = new PaginationHelper(data, 4);
        assertEquals(2, pageHelper5ItemsDataset.pagesCount());
    }

    /**
     * sixItemsDataset() - Unit test for a data set with six items
     *                     Page count should be two for a data set with six items
     *                     This is the sample dataset provided in the exercise
     */
    @Test
    public void sixItemsDataset() {
        Object[] data = {"a", "b", "c", "d", "e", "f"};

        PaginationHelper pageHelper6ItemsDataset = new PaginationHelper(data, 4);
        assertEquals(2, pageHelper6ItemsDataset.pagesCount());
    }

    /**
     * oneItemDataset() - Unit test for a data set with one item
     *                    Page count should always be (number of items in the dataset) / (items per page) for any given dataset
     *                    Page count should be seven for the data set given in this example
     */
    @Test
    public void multipleItemsDataset() {
        Object[] data = {"a", "b", "c", "d", "e", "f", "aa", "ab", "abc", "abcd", "abcde", "abcdef", "a&", "b&",  "c&", "1", "2", "3", "4", "5", "12", "123", "1234", "12345", "a & 1 # b 2 c $ 3"};

        PaginationHelper pageHelperMultipleItemsDataset = new PaginationHelper(data, 4);
        assertEquals(7, pageHelperMultipleItemsDataset.pagesCount());
    }
}
