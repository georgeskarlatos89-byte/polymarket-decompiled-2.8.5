package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbsj implements Iterator {
    private final Iterator zza;

    public zzbsj(Iterator it) {
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        if (entry.getValue() instanceof zzbsk) {
            return new zzbsi(entry, null);
        }
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
    }
}
