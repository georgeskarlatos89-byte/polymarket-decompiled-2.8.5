package defpackage;

import androidx.collection.SparseArrayCompat;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class egh extends y0a {
    public int a;
    final /* synthetic */ SparseArrayCompat<Object> b;

    public egh(SparseArrayCompat sparseArrayCompat) {
        this.b = sparseArrayCompat;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a < this.b.n()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.y0a
    public final int nextInt() {
        SparseArrayCompat<Object> sparseArrayCompat = this.b;
        int i = this.a;
        this.a = i + 1;
        return sparseArrayCompat.j(i);
    }
}
