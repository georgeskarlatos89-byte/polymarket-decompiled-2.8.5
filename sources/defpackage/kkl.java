package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class kkl extends tgl {
    public final transient Object[] h;
    public final transient int i;

    public kkl(Object[] objArr, int i) {
        super(2);
        this.h = objArr;
        this.i = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        khn.c(i, 1);
        Object obj = this.h[i + i + this.i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 1;
    }
}
