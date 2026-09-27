package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class fjl extends njl {
    public final transient njl h;

    public fjl(njl njlVar) {
        super(3);
        this.h = njlVar;
    }

    @Override // defpackage.njl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.h.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        njl njlVar = this.h;
        udn.b(i, njlVar.size());
        return njlVar.get((njlVar.size() - 1) - i);
    }

    @Override // defpackage.njl, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.h.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (r1.size() - 1) - lastIndexOf;
    }

    @Override // defpackage.njl, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.h.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (r1.size() - 1) - indexOf;
    }

    @Override // defpackage.njl
    public final njl r() {
        return this.h;
    }

    @Override // defpackage.njl
    public final njl s(int i, int i2) {
        njl njlVar = this.h;
        udn.c(i, i2, njlVar.size());
        return njlVar.s(njlVar.size() - i2, njlVar.size() - i).r();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h.size();
    }

    @Override // defpackage.njl, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return s(i, i2);
    }
}
