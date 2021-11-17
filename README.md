# InRhythm (Pagination Helper Class)


Programming Language:
The programming language that is used to create this pagination helper class is Java.

Usage:
This class can be used for implementation of pagination UI components.

How to Run:
Import this code in any Java compiler (for example Eclipse).

Description:
This file includes 2 parts:


1)	Pagination helper class:
    This class includes the constructor PaginationHelper, and below 4 methods:
    1)	pageCount() – to return the number of pages.
    2)	itemCount() - to return the number of items within the entire collection.
    3)	pageItemCount(int pageIndex) - returns the number of items on the current page.
    4)	pageIndex(int itemIndex) - determines what page an item is on.

      Note: page_index is zero based.

2)	Unit test:
 Second part includes the unit test for this code where the array includes 14 and each page will have 8 items.
The test will cover below cases:
-	Number of pages (2 pages)
-	Number of items in all pages (14 items)
-	Testing for the page item count as below:

    1)	First page (0)  max allowed number =8 items
    2) Second page (1) = the remaining items 14-8 = 6 items
    3) Out of range cases  (< 0 index or > 1 index) = -1

-	Testing to take an item index and return the page that includes this index:
    1) Item index from the first page ( Example =4 ) will return 0 (Zero Based Index).
    2) Item index from the second page ( Example =9 ) will return 1
    3) Out of range cases ( Example =  20 ,-50 ) will return -1



Help: In case of having any question or need any help please contact ghadaharb39@gmail.com 


Contributing: Ghada Harb - Ghadaharb39@gmail.com 
