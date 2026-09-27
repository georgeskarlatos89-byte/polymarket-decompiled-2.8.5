package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFj1zSDK;
import defpackage.qmf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFj1rSDK {
    public final CopyOnWriteArrayList<AFj1zSDK> AFAdRevenueData = new CopyOnWriteArrayList<>();
    public final AFd1zSDK getCurrencyIso4217Code;

    public AFj1rSDK(AFd1zSDK aFd1zSDK) {
        this.getCurrencyIso4217Code = aFd1zSDK;
    }

    public static /* synthetic */ void a() {
        getRevenue();
    }

    private /* synthetic */ void areAllFieldsValid(Runnable runnable) {
        AFj1xSDK aFj1xSDK = new AFj1xSDK(this.getCurrencyIso4217Code.AFAdRevenueData(), this.getCurrencyIso4217Code.getCurrencyIso4217Code(), AFj1vSDK.INSTAGRAM, runnable, new o(this, runnable, 2));
        this.AFAdRevenueData.add(aFj1xSDK);
        aFj1xSDK.getMonetizationNetwork(this.getCurrencyIso4217Code.registerClient().getCurrencyIso4217Code);
    }

    public static /* synthetic */ void b(AFj1rSDK aFj1rSDK, Runnable runnable) {
        aFj1rSDK.getMonetizationNetwork(runnable);
    }

    public static /* synthetic */ void c(AFj1rSDK aFj1rSDK, Context context, Runnable runnable, AFd1zSDK aFd1zSDK) {
        aFj1rSDK.getMonetizationNetwork(context, runnable, aFd1zSDK);
    }

    public static /* synthetic */ void d(AFj1rSDK aFj1rSDK, Runnable runnable) {
        aFj1rSDK.getMediationNetwork(runnable);
    }

    public static /* synthetic */ void e(AFj1rSDK aFj1rSDK, AFi1aSDK aFi1aSDK, Runnable runnable) {
        aFj1rSDK.getMediationNetwork(aFi1aSDK, runnable);
    }

    public static /* synthetic */ void f(AFj1rSDK aFj1rSDK, Runnable runnable) {
        aFj1rSDK.areAllFieldsValid(runnable);
    }

    public static /* synthetic */ void g(AFj1rSDK aFj1rSDK, Runnable runnable) {
        aFj1rSDK.getCurrencyIso4217Code(runnable);
    }

    private /* synthetic */ void getMediationNetwork(AFi1aSDK aFi1aSDK, Runnable runnable) {
        AFc1jSDK mediationNetwork = this.getCurrencyIso4217Code.getMediationNetwork();
        boolean z = false;
        int currencyIso4217Code = this.getCurrencyIso4217Code.AFAdRevenueData().getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0);
        boolean revenue = mediationNetwork.getRevenue(AppsFlyerProperties.NEW_REFERRER_SENT);
        if (aFi1aSDK.component2 == AFj1zSDK.AFa1ySDK.NOT_STARTED) {
            z = true;
        }
        if (currencyIso4217Code == 1) {
            if (z || revenue) {
                runnable.run();
            }
        }
    }

    private /* synthetic */ void getMonetizationNetwork(Context context, Runnable runnable, AFd1zSDK aFd1zSDK) {
        List<ResolveInfo> queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
        if (queryIntentContentProviders != null && !queryIntentContentProviders.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<ResolveInfo> it = queryIntentContentProviders.iterator();
            while (it.hasNext()) {
                ProviderInfo providerInfo = it.next().providerInfo;
                if (providerInfo != null) {
                    arrayList.add(new AFj1wSDK(providerInfo, runnable, aFd1zSDK));
                } else {
                    AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                }
            }
            if (!arrayList.isEmpty()) {
                this.AFAdRevenueData.addAll(arrayList);
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.PREINSTALL;
                StringBuilder sb = new StringBuilder("Detected ");
                sb.append(arrayList.size());
                sb.append(" valid preinstall provider(s)");
                aFLogger.d(aFg1cSDK, sb.toString());
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((AFj1zSDK) it2.next()).getMonetizationNetwork(aFd1zSDK.registerClient().getCurrencyIso4217Code);
                }
            }
        }
    }

    public final boolean AFAdRevenueData() {
        Iterator<AFj1zSDK> it = this.AFAdRevenueData.iterator();
        while (it.hasNext()) {
            if (it.next().component2 == AFj1zSDK.AFa1ySDK.STARTED) {
                return false;
            }
        }
        return true;
    }

    public final boolean getCurrencyIso4217Code(AFh1sSDK aFh1sSDK) {
        boolean z;
        int currencyIso4217Code = this.getCurrencyIso4217Code.AFAdRevenueData().getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0);
        if (currencyIso4217Code == 1 && !(aFh1sSDK instanceof AFh1pSDK)) {
            z = true;
        } else {
            z = false;
        }
        if ((this.getCurrencyIso4217Code.getMediationNetwork().getRevenue(AppsFlyerProperties.NEW_REFERRER_SENT) || currencyIso4217Code != 1) && !z) {
            return false;
        }
        return true;
    }

    public final void getRevenue(Runnable runnable) {
        this.AFAdRevenueData.add(new AFj1xSDK(this.getCurrencyIso4217Code.AFAdRevenueData(), this.getCurrencyIso4217Code.getCurrencyIso4217Code(), AFj1vSDK.FACEBOOK, runnable, new o(this, runnable, 3)));
    }

    public final AFi1aSDK AFAdRevenueData(Runnable runnable) {
        return new AFi1aSDK(new o(this, runnable, 1), this.getCurrencyIso4217Code.getCurrencyIso4217Code(), this.getCurrencyIso4217Code.AFAdRevenueData());
    }

    private static /* synthetic */ void getRevenue() {
    }

    private /* synthetic */ void getMediationNetwork(Runnable runnable) {
        try {
            if (getCurrencyIso4217Code(new AFh1pSDK())) {
                runnable.run();
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    private /* synthetic */ void getCurrencyIso4217Code(Runnable runnable) {
        this.getCurrencyIso4217Code.getCurrencyIso4217Code().execute(new o(this, runnable, 0));
    }

    public final Runnable getCurrencyIso4217Code(AFi1aSDK aFi1aSDK, Runnable runnable) {
        return new qmf(this, aFi1aSDK, runnable, 9);
    }

    public final boolean getCurrencyIso4217Code() {
        return this.getCurrencyIso4217Code.AFAdRevenueData().getMediationNetwork("AF_PREINSTALL_DISABLED");
    }

    public final void getMediationNetwork(Context context, Runnable runnable, AFd1zSDK aFd1zSDK) {
        if (aFd1zSDK.AFAdRevenueData().getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0) > 0) {
            AFLogger.INSTANCE.d(AFg1cSDK.PREINSTALL, "Preinstall referrer will not load, the counter >= 1, ");
        } else {
            aFd1zSDK.getCurrencyIso4217Code().execute(new p(this, context, runnable, aFd1zSDK, 0));
        }
    }

    private /* synthetic */ void getMonetizationNetwork(Runnable runnable) {
        AFj1xSDK aFj1xSDK = new AFj1xSDK(this.getCurrencyIso4217Code.AFAdRevenueData(), this.getCurrencyIso4217Code.getCurrencyIso4217Code(), AFj1vSDK.FACEBOOK_LITE, runnable, new q(0));
        this.AFAdRevenueData.add(aFj1xSDK);
        aFj1xSDK.getMonetizationNetwork(this.getCurrencyIso4217Code.registerClient().getCurrencyIso4217Code);
    }
}
