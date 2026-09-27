package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzctd {
    final Collection zza;
    final int zzb;

    public zzctd(zzbyi zzbyiVar) {
        brn.m(zzbyiVar, "eag");
        if (zzbyiVar.zza().size() < 10) {
            this.zza = zzbyiVar.zza();
        } else {
            this.zza = new HashSet(zzbyiVar.zza());
        }
        Iterator it = zzbyiVar.zza().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((SocketAddress) it.next()).hashCode();
        }
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzctd)) {
            return false;
        }
        zzctd zzctdVar = (zzctd) obj;
        if (zzctdVar.zzb == this.zzb) {
            Collection collection = zzctdVar.zza;
            int size = collection.size();
            Collection<?> collection2 = this.zza;
            if (size == collection2.size()) {
                return collection.containsAll(collection2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb;
    }

    public final String toString() {
        return this.zza.toString();
    }
}
