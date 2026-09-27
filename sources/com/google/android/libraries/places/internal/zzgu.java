package com.google.android.libraries.places.internal;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import defpackage.dmk;
import defpackage.ji4;
import defpackage.jr9;
import defpackage.we8;
import defpackage.wwf;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzgu {
    public static final /* synthetic */ int zza = 0;
    private static final long zzb = 60000000;
    private final zzfd zzc;
    private final Context zzd;

    public zzgu(Context context, zzfd zzfdVar) {
        this.zzd = context;
        this.zzc = zzfdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (r10.contains("_optout") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jr9 zza(String str) {
        boolean z;
        WifiManager wifiManager = (WifiManager) this.zzd.getSystemService("wifi");
        if (wifiManager != null && wifiManager.isWifiEnabled()) {
            List<ScanResult> scanResults = wifiManager.getScanResults();
            if (scanResults != null && !scanResults.isEmpty()) {
                wwf x = jr9.x(new ji4(zzgt.zza), scanResults);
                ArrayList arrayList = new ArrayList();
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                int i = x.d;
                for (int i2 = 0; i2 < i; i2++) {
                    ScanResult scanResult = (ScanResult) x.get(i2);
                    if (!TextUtils.isEmpty(scanResult.SSID)) {
                        long zzb2 = (this.zzc.zzb() * 1000) - scanResult.timestamp;
                        long j = zzb;
                        String str2 = scanResult.SSID;
                        if (str2 != null) {
                            if (str2.indexOf(95) >= 0) {
                                String lowerCase = str2.toLowerCase(Locale.ENGLISH);
                                z = true;
                                if (!lowerCase.contains("_nomap")) {
                                }
                                if (zzb2 <= j && !z) {
                                    arrayList.add(new zzgs(connectionInfo, scanResult));
                                }
                            }
                            z = false;
                            if (zzb2 <= j) {
                                arrayList.add(new zzgs(connectionInfo, scanResult));
                            }
                        } else {
                            dmk.v("Null SSID.");
                            return null;
                        }
                    }
                }
                return jr9.m(arrayList);
            }
            we8 we8Var = jr9.b;
            return wwf.e;
        }
        we8 we8Var2 = jr9.b;
        return wwf.e;
    }
}
