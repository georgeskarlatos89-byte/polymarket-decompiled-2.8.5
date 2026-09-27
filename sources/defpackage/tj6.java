package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class tj6 implements Iterator, xja {
    public final /* synthetic */ int a;
    public Iterator b;
    public final Object c;

    public tj6(uj6 uj6Var) {
        this.a = 0;
        this.c = uj6Var;
        this.b = uj6Var.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b.hasNext();
            case 1:
                return this.b.hasNext();
            default:
                return this.b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        ViewGroup viewGroup;
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((uj6) obj).b.invoke(this.b.next());
            case 1:
                return ((tbj) obj).b.invoke(this.b.next());
            default:
                Object next = this.b.next();
                ArrayList arrayList = (ArrayList) obj;
                View view = (View) next;
                w9k w9kVar = null;
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    w9kVar = new w9k(viewGroup);
                }
                if (w9kVar != null && w9kVar.hasNext()) {
                    arrayList.add(this.b);
                    this.b = w9kVar;
                } else {
                    while (!this.b.hasNext() && !arrayList.isEmpty()) {
                        this.b = (Iterator) CollectionsKt.P(arrayList);
                        CollectionsKt.p0(arrayList);
                    }
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                this.b.remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public tj6(w9k w9kVar) {
        this.a = 2;
        this.c = new ArrayList();
        this.b = w9kVar;
    }

    public tj6(tbj tbjVar) {
        this.a = 1;
        this.c = tbjVar;
        this.b = tbjVar.a.iterator();
    }
}
