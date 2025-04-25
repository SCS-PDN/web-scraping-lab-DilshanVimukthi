import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScraper {
    public static void main(String[] args) throws IOException {
        final String url="https://bbc.com";                
    }
    private static news scrapeGlobalData(String url) throws IOException{
        Document doc = jsoup.connect(url).get();
        news scraped = new news();
        scraped.settitle(doc.select("title"));
        System.out.println("Title " + title);
        system.out.println("HEADINGS");

        for(int i =1; i<=6; i++) {
    			Elements headings = doc.select("h" + i);
    			for(Element heading : headings) {
    				System.out.println("h" + i + ": "+ heading.text());
                }
    	}
        system.out.println("LINKS");
        Elements links = doc.select("a[href]");
    		for(Element link : links) {
    			String linkHref = link.attr("abs:href");
    			String linkText = link.text();
    			System.out.println(linkText + "->" + linkHref);
    		}
        
        return news;
    }
    static class news{
        private String title;
        public String gettitle(){
            return title;
        }
        public void settitle(String title){
            this.title = title;
        }
        
    }
}
