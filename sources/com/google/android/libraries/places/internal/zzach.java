package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzach extends zzacw {
    public zzach(String str, Class cls, boolean z) {
        super("tags", cls, false);
    }

    @Override // com.google.android.libraries.places.internal.zzacw
    public final /* bridge */ /* synthetic */ void zzb(Object obj, zzacv zzacvVar) {
        zzafp zzafpVar = (zzafp) obj;
        if (zzafpVar != null) {
            for (Map.Entry entry : zzafpVar.zzb().entrySet()) {
                if (!((Set) entry.getValue()).isEmpty()) {
                    Iterator it = ((Set) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        zzacvVar.zza((String) entry.getKey(), it.next());
                    }
                } else {
                    zzacvVar.zza((String) entry.getKey(), null);
                }
            }
        }
    }
}
