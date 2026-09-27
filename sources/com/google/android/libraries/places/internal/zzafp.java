package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzafp {
    public static final /* synthetic */ int zza = 0;
    private static final Comparator zzb = new zzafi();
    private static final zzafp zzc = new zzafp(new zzafn(Collections.EMPTY_LIST));
    private final zzafn zzd;

    private zzafp(zzafn zzafnVar) {
        this.zzd = zzafnVar;
    }

    public static zzafp zza() {
        return zzc;
    }

    public static /* synthetic */ Comparator zze() {
        return zzb;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof zzafp) && ((zzafp) obj).zzd.equals(this.zzd)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ~this.zzd.hashCode();
    }

    public final String toString() {
        return this.zzd.toString();
    }

    public final Map zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zzd.isEmpty();
    }

    public final zzafp zzd(zzafp zzafpVar) {
        zzafn zzafnVar = zzafpVar.zzd;
        if (!zzafnVar.isEmpty()) {
            zzafn zzafnVar2 = this.zzd;
            if (zzafnVar2.isEmpty()) {
                return zzafpVar;
            }
            return new zzafp(new zzafn(zzafnVar2, zzafnVar));
        }
        return this;
    }
}
