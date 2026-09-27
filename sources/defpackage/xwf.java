package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class xwf extends jr9 {
    public final /* synthetic */ ywf c;

    public xwf(ywf ywfVar) {
        this.c = ywfVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ywf ywfVar = this.c;
        brn.k(i, ywfVar.f);
        Object[] objArr = ywfVar.e;
        int i2 = i * 2;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // defpackage.xq9
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.f;
    }
}
