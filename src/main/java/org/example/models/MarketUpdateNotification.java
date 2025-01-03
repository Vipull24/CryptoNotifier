package org.example.models;

public class MarketUpdateNotification extends Notification {
    CoinType coinType;
    Double price;
    String tradeVol;
    Double intraDayHighPrice;
    Double marketCap;

    public MarketUpdateNotification() {
    }

    public MarketUpdateNotification(CoinType coinType, Double price, String tradeVol, Double intraDayHighPrice, Double marketCap) {
        this.coinType = coinType;
        this.price = price;
        this.tradeVol = tradeVol;
        this.intraDayHighPrice = intraDayHighPrice;
        this.marketCap = marketCap;
    }

    @Override
    public void getNotificationPayload() {

    }
}
