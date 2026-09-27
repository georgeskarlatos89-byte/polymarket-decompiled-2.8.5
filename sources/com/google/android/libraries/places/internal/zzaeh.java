package com.google.android.libraries.places.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzaeh extends AbstractSet {
    final /* synthetic */ zzaej zza;

    public zzaeh(zzaej zzaejVar) {
        Objects.requireNonNull(zzaejVar);
        this.zza = zzaejVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzaeg(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.zzg();
    }
}
