/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Uppgift2;

import java.util.ArrayList;

/**
 *
 * @author xdr
 */
public class Subscription {
    private RssItemList rssitemlist;
    private String title;
    private String link;
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * @return the rssitemlist
	 */
	public RssItemList getRssitemlist() {
		return rssitemlist;
	}

	/**
	 * @param rssitemlist the rssitemlist to set
	 */
	public void setRssitemlist(RssItemList rssitemlist) {
		this.rssitemlist = rssitemlist;
	}
 
    
    
}
