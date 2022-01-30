package page.paginationhelper;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * pageIndexTest - Contains the Unit test for the pageIndex method in the Pagination Helper class
 * @author Antonio Navas
 */
public class pageIndexTest {

    /**
     * emptyDataset() - Unit test for an empty dataset
     *                  Page index should be minus one for an empty data set
     *                  Page index should be minus one for the twentieth item in an empty data set
     *                  Page index should be minus one for the negative tenth item in an empty data set
     */
    @Test
    public void emptyDataset() {
        Object[] data = {};

        PaginationHelper pageHelperEmptyDataset = new PaginationHelper(data, 4);
        assertEquals(-1, pageHelperEmptyDataset.pageIndex(0));
        assertEquals(-1, pageHelperEmptyDataset.pageIndex(20));
        assertEquals(-1, pageHelperEmptyDataset.pageIndex(-10));
    }

    /**
     * oneItemDataset() - Unit test for a data set with one item
     *                    Page index should be zero for the first item in a data set with one item and four items per page
     *                    Page index should be minus one for the second item in a data set with one item
     *                    Page index should be minus one for the twentieth item in a data set with one item
     *                    Page index should be minus one for the negative tenth item in a data set with one item
     */
    @Test
    public void oneItemDataset() {
        Object[] data = {"a"};

        PaginationHelper pageHelper1ItemDataset = new PaginationHelper(data, 4);
        assertEquals(0, pageHelper1ItemDataset.pageIndex(0));
        assertEquals(-1, pageHelper1ItemDataset.pageIndex(1));
        assertEquals(-1, pageHelper1ItemDataset.pageIndex(20));
        assertEquals(-1, pageHelper1ItemDataset.pageIndex(-10));
    }

    /**
     * twoItemsDataset() - Unit test for a data set with two items
     *                     Page index should be zero for the first two items in a data set with two items and four items per page
     *                     Page index should be minus one for the third item in a data set with two items
     *                     Page index should be minus one for the twentieth item in a data set with two items
     *                     Page index should be minus one for the negative tenth item in a data set with two items
     */
    @Test
    public void twoItemsDataset() {
        Object[] data = {"a", "b"};

        PaginationHelper pageHelper2ItemsDataset = new PaginationHelper(data, 4);
        assertEquals(0, pageHelper2ItemsDataset.pageIndex(0));
        assertEquals(0, pageHelper2ItemsDataset.pageIndex(1));
        assertEquals(-1, pageHelper2ItemsDataset.pageIndex(2));
        assertEquals(-1, pageHelper2ItemsDataset.pageIndex(20));
        assertEquals(-1, pageHelper2ItemsDataset.pageIndex(-10));
    }

    /**
     * threeItemsDataset() - Unit test for a data set with three items
     *                       Page index should be zero for the first three items in a data set with three items and four items per page
     *                       Page index should be minus one for the fourth item in a data set with three items
     *                       Page index should be minus one for the twentieth item in a data set with three items
     *                       Page index should be minus one for the negative tenth item in a data set with three items
     */
    @Test
    public void threeItemsDataset() {
        Object[] data = {"a", "b", "c"};

        PaginationHelper pageHelper3ItemsDataset = new PaginationHelper(data, 4);
        assertEquals(0, pageHelper3ItemsDataset.pageIndex(0));
        assertEquals(0, pageHelper3ItemsDataset.pageIndex(1));
        assertEquals(0, pageHelper3ItemsDataset.pageIndex(2));
        assertEquals(-1, pageHelper3ItemsDataset.pageIndex(3));
        assertEquals(-1, pageHelper3ItemsDataset.pageIndex(20));
        assertEquals(-1, pageHelper3ItemsDataset.pageIndex(-10));
    }

    /**
     * fourItemsDataset() - Unit test for a data set with four items
     *                      Page index should be zero for the first four items in a data set with four items and four items per page
     *                      Page index should be minus one for the fifth item in a data set with four items
     *                      Page index should be minus one for the twentieth item in a data set with four items
     *                      Page index should be minus one for the negative tenth item in a data set with four items
     */
    @Test
    public void fourItemsDataset() {
        Object[] data = {"a", "b", "c", "d"};

        PaginationHelper pageHelper4ItemsDataset = new PaginationHelper(data, 4);
        assertEquals(0, pageHelper4ItemsDataset.pageIndex(0));
        assertEquals(0, pageHelper4ItemsDataset.pageIndex(1));
        assertEquals(0, pageHelper4ItemsDataset.pageIndex(2));
        assertEquals(0, pageHelper4ItemsDataset.pageIndex(3));
        assertEquals(-1, pageHelper4ItemsDataset.pageIndex(4));
        assertEquals(-1, pageHelper4ItemsDataset.pageIndex(20));
        assertEquals(-1, pageHelper4ItemsDataset.pageIndex(-10));
    }

