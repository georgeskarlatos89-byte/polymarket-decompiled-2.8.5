package defpackage;

import java.util.RandomAccess;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class jld extends l3 implements RandomAccess {
    public static final /* synthetic */ int d = 0;
    public final iw1[] b;
    public final int[] c;

    public jld(iw1[] iw1VarArr, int[] iArr) {
        this.b = iw1VarArr;
        this.c = iArr;
    }

    @Override // defpackage.o1, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof iw1)) {
            return false;
        }
        return super.contains((iw1) obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.b[i];
    }

    @Override // defpackage.o1
    public final int getSize() {
        return this.b.length;
    }

    @Override // defpackage.l3, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof iw1)) {
            return -1;
        }
        return super.indexOf((iw1) obj);
    }

    @Override // defpackage.l3, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof iw1)) {
            return -1;
        }
        return super.lastIndexOf((iw1) obj);
    }
}
