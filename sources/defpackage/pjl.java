package defpackage;

import java.util.AbstractMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class pjl extends fhl {
    public final /* synthetic */ tjl c;

    public pjl(tjl tjlVar) {
        this.c = tjlVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        pbn.b(i, 1);
        int i2 = i + i;
        Object[] objArr = (Object[]) this.c.e;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 1;
    }
}
