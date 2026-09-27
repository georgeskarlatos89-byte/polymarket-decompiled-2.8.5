package defpackage;

import android.view.ViewParent;
import androidx.fragment.app.a;
import androidx.fragment.app.a0;
import androidx.fragment.app.o;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ln8 {
    public er4 a;
    public kn8 b;
    public yrf c;
    public ViewPager2 d;
    public long e = -1;
    public final /* synthetic */ nn8 f;

    public ln8(nn8 nn8Var) {
        this.f = nn8Var;
    }

    public static ViewPager2 a(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        fi9.q(parent, "Expected ViewPager2 instance. Got: ");
        return null;
    }

    public final void b(boolean z) {
        int currentItem;
        o oVar;
        boolean z2;
        nn8 nn8Var = this.f;
        if (!nn8Var.shouldDelayFragmentTransactions() && this.d.getScrollState() == 0 && !nn8Var.mFragments.d() && nn8Var.getItemCount() != 0 && (currentItem = this.d.getCurrentItem()) < nn8Var.getItemCount()) {
            long itemId = nn8Var.getItemId(currentItem);
            if ((itemId != this.e || z) && (oVar = (o) nn8Var.mFragments.b(itemId)) != null && oVar.isAdded()) {
                this.e = itemId;
                a0 a0Var = nn8Var.mFragmentManager;
                a0Var.getClass();
                a aVar = new a(a0Var);
                ArrayList arrayList = new ArrayList();
                o oVar2 = null;
                for (int i = 0; i < nn8Var.mFragments.h(); i++) {
                    long e = nn8Var.mFragments.e(i);
                    o oVar3 = (o) nn8Var.mFragments.i(i);
                    if (oVar3.isAdded()) {
                        if (e != this.e) {
                            aVar.e(oVar3, n6b.STARTED);
                            jn8 jn8Var = nn8Var.mFragmentEventDispatcher;
                            jn8Var.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = jn8Var.a.iterator();
                            if (!it.hasNext()) {
                                arrayList.add(arrayList2);
                            } else {
                                throw m51.g(it);
                            }
                        } else {
                            oVar2 = oVar3;
                        }
                        if (e == this.e) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        oVar3.setMenuVisibility(z2);
                    }
                }
                if (oVar2 != null) {
                    aVar.e(oVar2, n6b.RESUMED);
                    jn8 jn8Var2 = nn8Var.mFragmentEventDispatcher;
                    jn8Var2.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = jn8Var2.a.iterator();
                    if (!it2.hasNext()) {
                        arrayList.add(arrayList3);
                    } else {
                        throw m51.g(it2);
                    }
                }
                if (!aVar.c.isEmpty()) {
                    if (!aVar.i) {
                        aVar.j = false;
                        aVar.t.A(aVar, false);
                        Collections.reverse(arrayList);
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            List list = (List) it3.next();
                            nn8Var.mFragmentEventDispatcher.getClass();
                            jn8.a(list);
                        }
                        return;
                    }
                    dmk.n("This transaction is already being added to the back stack");
                }
            }
        }
    }
}
