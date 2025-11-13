package com.web.base.pages;

import com.web.base.pageElement.BeinButton;
import com.web.base.pageElement.PageElementModel;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private static final Log log = LogFactory.getLog(HomePage.class);
    private static BeinButton BTN_Login=new BeinButton(PageElementModel.selectorNames.XPATH,"//*[@id=\"page-header\"]/section/div[2]/div[1]/div[3]/div[1]/div/button");

    public void loginPageEnter(){
        log.info("ENTERING LOGIN PAGE");
        BTN_Login.clickAndWait(2);
    }
}
