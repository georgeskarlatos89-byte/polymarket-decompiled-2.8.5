package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class w9k implements Iterator, xja {
    public int a;
    final /* synthetic */ ViewGroup b;

    public w9k(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a < this.b.getChildCount()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ViewGroup viewGroup = this.b;
        int i = this.a;
        this.a = i + 1;
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        qp7.f();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        ViewGroup viewGroup = this.b;
        int i = this.a - 1;
        this.a = i;
        viewGroup.removeViewAt(i);
    }
}
