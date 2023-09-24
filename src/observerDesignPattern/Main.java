package observerDesignPattern;

import observerDesignPattern.observable.IphoneObservableImpl;
import observerDesignPattern.observable.StockObservable;
import observerDesignPattern.observer.EmailAlertObserver;
import observerDesignPattern.observer.MessageAlertObserver;
import observerDesignPattern.observer.NotificationAlertObserver;

public class Main {
	
	public static void main(String[] args) {
		/*
		 *  The main idea of this example is to implement a notifyMe functionality.
		 *  If we are loaded with stock after getting out of stock the we are notifying all the observers.
		 *   
		 *   In this example 
		 *   	Observerable - IPHONE
		 *   	Notifying Users through-> Email and mobile
		 * */
		
		
		StockObservable iphoneStockObservable = new IphoneObservableImpl();
		   
	    NotificationAlertObserver observer1 = new EmailAlertObserver("abc@gmail.com", iphoneStockObservable);
	    NotificationAlertObserver observer2 = new MessageAlertObserver("1234567890", iphoneStockObservable);

	    iphoneStockObservable.add(observer1);
	    iphoneStockObservable.add(observer2);

	    iphoneStockObservable.setStock(100);
	    iphoneStockObservable.setStock(0);
	    
	    iphoneStockObservable.remove(observer1);
	    
	    iphoneStockObservable.setStock(1000);
	}
}
