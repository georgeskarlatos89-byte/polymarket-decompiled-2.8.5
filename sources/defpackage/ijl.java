package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ijl extends njl {
    public final transient int h;
    public final transient int i;
    public final /* synthetic */ njl j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijl(njl njlVar, int i, int i2) {
        super(3);
        this.j = njlVar;
        this.h = i;
        this.i = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        udn.b(i, this.i);
        return this.j.get(i + this.h);
    }

    @Override // defpackage.otk
    public final int h() {
        return this.j.j() + this.h + this.i;
    }

    @Override // defpackage.otk
    public final int j() {
        return this.j.j() + this.h;
    }

    @Override // defpackage.otk
    public final Object[] n() {
        return this.j.n();
    }

    @Override // defpackage.njl
    public final njl s(int i, int i2) {
        udn.c(i, i2, this.i);
        int i3 = this.h;
        return this.j.s(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }

    @Override // defpackage.njl, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return s(i, i2);
    }
}
