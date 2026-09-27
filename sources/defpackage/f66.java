package defpackage;

import androidx.recyclerview.widget.g;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f66 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ l66 c;

    public /* synthetic */ f66(l66 l66Var, ArrayList arrayList, int i) {
        this.a = i;
        this.c = l66Var;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    l66 l66Var = this.c;
                    if (hasNext) {
                        k66 k66Var = (k66) it.next();
                        l66Var.animateMoveImpl(k66Var.a, k66Var.b, k66Var.c, k66Var.d, k66Var.e);
                    } else {
                        arrayList.clear();
                        l66Var.mMovesList.remove(arrayList);
                        return;
                    }
                }
            default:
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    l66 l66Var2 = this.c;
                    if (hasNext2) {
                        l66Var2.animateAddImpl((g) it2.next());
                    } else {
                        arrayList.clear();
                        l66Var2.mAdditionsList.remove(arrayList);
                        return;
                    }
                }
        }
    }
}
