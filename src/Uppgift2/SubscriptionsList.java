
package Uppgift2;
/**
 *
 * @author xdr
 */
import java.util.ArrayList;


public class SubscriptionsList {

    
    private ArrayList<Subscription> subscriptionsList;
    
    public SubscriptionsList()
    {
	    subscriptionsList = new ArrayList<Subscription>();
    }
    
    public void addSubscription(Subscription s)
    {
        subscriptionsList.add(s);
    }
    
    public void removeSubscription(int index)
    {
        subscriptionsList.remove(index);
    }
    
    public int subscriptionListSize()
    {
        return subscriptionsList.size();
    }
    
    public Subscription getSubscription(int i)
    {
        return subscriptionsList.get(i);
    }
    
}
