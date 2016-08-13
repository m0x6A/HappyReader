/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Uppgift2;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author xdr
 */
public class HappyReaderUtility {

	public static SubscriptionsList createSubscriptionList(File f) {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setValidating(false);
		DocumentBuilder db = null;
		try {
			db = dbf.newDocumentBuilder();
		} catch (ParserConfigurationException ex) {
			Logger.getLogger(HappyReaderUtility.class.getName()).log(Level.SEVERE, null, ex);
		}
		Document doc = null;
		try {
			doc = db.parse(f);
		} catch (SAXException | IOException ex) {
			Logger.getLogger(HappyReaderUtility.class.getName()).log(Level.SEVERE, null, ex);
		}
		SubscriptionsList mySubscriptionsList = new SubscriptionsList();
		NodeList subscriptionsList = doc.getElementsByTagName("feed");

		for (int i = 0; i < subscriptionsList.getLength(); i++) {
			Subscription s = new Subscription();
			Element subscriptionElement
				= (Element) subscriptionsList.item(i);

			NodeList titleList
				= subscriptionElement.getElementsByTagName("title");
			String title
				= titleList.item(0).getFirstChild().getNodeValue();
			s.setTitle(title);

			NodeList linkList = subscriptionElement.getElementsByTagName("link");
			String link = linkList.item(0).getFirstChild().getNodeValue();
			s.setLink(link);

			mySubscriptionsList.addSubscription(s);

		}

		return mySubscriptionsList;
	}

	public static RssItemList createRssItemList(String urlStr) throws SAXException,
		IOException, ParserConfigurationException {
		URL url = new URL(urlStr);
		RssItemList myRssItemList = new RssItemList();

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		Document doc = dbf.newDocumentBuilder().parse(url.openStream());

		NodeList rssItemList = doc.getElementsByTagName("item");

		for (int i = 0; i < rssItemList.getLength(); i++) {
			RssItem r = new RssItem();
			Element rssElement = (Element) rssItemList.item(i);

			NodeList titleList = rssElement.getElementsByTagName("title");
			String title = titleList.item(0).getFirstChild().getNodeValue();
			r.setTitle(title);

			NodeList descriptionList = rssElement.getElementsByTagName("description");
			String description = descriptionList.item(0).getFirstChild().getNodeValue();
			r.setDescription(description);

			NodeList dateList = rssElement.getElementsByTagName("pubDate");
			String date = dateList.item(0).getFirstChild().getNodeValue();

			r.setPubDate(date);

			NodeList linkList = rssElement.getElementsByTagName("link");
			String link = linkList.item(0).getFirstChild().getNodeValue();
			r.setUrl(link);
			myRssItemList.addRssItem(r);

		}
		return myRssItemList;
	}

}
