package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTest1_AfterTest1 {
	@BeforeTest
    public void setupTestBlock() {
        System.out.println("Setting up for Amazon tests (DB/API)");
    }

    @Test
    public void testSearchProduct() {
        System.out.println("Searching for a product...");
    }

    @Test
    public void testAddToCart() {
        System.out.println("Adding product to cart...");
    }

    @AfterTest
    public void tearDownTestBlock() {
        System.out.println("Clean up after Amazon tests (DB/API)");
    }
}
