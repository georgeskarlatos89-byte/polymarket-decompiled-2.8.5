package com.google.android.libraries.places.internal;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzgs {
    private final String zza;
    private final int zzb;
    private final zzgr zzc;
    private final boolean zzd;
    private final int zze;

    public zzgs(WifiInfo wifiInfo, ScanResult scanResult) {
        zzgr zzgrVar;
        String str = scanResult.BSSID;
        String str2 = scanResult.capabilities;
        int i = scanResult.level;
        int i2 = scanResult.frequency;
        if (TextUtils.isEmpty(str2)) {
            zzgrVar = zzgr.OTHER;
        } else {
            String upperCase = str2.toUpperCase(Locale.getDefault());
            if (!upperCase.equals("[ESS]") && !upperCase.equals("[IBSS]")) {
                if (upperCase.matches(".*WPA[0-9]*-PSK.*")) {
                    zzgrVar = zzgr.PSK;
                } else if (upperCase.matches(".*WPA[0-9]*-EAP.*")) {
                    zzgrVar = zzgr.EAP;
                } else {
                    zzgrVar = zzgr.OTHER;
                }
            } else {
                zzgrVar = zzgr.NONE;
            }
        }
        boolean z = false;
        if (wifiInfo != null && !TextUtils.isEmpty(str) && str.equalsIgnoreCase(wifiInfo.getBSSID())) {
            z = true;
        }
        this.zza = str;
        this.zzb = i;
        this.zzc = zzgrVar;
        this.zzd = z;
        this.zze = i2;
    }

    public final String zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zzgr zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzd;
    }

    public final int zze() {
        return this.zze;
    }
}
