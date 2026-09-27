package com.google.android.libraries.places.internal;

import defpackage.af9;
import defpackage.brn;
import defpackage.nhn;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbxa {
    public static final zzbxa zza;
    private final zzbyd zzb;
    private final Executor zzc;
    private final Object[][] zzd;
    private final List zze;
    private final Boolean zzf;
    private final Integer zzg;
    private final Integer zzh;

    static {
        zzbwy zzbwyVar = new zzbwy();
        zzbwyVar.zzc = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        zzbwyVar.zzd = Collections.EMPTY_LIST;
        zza = new zzbxa(zzbwyVar, null);
    }

    public /* synthetic */ zzbxa(zzbwy zzbwyVar, byte[] bArr) {
        this.zzb = zzbwyVar.zza;
        this.zzc = zzbwyVar.zzb;
        this.zzd = zzbwyVar.zzc;
        this.zze = zzbwyVar.zzd;
        this.zzf = zzbwyVar.zze;
        this.zzg = zzbwyVar.zzf;
        this.zzh = zzbwyVar.zzg;
    }

    private static zzbwy zzp(zzbxa zzbxaVar) {
        zzbwy zzbwyVar = new zzbwy();
        zzbwyVar.zza = zzbxaVar.zzb;
        zzbwyVar.zzb = zzbxaVar.zzc;
        zzbwyVar.zzc = zzbxaVar.zzd;
        zzbwyVar.zzd = zzbxaVar.zze;
        zzbwyVar.zze = zzbxaVar.zzf;
        zzbwyVar.zzf = zzbxaVar.zzg;
        zzbwyVar.zzg = zzbxaVar.zzh;
        return zzbwyVar;
    }

    public final String toString() {
        Class<?> cls;
        af9 b = nhn.b(this);
        b.f(this.zzb, "deadline");
        b.f(null, "authority");
        b.f(null, "callCredentials");
        Executor executor = this.zzc;
        if (executor != null) {
            cls = executor.getClass();
        } else {
            cls = null;
        }
        b.f(cls, "executor");
        b.f(null, "compressorName");
        b.f(Arrays.deepToString(this.zzd), "customOptions");
        b.c("waitForReady", zzk());
        b.f(this.zzg, "maxInboundMessageSize");
        b.f(this.zzh, "maxOutboundMessageSize");
        b.f(null, "onReadyThreshold");
        b.f(this.zze, "streamTracerFactories");
        return b.toString();
    }

    public final zzbxa zza(zzbyd zzbydVar) {
        zzbwy zzp = zzp(this);
        zzp.zza = zzbydVar;
        return new zzbxa(zzp, null);
    }

    public final zzbyd zzb() {
        return this.zzb;
    }

    public final zzbxa zzc() {
        zzbwy zzp = zzp(this);
        zzp.zze = Boolean.TRUE;
        return new zzbxa(zzp, null);
    }

    public final zzbxa zzd() {
        zzbwy zzp = zzp(this);
        zzp.zze = Boolean.FALSE;
        return new zzbxa(zzp, null);
    }

    public final zzbxa zze(Executor executor) {
        zzbwy zzp = zzp(this);
        zzp.zzb = executor;
        return new zzbxa(zzp, null);
    }

    public final zzbxa zzf(zzbxj zzbxjVar) {
        List list = this.zze;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(zzbxjVar);
        zzbwy zzp = zzp(this);
        zzp.zzd = Collections.unmodifiableList(arrayList);
        return new zzbxa(zzp, null);
    }

    public final List zzg() {
        return this.zze;
    }

    public final zzbxa zzh(zzbwz zzbwzVar, Object obj) {
        Object[][] objArr;
        int length;
        int i;
        brn.m(zzbwzVar, "key");
        brn.m(obj, "value");
        zzbwy zzp = zzp(this);
        int i2 = 0;
        while (true) {
            objArr = this.zzd;
            length = objArr.length;
            if (i2 < length) {
                if (zzbwzVar == objArr[i2][0]) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 == -1) {
            i = 1;
        } else {
            i = 0;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, i + length, 2);
        zzp.zzc = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, length);
        Object[][] objArr3 = zzp.zzc;
        if (i2 == -1) {
            objArr3[length] = new Object[]{zzbwzVar, obj};
        } else {
            objArr3[i2] = new Object[]{zzbwzVar, obj};
        }
        return new zzbxa(zzp, null);
    }

    public final Object zzi(zzbwz zzbwzVar) {
        brn.m(zzbwzVar, "key");
        int i = 0;
        while (true) {
            Object[][] objArr = this.zzd;
            if (i < objArr.length) {
                Object[] objArr2 = objArr[i];
                if (zzbwzVar != objArr2[0]) {
                    i++;
                } else {
                    return objArr2[1];
                }
            } else {
                return zzbwzVar.zzc();
            }
        }
    }

    public final Executor zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        return Boolean.TRUE.equals(this.zzf);
    }

    public final zzbxa zzl(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        brn.c(i, "invalid maxsize %s", z);
        zzbwy zzp = zzp(this);
        zzp.zzf = Integer.valueOf(i);
        return new zzbxa(zzp, null);
    }

    public final zzbxa zzm(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        brn.c(i, "invalid maxsize %s", z);
        zzbwy zzp = zzp(this);
        zzp.zzg = Integer.valueOf(i);
        return new zzbxa(zzp, null);
    }

    public final Integer zzn() {
        return this.zzg;
    }

    public final Integer zzo() {
        return this.zzh;
    }
}
