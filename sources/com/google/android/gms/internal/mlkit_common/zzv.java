package com.google.android.gms.internal.mlkit_common;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzv extends zzat {
    private final int zza;
    private int zzb;

    public zzv(int i, int i2) {
        zzt.zzb(i2, i, "index");
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.zzb < this.zza) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.zzb > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.zzb;
            this.zzb = i + 1;
            return zza(i);
        }
        dmk.t();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.zzb - 1;
            this.zzb = i;
            return zza(i);
        }
        dmk.t();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzb - 1;
    }

    public abstract Object zza(int i);
}
