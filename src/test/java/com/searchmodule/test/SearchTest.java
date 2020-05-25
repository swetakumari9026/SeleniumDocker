package com.searchmodule.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.searchmodule.pages.SearchPage;
import com.tests.base.BaseClass;

public class SearchTest extends BaseClass {
    
	private WebDriver driver;
	
    @Test
    @Parameters("keyword")
    public void search(String keyword){
        SearchPage searchPage = new SearchPage(driver);
        searchPage.goTo();
        searchPage.doSearch(keyword);
        searchPage.goToVideos();
        int result = searchPage.getResult();
        Assert.assertTrue(result>0);
    }
}
