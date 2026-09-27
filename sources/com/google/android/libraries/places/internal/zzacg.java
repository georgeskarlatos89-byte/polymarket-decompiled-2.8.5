package com.google.android.libraries.places.internal;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzacg extends zzacw {
    public zzacg(String str, Class cls, boolean z) {
        super("group_by", cls, true);
    }

    @Override // com.google.android.libraries.places.internal.zzacw
    public final void zza(Iterator it, zzacv zzacvVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                zzacvVar.zza(zzd(), next);
                return;
            }
            StringBuilder sb = new StringBuilder("[");
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            String zzd = zzd();
            sb.append(']');
            zzacvVar.zza(zzd, sb.toString());
        }
    }
}
