package com.google.android.libraries.places.internal;

import defpackage.brn;
import defpackage.npn;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcaz {
    private static zzcaz zza;
    private final Object zzb = new Object();
    private final Set zzc = new HashSet();
    private zzcay[] zzd = new zzcay[5];
    private int zze;

    public static synchronized zzcaz zza() {
        zzcaz zzcazVar;
        synchronized (zzcaz.class) {
            zzcazVar = zza;
            if (zzcazVar == null) {
                zzcazVar = new zzcaz();
                zza = zzcazVar;
            }
        }
        return zzcazVar;
    }

    private final void zze() {
        zzcay[] zzcayVarArr = this.zzd;
        this.zzd = (zzcay[]) Arrays.copyOf(zzcayVarArr, zzcayVarArr.length + 5);
    }

    public final List zzb() {
        List unmodifiableList;
        synchronized (this.zzb) {
            unmodifiableList = Collections.unmodifiableList(Arrays.asList((zzcay[]) Arrays.copyOfRange(this.zzd, 0, this.zze)));
        }
        return unmodifiableList;
    }

    public final zzcag zzc(String str, String str2, String str3, List list, List list2, boolean z) {
        zzcag zzcagVar;
        brn.g("missing metric name", !npn.c(str));
        brn.m(str2, "description");
        brn.m(str3, "unit");
        brn.m(list, "requiredLabelKeys");
        brn.m(list2, "optionalLabelKeys");
        synchronized (this.zzb) {
            try {
                Set set = this.zzc;
                if (!set.contains(str)) {
                    int i = this.zze;
                    if (i + 1 == this.zzd.length) {
                        zze();
                    }
                    zzcagVar = new zzcag(i, str, str2, str3, list, list2, false);
                    this.zzd[i] = zzcagVar;
                    set.add(str);
                    this.zze++;
                } else {
                    StringBuilder sb = new StringBuilder(str.length() + 32);
                    sb.append("Metric with name ");
                    sb.append(str);
                    sb.append(" already exists");
                    throw new IllegalStateException(sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzcagVar;
    }

    public final zzcah zzd(String str, String str2, String str3, List list, List list2, boolean z) {
        zzcah zzcahVar;
        brn.g("missing metric name", !npn.c("grpc.subchannel.open_connections"));
        brn.m(list, "requiredLabelKeys");
        brn.m(list2, "optionalLabelKeys");
        synchronized (this.zzb) {
            try {
                Set set = this.zzc;
                if (!set.contains("grpc.subchannel.open_connections")) {
                    int i = this.zze;
                    if (i + 1 == this.zzd.length) {
                        zze();
                    }
                    zzcahVar = new zzcah(i, "grpc.subchannel.open_connections", "EXPERIMENTAL. Number of open connections.", "{connection}", list, list2, false);
                    this.zzd[i] = zzcahVar;
                    set.add("grpc.subchannel.open_connections");
                    this.zze++;
                } else {
                    StringBuilder sb = new StringBuilder(64);
                    sb.append("Metric with name grpc.subchannel.open_connections already exists");
                    throw new IllegalStateException(sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzcahVar;
    }
}
