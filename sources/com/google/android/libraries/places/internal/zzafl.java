package com.google.android.libraries.places.internal;

import defpackage.dmk;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzafl implements Iterator {
    final /* synthetic */ zzafm zza;
    private int zzb;

    public zzafl(zzafm zzafmVar) {
        Objects.requireNonNull(zzafmVar);
        this.zza = zzafmVar;
        this.zzb = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb;
        zzafm zzafmVar = this.zza;
        if (i < zzafmVar.zzc() - zzafmVar.zzb()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.zzb;
        zzafm zzafmVar = this.zza;
        if (i < zzafmVar.zzc() - zzafmVar.zzb()) {
            zzafn zzafnVar = zzafmVar.zzb;
            Object obj = zzafnVar.zzb()[zzafmVar.zzb() + i];
            this.zzb = i + 1;
            return obj;
        }
        dmk.t();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