    /**
     * fiveItemsDataset() - Unit test for a data set with five items
     *                      Page index should be zero for the first fourth items in a data set with five items and four items per page
     *                      Page index should be one for the fifth items in a data set with five items and four items per page
     *                      Page index should be minus one for the sixth item in a data set with five items
     *                      Page index should be minus one for the twentieth item in a data set with five items
     *                      Page index should be minus one for the negative tenth item in a data set with five items
     */
    @Test
    public void fiveItemsDataset() {
        Object[] data = {"a", "b", "c", "d", "e"};

        PaginationHelper pageHelper5ItemsDataset = new PaginationHelper(data, 4);
        assertEquals(0, pageHelper5ItemsDataset.pageIndex(0));
        assertEquals(0, pageHelper5ItemsDataset.pageIndex(1));
        assertEquals(0, pageHelper5ItemsDataset.pageIndex(2));
        assertEquals(0, pageHelper5ItemsDataset.pageIndex(3));
        assertEquals(1, pageHelper5ItemsDataset.pageIndex(4));
        assertEquals(-1, pageHelper5ItemsDataset.pageIndex(5));
        assertEquals(-1, pageHelper5ItemsDataset.pageIndex(20));
        assertEquals(-1, pageHelper5ItemsDataset.pageIndex(-10));
    }

    /**
     * sixItemsDataset() - Unit test for a data set with six items
     *                     This is the sample dataset provided in the exercise
     *
     *                     Page index should be zero for the first fourth items in a data set with six items and four items per page
     *                     Page index should be one for the last two items in a data set with six items and four items per page
     *                     Page index should be zero for the sixth item in a data set with six items
     *                     Page index should be minus one for the seventh item in a data set with six items
     *                     Page index should be minus one for the twentieth item in a data set with six items
     *                     Page index should be minus one for the negative tenth item in a data set with six items
     */
    @Test
    public void sixItemsDataset() {
        Object[] data = {"a", "b", "c", "d", "e", "f"};

        PaginationHelper pageHelper6ItemsDataset = new PaginationHelper(data, 4);
        assertEquals(0, pageHelper6ItemsDataset.pageIndex(0));
        assertEquals(0, pageHelper6ItemsDataset.pageIndex(1));
        assertEquals(0, pageHelper6ItemsDataset.pageIndex(2));
        assertEquals(0, pageHelper6ItemsDataset.pageIndex(3));
        assertEquals(1, pageHelper6ItemsDataset.pageIndex(4));
        assertEquals(1, pageHelper6ItemsDataset.pageIndex(5));
        assertEquals(-1, pageHelper6ItemsDataset.pageIndex(6));
        assertEquals(-1, pageHelper6ItemsDataset.pageIndex(20));
        assertEquals(-1, pageHelper6ItemsDataset.pageIndex(-10));
    }

    /**
     * oneItemDataset() - Unit test for a data set with one item
     *                     Page index should be zero for the first four items in a data set with twenty-five items and four items per page
     *                     Page index should be n+1 (where n = 1 ... total items in the dataset) for the next four items in a data set with twenty-five items and four items per page
     *                     Page index should be minus one for the twenty-sixth item in a data set with twenty-five items
     *                     Page index should be minus one for the negative tenth item in a data set with twenty-five items
     */
    @Test
    public void multipleItemsDataset() {
        Object[] data = {"a", "b", "c", "d", "e", "f", "aa", "ab", "abc", "abcd", "abcde", "abcdef", "a&", "b&",  "c&", "1", "2", "3", "4", "5", "12", "123", "1234", "12345", "a & 1 # b 2 c $ 3"};

        PaginationHelper pageHelperMultipleItemsDataset = new PaginationHelper(data, 4);
        assertEquals(0, pageHelperMultipleItemsDataset.pageIndex(0));
        assertEquals(0, pageHelperMultipleItemsDataset.pageIndex(1));
        assertEquals(0, pageHelperMultipleItemsDataset.pageIndex(2));
        assertEquals(0, pageHelperMultipleItemsDataset.pageIndex(3));
        assertEquals(1, pageHelperMultipleItemsDataset.pageIndex(4));
        assertEquals(1, pageHelperMultipleItemsDataset.pageIndex(5));
        assertEquals(1, pageHelperMultipleItemsDataset.pageIndex(6));
        assertEquals(1, pageHelperMultipleItemsDataset.pageIndex(7));
        assertEquals(2, pageHelperMultipleItemsDataset.pageIndex(8));
        assertEquals(2, pageHelperMultipleItemsDataset.pageIndex(9));
        assertEquals(2, pageHelperMultipleItemsDataset.pageIndex(10));
        assertEquals(2, pageHelperMultipleItemsDataset.pageIndex(11));
        assertEquals(3, pageHelperMultipleItemsDataset.pageIndex(12));
        assertEquals(3, pageHelperMultipleItemsDataset.pageIndex(13));
        assertEquals(3, pageHelperMultipleItemsDataset.pageIndex(14));
        assertEquals(3, pageHelperMultipleItemsDataset.pageIndex(15));
        assertEquals(4, pageHelperMultipleItemsDataset.pageIndex(16));
        assertEquals(4, pageHelperMultipleItemsDataset.pageIndex(17));
        assertEquals(4, pageHelperMultipleItemsDataset.pageIndex(18));
        assertEquals(4, pageHelperMultipleItemsDataset.pageIndex(19));
        assertEquals(5, pageHelperMultipleItemsDataset.pageIndex(20));
        assertEquals(5, pageHelperMultipleItemsDataset.pageIndex(21));
        assertEquals(5, pageHelperMultipleItemsDataset.pageIndex(22));
        assertEquals(5, pageHelperMultipleItemsDataset.pageIndex(23));
        assertEquals(6, pageHelperMultipleItemsDataset.pageIndex(24));
        assertEquals(-1, pageHelperMultipleItemsDataset.pageIndex(25));
        assertEquals(-1, pageHelperMultipleItemsDataset.pageIndex(-10));
    }
}
