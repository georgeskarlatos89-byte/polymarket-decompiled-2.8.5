package com.google.android.libraries.places.internal;

import defpackage.iw1;
import defpackage.sv6;
import defpackage.uwn;
import okhttp3.internal.http2.Header;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class zzcrp {
    public static final iw1 zza;
    public static final iw1 zzb;
    public static final iw1 zzc;
    public static final iw1 zzd;
    public static final iw1 zze;
    public final iw1 zzf;
    public final iw1 zzg;
    final int zzh;

    static {
        iw1 iw1Var = iw1.d;
        zza = uwn.L(Header.RESPONSE_STATUS_UTF8);
        zzb = uwn.L(Header.TARGET_METHOD_UTF8);
        zzc = uwn.L(Header.TARGET_PATH_UTF8);
        zzd = uwn.L(Header.TARGET_SCHEME_UTF8);
        zze = uwn.L(Header.TARGET_AUTHORITY_UTF8);
        uwn.L(":host");
        uwn.L(":version");
    }

    public zzcrp(iw1 iw1Var, iw1 iw1Var2) {
        this.zzf = iw1Var;
        this.zzg = iw1Var2;
        this.zzh = iw1Var2.d() + iw1Var.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcrp) {
            zzcrp zzcrpVar = (zzcrp) obj;
            if (this.zzf.equals(zzcrpVar.zzf) && this.zzg.equals(zzcrpVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzf.hashCode() + 527;
        return this.zzg.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return sv6.n(this.zzf.t(), ": ", this.zzg.t());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzcrp(String str, String str2) {
        this(uwn.L(str), uwn.L(str2));
        iw1 iw1Var = iw1.d;
    }
}
