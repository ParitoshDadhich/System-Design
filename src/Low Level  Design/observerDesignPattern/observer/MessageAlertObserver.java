package observerDesignPattern.observer;

import observerDesignPattern.observable.StockObservable;

public class MessageAlertObserver implements NotificationAlertObserver {
    String contactNum;
    StockObservable iphoneObservable;

    public MessageAlertObserver(String contactNum, StockObservable iphoneObservable) {
        this.contactNum = contactNum;
        this.iphoneObservable = iphoneObservable;
    }

    @Override
    public void update() {
        sendMessage(this.contactNum, "stock has arrived. Hurry up!!!");
    }

    private void sendMessage(String contactNum, String updateMessage){
        System.out.println("Update on: " + contactNum);
        System.out.println(updateMessage + "\n");
    }
}
