package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.a;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleRequestExtKt;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ajl;
import defpackage.arn;
import defpackage.fsl;
import defpackage.go;
import defpackage.kfl;
import defpackage.nhk;
import defpackage.oz8;
import defpackage.pg1;
import defpackage.pnl;
import defpackage.ry9;
import defpackage.vh;
import defpackage.xwl;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class AdvertisingIdClient {
    public static final Object h = new Object();
    public static volatile AdvertisingIdClient i;
    public pg1 a;
    public xwl b;
    public boolean c;
    public final Object d = new Object();
    public kfl e;
    public final Context f;
    public final long g;

    public AdvertisingIdClient(Context context) {
        arn.h(context);
        this.f = context.getApplicationContext();
        this.c = false;
        this.g = 30000L;
    }

    public static vh a(Context context) {
        int i2;
        AdvertisingIdClient advertisingIdClient = i;
        if (advertisingIdClient == null) {
            synchronized (h) {
                try {
                    advertisingIdClient = i;
                    if (advertisingIdClient == null) {
                        advertisingIdClient = new AdvertisingIdClient(context);
                        i = advertisingIdClient;
                    }
                } finally {
                }
            }
        }
        if (ry9.e == null) {
            synchronized (ry9.f) {
                try {
                    if (ry9.e == null) {
                        ry9.e = new ry9(context, 3);
                    }
                } finally {
                }
            }
        }
        ry9 ry9Var = ry9.e;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            vh f = advertisingIdClient.f();
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            advertisingIdClient.d(f, elapsedRealtime2, null);
            ry9Var.P(0, (int) (SystemClock.elapsedRealtime() - elapsedRealtime), elapsedRealtime, SystemClock.elapsedRealtime());
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 25);
            sb.append("GetInfoInternal elapse ");
            sb.append(elapsedRealtime2);
            sb.append("ms");
            Log.i("AdvertisingIdClient", sb.toString());
            return f;
        } catch (Throwable th) {
            advertisingIdClient.d(null, -1L, th);
            if (!(th instanceof IOException)) {
                if (!(th instanceof oz8)) {
                    if (th instanceof IllegalStateException) {
                        i2 = 8;
                    } else {
                        i2 = -1;
                    }
                } else {
                    i2 = 9;
                }
            } else {
                i2 = 1;
            }
            int i3 = i2;
            ry9Var.P(i3, (int) (SystemClock.elapsedRealtime() - elapsedRealtime), elapsedRealtime, SystemClock.elapsedRealtime());
            throw th;
        }
    }

    public final void b() {
        xwl pnlVar;
        arn.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    return;
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int b = a.b.b(context, 12451000);
                    if (b != 0 && b != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    pg1 pg1Var = new pg1();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (nhk.o().g(context, intent, pg1Var, 1)) {
                            this.a = pg1Var;
                            try {
                                IBinder a = pg1Var.a();
                                int i2 = fsl.f;
                                IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                if (queryLocalInterface instanceof xwl) {
                                    pnlVar = (xwl) queryLocalInterface;
                                } else {
                                    pnlVar = new pnl(a);
                                }
                                this.b = pnlVar;
                                this.c = true;
                                return;
                            } catch (InterruptedException unused) {
                                throw new IOException("Interrupted exception");
                            } catch (Throwable th) {
                                throw new IOException(th);
                            }
                        }
                        throw new IOException("Connection failure");
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new Exception();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        arn.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                Context context = this.f;
                if (context != null && this.a != null) {
                    try {
                        if (this.c) {
                            nhk.o().w(context, this.a);
                        }
                    } catch (Throwable th) {
                        Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                    }
                    this.c = false;
                    this.b = null;
                    this.a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(vh vhVar, long j, Throwable th) {
        if (Math.random() <= ConstantsKt.UNSET) {
            HashMap hashMap = new HashMap();
            String str = ModuleRequestExtKt.CAPTURE_DELTA;
            hashMap.put("app_context", ModuleRequestExtKt.CAPTURE_DELTA);
            if (vhVar != null) {
                if (true != vhVar.b) {
                    str = "0";
                }
                hashMap.put("limit_ad_tracking", str);
                String str2 = vhVar.a;
                if (str2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(str2.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new go(this, hashMap).start();
        }
    }

    public final synchronized void e() {
        try {
            if (!this.c) {
                try {
                    b();
                    if (!this.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
        } finally {
        }
    }

    public final vh f() {
        vh vhVar;
        arn.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            e();
            arn.h(this.a);
            arn.h(this.b);
            try {
                pnl pnlVar = (pnl) this.b;
                pnlVar.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                Parcel a = pnlVar.a(obtain, 1);
                String readString = a.readString();
                a.recycle();
                pnl pnlVar2 = (pnl) this.b;
                pnlVar2.getClass();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                int i2 = ajl.a;
                obtain2.writeInt(1);
                Parcel a2 = pnlVar2.a(obtain2, 2);
                if (a2.readInt() == 0) {
                    z = false;
                }
                a2.recycle();
                vhVar = new vh(readString, z);
            } catch (RemoteException e) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                throw new IOException("Remote exception", e);
            }
        }
        synchronized (this.d) {
            kfl kflVar = this.e;
            if (kflVar != null) {
                kflVar.c.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new kfl(this, j);
            }
        }
        return vhVar;
    }

    public final void finalize() {
        c();
        super.finalize();
    }
}
