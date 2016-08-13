/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uppgift2;

import java.util.ArrayList;

/**
 *
 * @author xdr
 */
public class RssItemList {

	private ArrayList<RssItem> rssitemlist;

	public RssItemList() {
		rssitemlist = new ArrayList<>();
	}

	public void addRssItem(RssItem r) {
		rssitemlist.add(r);
	}

	public void removeRssItem(int index) {
		rssitemlist.remove(index);
	}

	public int getSize() {
		return rssitemlist.size();
	}

	public RssItem getRssItem(int i) {
		return rssitemlist.get(i);
	}

	
}
