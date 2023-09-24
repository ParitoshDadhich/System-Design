package observerDesignPattern.observable;

import java.util.ArrayList;
import java.util.List;

import observerDesignPattern.observer.NotificationAlertObserver;

public class IphoneObservableImpl implements StockObservable{
    List<NotificationAlertObserver> observersList = new ArrayList<>();
    private int stock;

    @Override
    public void add(NotificationAlertObserver observer) {
        observersList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        if(observersList.contains(observer)) {
            observersList.remove(observer);
        } else {
            System.out.println(observer + " is not subscribed");
        }
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer: observersList) {
            observer.update();
        }
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(this.stock == 0){
            notifySubscribers();
        }
        this.stock = stock;
    }
}
