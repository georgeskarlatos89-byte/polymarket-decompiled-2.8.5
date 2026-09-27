package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class gk0 extends ArrayList implements hgj {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof igj)) {
            return false;
        }
        return super.contains((igj) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof igj)) {
            return -1;
        }
        return super.indexOf((igj) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof igj)) {
            return -1;
        }
        return super.lastIndexOf((igj) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof igj)) {
            return false;
        }
        return super.remove((igj) obj);
    }
}
