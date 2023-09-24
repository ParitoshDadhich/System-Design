package observerDesignPattern.observer;

import observerDesignPattern.observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{

    String emailId;
    StockObservable stockObservable;

    public EmailAlertObserver(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendEmail(this.emailId, "stock has arrived. Hurry up!!!");
    }

    private void sendEmail(String emailId, String updateMessage){
        System.out.println("Send email to: " + emailId);
        System.out.println(updateMessage + "\n");
    }
}
