package com.google.android.libraries.places.internal;

import defpackage.brn;
import defpackage.k84;
import io.ably.lib.util.AgentHeaderCreator;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbyi {
    public static final zzbwv zza = zzbwv.zza("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    public static final zzbwv zzb = zzbwv.zza("io.grpc.EquivalentAddressGroup.LOCALITY");
    static final zzbwv zzc = zzbwv.zza("io.grpc.EquivalentAddressGroup.BACKEND_SERVICE");
    static final zzbwv zzd = zzbwv.zza("io.grpc.EquivalentAddressGroup.ATTR_WEIGHT");
    private final List zze;
    private final zzbww zzf;
    private final int zzg;

    public zzbyi(List list, zzbww zzbwwVar) {
        brn.g("addrs is empty", !list.isEmpty());
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.zze = unmodifiableList;
        brn.m(zzbwwVar, "attrs");
        this.zzf = zzbwwVar;
        this.zzg = unmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbyi)) {
            return false;
        }
        zzbyi zzbyiVar = (zzbyi) obj;
        List list = this.zze;
        int size = list.size();
        List list2 = zzbyiVar.zze;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!((SocketAddress) list.get(i)).equals(list2.get(i))) {
                return false;
            }
        }
        if (this.zzf.equals(zzbyiVar.zzf)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.zzg;
    }

    public final String toString() {
        zzbww zzbwwVar = this.zzf;
        String valueOf = String.valueOf(this.zze);
        String valueOf2 = String.valueOf(zzbwwVar);
        StringBuilder sb = new StringBuilder(valueOf.length() + 2 + valueOf2.length() + 1);
        k84.q(sb, "[", valueOf, AgentHeaderCreator.AGENT_DIVIDER, valueOf2);
        sb.append("]");
        return sb.toString();
    }

    public final List zza() {
        return this.zze;
    }

    public final zzbww zzb() {
        return this.zzf;
    }
}
