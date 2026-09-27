package com.google.android.libraries.places.internal;

import defpackage.af9;
import defpackage.brn;
import defpackage.ix2;
import defpackage.nhn;
import io.ably.lib.util.AgentHeaderCreator;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcax {
    private final zzcav zza;
    private final String zzb;
    private final String zzc;
    private final zzcau zzd;
    private final zzcau zze;
    private final boolean zzf;

    public zzcax(zzcav zzcavVar, String str, zzcau zzcauVar, zzcau zzcauVar2, Object obj, boolean z, boolean z2, boolean z3, byte[] bArr) {
        String substring;
        new AtomicReferenceArray(2);
        brn.m(zzcavVar, "type");
        this.zza = zzcavVar;
        brn.m(str, "fullMethodName");
        this.zzb = str;
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf == -1) {
            substring = null;
        } else {
            substring = str.substring(0, lastIndexOf);
        }
        this.zzc = substring;
        brn.m(zzcauVar, "requestMarshaller");
        this.zzd = zzcauVar;
        brn.m(zzcauVar2, "responseMarshaller");
        this.zze = zzcauVar2;
        this.zzf = z3;
    }

    public static String zzh(String str, String str2) {
        brn.m(str, "fullServiceName");
        brn.m(str2, "methodName");
        return ix2.p(new StringBuilder(str.length() + 1 + str2.length()), str, AgentHeaderCreator.AGENT_DIVIDER, str2);
    }

    public static zzcat zzi(zzcau zzcauVar, zzcau zzcauVar2) {
        zzcat zzcatVar = new zzcat(null);
        zzcatVar.zza(null);
        zzcatVar.zzb(null);
        return zzcatVar;
    }

    public final String toString() {
        af9 b = nhn.b(this);
        b.f(this.zzb, "fullMethodName");
        b.f(this.zza, "type");
        b.c("idempotent", false);
        b.c("safe", false);
        b.c("sampledToLocalTracing", this.zzf);
        b.f(this.zzd, "requestMarshaller");
        b.f(this.zze, "responseMarshaller");
        b.f(null, "schemaDescriptor");
        b.b = true;
        return b.toString();
    }

    public final zzcav zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final Object zzd(InputStream inputStream) {
        return this.zze.zzb(inputStream);
    }

    public final InputStream zze(Object obj) {
        return this.zzd.zza(obj);
    }

    public final zzcau zzf() {
        return this.zzd;
    }

    public final zzcau zzg() {
        return this.zze;
    }
}
