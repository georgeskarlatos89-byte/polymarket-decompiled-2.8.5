package com.google.android.libraries.places.internal;

import defpackage.brn;
import defpackage.dmk;
import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcli {
    private List zza;
    private int zzb = 0;
    private final boolean zzc;

    public zzcli(List list, boolean z) {
        this.zzc = z;
        zzg(list);
    }

    private static final List zzj(List list, List list2) {
        if (list.isEmpty()) {
            return list2;
        }
        if (list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        for (int i = 0; i < Math.max(list.size(), list2.size()); i++) {
            if (i < list.size()) {
                arrayList.add((zzclh) list.get(i));
            }
            if (i < list2.size()) {
                arrayList.add((zzclh) list2.get(i));
            }
        }
        return arrayList;
    }

    public final boolean zza() {
        if (this.zzb < this.zza.size()) {
            return true;
        }
        return false;
    }

    public final boolean zzb() {
        if (!zza()) {
            return false;
        }
        this.zzb++;
        return zza();
    }

    public final void zzc() {
        this.zzb = 0;
    }

    public final SocketAddress zzd() {
        if (zza()) {
            return ((zzclh) this.zza.get(this.zzb)).zzc();
        }
        dmk.n("Index is past the end of the address group list");
        return null;
    }

    public final zzbww zze() {
        if (zza()) {
            return ((zzclh) this.zza.get(this.zzb)).zzb();
        }
        dmk.n("Index is off the end of the address group list");
        return null;
    }

    public final List zzf() {
        if (zza()) {
            return Collections.singletonList(((zzclh) this.zza.get(this.zzb)).zza());
        }
        dmk.n("Index is past the end of the address group list");
        return null;
    }

    public final void zzg(List list) {
        List list2;
        brn.m(list, "newGroups");
        if (this.zzc) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Boolean bool = null;
            for (int i = 0; i < list.size(); i++) {
                zzbyi zzbyiVar = (zzbyi) list.get(i);
                for (int i2 = 0; i2 < zzbyiVar.zza().size(); i2++) {
                    SocketAddress socketAddress = (SocketAddress) zzbyiVar.zza().get(i2);
                    if ((socketAddress instanceof InetSocketAddress) && (((InetSocketAddress) socketAddress).getAddress() instanceof Inet4Address)) {
                        if (bool == null) {
                            bool = Boolean.FALSE;
                        }
                        arrayList.add(new zzclh(zzbyiVar.zzb(), socketAddress));
                    } else {
                        if (bool == null) {
                            bool = Boolean.TRUE;
                        }
                        arrayList2.add(new zzclh(zzbyiVar.zzb(), socketAddress));
                    }
                }
            }
            if (bool != null && bool.booleanValue()) {
                list2 = zzj(arrayList2, arrayList);
            } else {
                list2 = zzj(arrayList, arrayList2);
            }
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < list.size(); i3++) {
                zzbyi zzbyiVar2 = (zzbyi) list.get(i3);
                for (int i4 = 0; i4 < zzbyiVar2.zza().size(); i4++) {
                    arrayList3.add(new zzclh(zzbyiVar2.zzb(), (SocketAddress) zzbyiVar2.zza().get(i4)));
                }
            }
            list2 = arrayList3;
        }
        this.zza = list2;
        this.zzb = 0;
    }

    public final boolean zzh(SocketAddress socketAddress) {
        brn.m(socketAddress, "needle");
        for (int i = 0; i < this.zza.size(); i++) {
            if (((zzclh) this.zza.get(i)).zzc().equals(socketAddress)) {
                this.zzb = i;
                return true;
            }
        }
        return false;
    }

    public final int zzi() {
        return this.zza.size();
    }
}
