/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Uppgift2;
/**
 *
 * @author xdr
 */
import javax.swing.AbstractListModel;


public class SubscriptionListModel  extends AbstractListModel {
private SubscriptionsList subscriptionsList;

	@Override
	public int getSize() {
		return subscriptionsList.subscriptionListSize();
	}

	@Override
	public Object getElementAt(int i) {
		Subscription s = subscriptionsList.getSubscription(i);
		String title = s.getTitle();
		return title;
	}

	/**
	 * @return the subscriptionsList
	 */
	public SubscriptionsList getSubscriptionsList() {
		return subscriptionsList;
	}

	/**
	 * @param subscriptionsList the subscriptionsList to set
	 */
	public void setSubscriptionsList(SubscriptionsList subscriptionsList) {
		this.subscriptionsList = subscriptionsList;
		this.fireContentsChanged(this, 0, subscriptionsList.subscriptionListSize()-1);
	}
  
}
