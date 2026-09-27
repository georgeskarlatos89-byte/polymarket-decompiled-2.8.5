package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class AFj1zSDK extends Observable {
    public final String AFAdRevenueData;
    long areAllFieldsValid;
    public final String component4;
    final Runnable getRevenue;
    public final Map<String, Object> getCurrencyIso4217Code = new HashMap();
    public AFa1ySDK component2 = AFa1ySDK.NOT_STARTED;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* renamed from: com.appsflyer.internal.AFj1zSDK$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements Observer {
        public AnonymousClass3() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFj1zSDK.this.getRevenue.run();
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes.dex */
    public enum AFa1ySDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public AFj1zSDK(String str, String str2, Runnable runnable) {
        this.getRevenue = runnable;
        this.AFAdRevenueData = str2;
        this.component4 = str;
    }

    public final void getCurrencyIso4217Code() {
        this.getCurrencyIso4217Code.put("source", this.AFAdRevenueData);
        this.getCurrencyIso4217Code.put("type", this.component4);
        getRevenue();
        this.component2 = AFa1ySDK.FINISHED;
        setChanged();
        notifyObservers();
    }

    public abstract void getMonetizationNetwork(Context context);

    public void getRevenue() {
        this.getCurrencyIso4217Code.put("latency", Long.valueOf(System.currentTimeMillis() - this.areAllFieldsValid));
    }
}
