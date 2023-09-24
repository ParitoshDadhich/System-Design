package observerDesignPattern.observable;

import observerDesignPattern.observer.NotificationAlertObserver;

import java.util.List;

public interface StockObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
	public void setStock(int i);
}
