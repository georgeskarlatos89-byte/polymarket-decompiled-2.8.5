package defpackage;

import android.os.Handler;
import android.view.View;
import io.sentry.android.replay.f;
import io.sentry.android.replay.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class eag extends ArrayList {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eag(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                View view = (View) obj;
                view.getClass();
                Iterator it = ((fag) obj2).a.iterator();
                while (it.hasNext()) {
                    lz2 lz2Var = ((qkk) it.next()).a;
                    ((Handler) lz2Var.g).post(new rf8(true, lz2Var, view));
                }
                return super.add(view);
            default:
                View view2 = (View) obj;
                view2.getClass();
                Iterator it2 = ((r) obj2).c.iterator();
                while (it2.hasNext()) {
                    ((f) it2.next()).e(view2, true);
                }
                return super.add(view2);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        switch (this.a) {
            case 1:
                collection.getClass();
                Iterator it = ((r) this.b).c.iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        fVar.e((View) it2.next(), true);
                    }
                }
                return super.addAll(collection);
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof View)) {
                    return false;
                }
                return super.contains((View) obj);
            default:
                if (!(obj instanceof View)) {
                    return false;
                }
                return super.contains((View) obj);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof View)) {
                    return -1;
                }
                return super.indexOf((View) obj);
            default:
                if (!(obj instanceof View)) {
                    return -1;
                }
                return super.indexOf((View) obj);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof View)) {
                    return -1;
                }
                return super.lastIndexOf((View) obj);
            default:
                if (!(obj instanceof View)) {
                    return -1;
                }
                return super.lastIndexOf((View) obj);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                Object remove = super.remove(i);
                remove.getClass();
                View view = (View) remove;
                Iterator it = ((fag) obj).a.iterator();
                while (it.hasNext()) {
                    lz2 lz2Var = ((qkk) it.next()).a;
                    ((Handler) lz2Var.g).post(new rf8(false, lz2Var, view));
                }
                return view;
            default:
                Object remove2 = super.remove(i);
                remove2.getClass();
                View view2 = (View) remove2;
                Iterator it2 = ((r) obj).c.iterator();
                while (it2.hasNext()) {
                    ((f) it2.next()).e(view2, false);
                }
                return view2;
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof View) {
                    return super.remove((View) obj);
                }
                return false;
            default:
                if (obj instanceof View) {
                    return super.remove((View) obj);
                }
                return false;
        }
    }
}
