package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class axf extends jr9 {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public axf(Object[] objArr, int i, int i2) {
        this.c = objArr;
        this.d = i;
        this.e = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        brn.k(i, this.e);
        Object obj = this.c[(i * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.xq9
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
