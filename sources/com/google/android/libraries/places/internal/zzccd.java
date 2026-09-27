package com.google.android.libraries.places.internal;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.af9;
import defpackage.brn;
import defpackage.ckn;
import defpackage.dmk;
import defpackage.ix2;
import defpackage.m0j;
import defpackage.nhn;
import defpackage.sv6;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzccd {
    public static final zzccd zza;
    public static final zzccd zzb;
    public static final zzccd zzc;
    public static final zzccd zzd;
    public static final zzccd zze;
    public static final zzccd zzf;
    public static final zzccd zzg;
    public static final zzccd zzh;
    public static final zzccd zzi;
    static final zzcao zzj;
    static final zzcao zzk;
    private static final List zzl;
    private static final zzcar zzm;
    private final zzcca zzn;
    private final String zzo;
    private final Throwable zzp;

    static {
        TreeMap treeMap = new TreeMap();
        for (zzcca zzccaVar : zzcca.values()) {
            zzccd zzccdVar = (zzccd) treeMap.put(Integer.valueOf(zzccaVar.zza()), new zzccd(zzccaVar, null, null));
            if (zzccdVar != null) {
                String name = zzccdVar.zzn.name();
                String name2 = zzccaVar.name();
                dmk.n(sv6.p(new StringBuilder(String.valueOf(name).length() + 34 + String.valueOf(name2).length()), "Code value duplication between ", name, " & ", name2));
                return;
            }
        }
        zzl = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        zza = zzcca.OK.zzb();
        zzb = zzcca.CANCELLED.zzb();
        zzc = zzcca.UNKNOWN.zzb();
        zzcca.INVALID_ARGUMENT.zzb();
        zzd = zzcca.DEADLINE_EXCEEDED.zzb();
        zzcca.NOT_FOUND.zzb();
        zzcca.ALREADY_EXISTS.zzb();
        zze = zzcca.PERMISSION_DENIED.zzb();
        zzcca.UNAUTHENTICATED.zzb();
        zzf = zzcca.RESOURCE_EXHAUSTED.zzb();
        zzg = zzcca.FAILED_PRECONDITION.zzb();
        zzcca.ABORTED.zzb();
        zzcca.OUT_OF_RANGE.zzb();
        zzcca.UNIMPLEMENTED.zzb();
        zzh = zzcca.INTERNAL.zzb();
        zzi = zzcca.UNAVAILABLE.zzb();
        zzcca.DATA_LOSS.zzb();
        zzccb zzccbVar = new zzccb(null);
        int i = zzcao.zza;
        zzj = new zzcaq("grpc-status", false, zzccbVar, null);
        zzccc zzcccVar = new zzccc(null);
        zzm = zzcccVar;
        zzk = new zzcaq("grpc-message", false, zzcccVar, null);
    }

    private zzccd(zzcca zzccaVar, String str, Throwable th) {
        brn.m(zzccaVar, ApiConstant.KEY_CODE);
        this.zzn = zzccaVar;
        this.zzo = str;
        this.zzp = th;
    }

    public static zzccd zza(int i) {
        if (i >= 0) {
            List list = zzl;
            if (i < list.size()) {
                return (zzccd) list.get(i);
            }
        }
        zzccd zzccdVar = zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 13);
        sb.append("Unknown code ");
        sb.append(i);
        return zzccdVar.zze(sb.toString());
    }

    public static zzccd zzb(Throwable th) {
        brn.m(th, "t");
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof zzcce) {
                return ((zzcce) th2).zza();
            }
            if (th2 instanceof zzccg) {
                return ((zzccg) th2).zza();
            }
        }
        return zzc.zzd(th);
    }

    public static String zzc(zzccd zzccdVar) {
        String str = zzccdVar.zzo;
        zzcca zzccaVar = zzccdVar.zzn;
        if (str == null) {
            return zzccaVar.toString();
        }
        String valueOf = String.valueOf(zzccaVar);
        return ix2.p(new StringBuilder(valueOf.length() + 2 + str.length()), valueOf, ": ", str);
    }

    public static /* synthetic */ zzccd zzk(byte[] bArr) {
        int i;
        byte b;
        int length = bArr.length;
        char c = 0;
        if (length == 1) {
            if (bArr[0] == 48) {
                return zza;
            }
            length = 1;
        }
        if (length != 1) {
            if (length == 2 && (b = bArr[0]) >= 48 && b <= 57) {
                i = (b + MessagePack.Code.INT8) * 10;
                c = 1;
            }
            return zzc.zze("Unknown code ".concat(new String(bArr, StandardCharsets.US_ASCII)));
        }
        i = 0;
        byte b2 = bArr[c];
        if (b2 >= 48 && b2 <= 57) {
            int i2 = b2 + MessagePack.Code.INT8 + i;
            List list = zzl;
            if (i2 < list.size()) {
                return (zzccd) list.get(i2);
            }
        }
        return zzc.zze("Unknown code ".concat(new String(bArr, StandardCharsets.US_ASCII)));
    }

    public static /* synthetic */ List zzl() {
        return zzl;
    }

    public final String toString() {
        af9 b = nhn.b(this);
        b.f(this.zzn.name(), ApiConstant.KEY_CODE);
        b.f(this.zzo, "description");
        Throwable th = this.zzp;
        Object obj = th;
        if (th != null) {
            Object obj2 = m0j.a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            obj = stringWriter.toString();
        }
        b.f(obj, "cause");
        return b.toString();
    }

    public final zzccd zzd(Throwable th) {
        if (ckn.a(this.zzp, th)) {
            return this;
        }
        return new zzccd(this.zzn, this.zzo, th);
    }

    public final zzccd zze(String str) {
        if (ckn.a(this.zzo, str)) {
            return this;
        }
        return new zzccd(this.zzn, str, this.zzp);
    }

    public final zzccd zzf(String str) {
        if (str == null) {
            return this;
        }
        String str2 = this.zzo;
        zzcca zzccaVar = this.zzn;
        if (str2 == null) {
            return new zzccd(zzccaVar, str, this.zzp);
        }
        return new zzccd(zzccaVar, ix2.p(new StringBuilder(str2.length() + 1 + str.length()), str2, "\n", str), this.zzp);
    }

    public final zzcca zzg() {
        return this.zzn;
    }

    public final String zzh() {
        return this.zzo;
    }

    public final Throwable zzi() {
        return this.zzp;
    }

    public final boolean zzj() {
        if (zzcca.OK == this.zzn) {
            return true;
        }
        return false;
    }
}
