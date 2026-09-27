package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.appsflyer.AFLogger;
import defpackage.dmk;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Deprecated
/* loaded from: classes.dex */
public final class AFb1vSDK {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes.dex */
    public static final class AFa1uSDK implements IInterface {
        private final IBinder AFAdRevenueData;

        public AFa1uSDK(IBinder iBinder) {
            this.AFAdRevenueData = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.AFAdRevenueData;
        }

        public final boolean getCurrencyIso4217Code() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.AFAdRevenueData.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final String getRevenue() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.AFAdRevenueData.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes.dex */
    public static final class AFa1vSDK {
        private final boolean AFAdRevenueData;
        public final String getCurrencyIso4217Code;

        public AFa1vSDK(String str, boolean z) {
            this.getCurrencyIso4217Code = str;
            this.AFAdRevenueData = z;
        }

        public final boolean AFAdRevenueData() {
            return this.AFAdRevenueData;
        }
    }

    public static AFa1vSDK getMediationNetwork(Context context) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            AFa1ySDK aFa1ySDK = new AFa1ySDK();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.bindService(intent, aFa1ySDK, 1)) {
                    if (!aFa1ySDK.AFAdRevenueData) {
                        aFa1ySDK.AFAdRevenueData = true;
                        IBinder poll = aFa1ySDK.getRevenue.poll(10L, TimeUnit.SECONDS);
                        if (poll != null) {
                            AFa1uSDK aFa1uSDK = new AFa1uSDK(poll);
                            return new AFa1vSDK(aFa1uSDK.getRevenue(), aFa1uSDK.getCurrencyIso4217Code());
                        }
                        throw new TimeoutException("Timed out waiting for the service connection");
                    }
                    throw new IllegalStateException("Cannot call get on this connection more than once");
                }
                context.unbindService(aFa1ySDK);
                dmk.x("Google Play connection failed");
                return null;
            } finally {
                context.unbindService(aFa1ySDK);
            }
        }
        dmk.n("Cannot be called from the main thread");
        return null;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes.dex */
    public static final class AFa1ySDK implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> getRevenue = new LinkedBlockingQueue<>(1);
        boolean AFAdRevenueData = false;

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.getRevenue.put(iBinder);
            } catch (InterruptedException e) {
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", e);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
