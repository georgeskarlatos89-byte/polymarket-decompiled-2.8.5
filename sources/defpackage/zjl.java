package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zjl extends tgl {
    public final /* synthetic */ ekl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjl(ekl eklVar) {
        super(2);
        this.h = eklVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        khn.c(i, 1);
        Object[] objArr = (Object[]) this.h.j;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 1;
    }
}
