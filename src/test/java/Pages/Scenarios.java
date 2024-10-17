package Pages;

import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class Scenarios {
    protected static  Playwright playwright = Playwright.create();
    protected static BrowserType chrome = playwright.chromium();
  protected static  Browser browser = chrome.launch(new BrowserType.LaunchOptions().setHeadless(false));

    protected static Page page = browser.newPage();

   static String expectedName = "Playwright for Java";
    public static void launchpad() {
        page.navigate("https://playwright.dev/");
    }
    public static void selectDropdown() {
        page.click("//a[@class= 'navbar__link']");
        page.click("text='Java'");


    }
    public static void validateJavaOpens(){
        String title =page.locator("//div[@class='navbar__items']//b[@class='navbar__title text--truncate']").innerText();
        if (title.equals(expectedName)) {
            System.out.println("Navigated to Playwright for java");}
        else {
            System.out.println("Could not navigate to Playwright for java");
            page.close();
        }


    }

public static void  searchBox(){
    //page.waitForSelector("//span[@class='DocSearch-Button-Placeholder']");
    page.waitForTimeout(2000);
    page.locator("//button[@aria-label='Search']").click();

}
public static void searchTopic(String topic) {
    page.fill(" //input[@id='docsearch-input']",topic);
    page.locator(("(//div[@class='DocSearch-Hit-action'])[1]")).click();

    System.out.println("Searched for topic: " +topic);
}
public static void confirmTopic(String header){
               boolean confirmation = page.url().contains(header);
              if (confirmation) {
                   System.out.println(header +",The expected topic page is opened.");

          }
          else {
                System.out.println(page.url() +",Expected topic page did not open.");
           }

 if(page.url().contains("screenshots")) {

                      page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshots.png")).setFullPage(true));
                  } 
else { page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("xpath.png")).setFullPage(true));


 }
    }

}




