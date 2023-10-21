import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class refresh {

    private static final String URL_TO_REFRESH = "https://ticketnew.com/movies/chennai/devi-cineplex-anna-salai-c/4184";
    private static final int REFRESH_INTERVAL_MS = 30000;  // 30 seconds

    public static void main(String[] args) {
        // Set the path to your chromedriver executable
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        WebDriver driver = new ChromeDriver();

        try {
            while (true) {
                // Navigate to the desired URL
                driver.get(URL_TO_REFRESH);

                // Wait for the specified refresh interval before refreshing again
                Thread.sleep(REFRESH_INTERVAL_MS);

                // Refresh the page by navigating to the URL again
                driver.navigate().refresh();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
