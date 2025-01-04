package org.example.models;

import java.util.Objects;
import java.util.Random;

public class MarketUpdateNotification extends Notification {
    CoinType coinType;
    Double price;
    String tradeVol;
    Double intraDayHighPrice;
    Double marketCap;

    public MarketUpdateNotification() {
        super();
    }

    public MarketUpdateNotification(Long id ,CoinType coinType, Double price, String tradeVol, Double intraDayHighPrice, Double marketCap) {
        super(id, NotificationType.MARKET_UPDATE, System.currentTimeMillis());
        this.coinType = coinType;
        this.price = price;
        this.tradeVol = tradeVol;
        this.intraDayHighPrice = intraDayHighPrice;
        this.marketCap = marketCap;
    }

    public CoinType getCoinType() {
        return coinType;
    }

    public void setCoinType(CoinType coinType) {
        this.coinType = coinType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTradeVol() {
        return tradeVol;
    }

    public void setTradeVol(String tradeVol) {
        this.tradeVol = tradeVol;
    }

    public Double getIntraDayHighPrice() {
        return intraDayHighPrice;
    }

    public void setIntraDayHighPrice(Double intraDayHighPrice) {
        this.intraDayHighPrice = intraDayHighPrice;
    }

    public Double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(Double marketCap) {
        this.marketCap = marketCap;
    }

    @Override
    public void getNotificationPayload() {
        this.id = new Random().nextLong();
        this.type = NotificationType.MARKET_UPDATE;
        this.coinType = CoinType.BTC;
        this.price = 10000.0;
        this.tradeVol = "1000";
        this.intraDayHighPrice = 11000.0;
        this.marketCap = 100000000.0;
    }

    @Override
    public String toString() {
        return "MarketUpdateNotification{" +
                super.toString() +
                ", coinType=" + coinType +
                ", price=" + price +
                ", tradeVol='" + tradeVol + '\'' +
                ", intraDayHighPrice=" + intraDayHighPrice +
                ", marketCap=" + marketCap +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MarketUpdateNotification)) return false;
        MarketUpdateNotification that = (MarketUpdateNotification) o;
        return super.equals(that) &&  coinType == that.coinType && Objects.equals(price, that.price) && Objects.equals(tradeVol, that.tradeVol) && Objects.equals(intraDayHighPrice, that.intraDayHighPrice) && Objects.equals(marketCap, that.marketCap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), coinType, price, tradeVol, intraDayHighPrice, marketCap);
    }
}
