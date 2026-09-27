package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class gcj implements Cloneable {
    public static final Animator[] A = new Animator[0];
    public static final int[] B = {2, 1, 3, 4};
    public static final vbj C = new vbj(0);
    public static final ThreadLocal D = new ThreadLocal();
    public ArrayList k;
    public ArrayList l;
    public fcj[] m;
    public co8 v;
    public long x;
    public bcj y;
    public long z;
    public final String a = getClass().getName();
    public long b = -1;
    public long c = -1;
    public TimeInterpolator d = null;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public a7h g = new a7h(4);
    public a7h h = new a7h(4);
    public ucj i = null;
    public final int[] j = B;
    public final ArrayList n = new ArrayList();
    public Animator[] o = A;
    public int p = 0;
    public boolean q = false;
    public boolean r = false;
    public gcj s = null;
    public ArrayList t = null;
    public ArrayList u = new ArrayList();
    public vbj w = C;

    public static void c(a7h a7hVar, View view, wcj wcjVar) {
        fl0 fl0Var = (fl0) a7hVar.a;
        fl0 fl0Var2 = (fl0) a7hVar.d;
        SparseArray sparseArray = (SparseArray) a7hVar.b;
        fub fubVar = (fub) a7hVar.c;
        fl0Var.put(view, wcjVar);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = k9k.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (fl0Var2.containsKey(transitionName)) {
                fl0Var2.put(transitionName, null);
            } else {
                fl0Var2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (fubVar.c(itemIdAtPosition) >= 0) {
                    View view2 = (View) fubVar.b(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        fubVar.f(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                fubVar.f(itemIdAtPosition, view);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [b7h, java.lang.Object, fl0] */
    public static fl0 q() {
        ThreadLocal threadLocal = D;
        fl0 fl0Var = (fl0) threadLocal.get();
        if (fl0Var == null) {
            ?? b7hVar = new b7h();
            threadLocal.set(b7hVar);
            return b7hVar;
        }
        return fl0Var;
    }

    public static boolean x(wcj wcjVar, wcj wcjVar2, String str) {
        Object obj = wcjVar.a.get(str);
        Object obj2 = wcjVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A() {
        fl0 q = q();
        this.x = 0L;
        int i = 0;
        while (true) {
            int size = this.u.size();
            ArrayList arrayList = this.u;
            if (i < size) {
                Animator animator = (Animator) arrayList.get(i);
                wbj wbjVar = (wbj) q.get(animator);
                if (animator != null && wbjVar != null) {
                    Animator animator2 = wbjVar.f;
                    long j = this.c;
                    if (j >= 0) {
                        animator2.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator2.setStartDelay(animator2.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator2.setInterpolator(timeInterpolator);
                    }
                    this.n.add(animator);
                    this.x = Math.max(this.x, animator.getTotalDuration());
                }
                i++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public gcj B(fcj fcjVar) {
        gcj gcjVar;
        ArrayList arrayList = this.t;
        if (arrayList != null) {
            if (!arrayList.remove(fcjVar) && (gcjVar = this.s) != null) {
                gcjVar.B(fcjVar);
            }
            if (this.t.size() == 0) {
                this.t = null;
            }
        }
        return this;
    }

    public void C(View view) {
        this.f.remove(view);
    }

    public void D(View view) {
        if (this.q) {
            if (!this.r) {
                ArrayList arrayList = this.n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
                this.o = A;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.o = animatorArr;
                y(this, ahh.f, false);
            }
            this.q = false;
        }
    }

    public void E() {
        M();
        fl0 q = q();
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (q.containsKey(animator)) {
                M();
                if (animator != null) {
                    animator.addListener(new s79(2, this, q));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new m8(this, 9));
                    animator.start();
                }
            }
        }
        this.u.clear();
        m();
    }

    public void F(long j, long j2) {
        boolean z;
        long j3 = this.x;
        int i = 0;
        if (j < j2) {
            z = true;
        } else {
            z = false;
        }
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.r = false;
            y(this, ahh.b, z);
        }
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
        this.o = A;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j), animator.getTotalDuration()));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.o = animatorArr;
        if ((j > j4 && j2 <= j4) || (j < 0 && j2 >= 0)) {
            if (j > j4) {
                this.r = true;
            }
            y(this, ahh.c, z);
        }
    }

    public void G(long j) {
        this.c = j;
    }

    public void H(co8 co8Var) {
        this.v = co8Var;
    }

    public void I(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void J(vbj vbjVar) {
        if (vbjVar == null) {
            this.w = C;
        } else {
            this.w = vbjVar;
        }
    }

    public void L(long j) {
        this.b = j;
    }

    public final void M() {
        if (this.p == 0) {
            y(this, ahh.b, false);
            this.r = false;
        }
        this.p++;
    }

    public String N(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.b != -1) {
            sb.append("dly(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(fcj fcjVar) {
        ArrayList arrayList = this.t;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.t = arrayList;
        }
        arrayList.add(fcjVar);
    }

    public void b(View view) {
        this.f.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
        this.o = A;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.o = animatorArr;
        y(this, ahh.d, false);
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return j();
    }

    public abstract void d(wcj wcjVar);

    public final void e(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                wcj wcjVar = new wcj(view);
                if (z) {
                    g(wcjVar);
                } else {
                    d(wcjVar);
                }
                wcjVar.c.add(this);
                f(wcjVar);
                if (z) {
                    c(this.g, view, wcjVar);
                } else {
                    c(this.h, view, wcjVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    e(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    public abstract void g(wcj wcjVar);

    public final void h(ViewGroup viewGroup, boolean z) {
        i(z);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                wcj wcjVar = new wcj(findViewById);
                if (z) {
                    g(wcjVar);
                } else {
                    d(wcjVar);
                }
                wcjVar.c.add(this);
                f(wcjVar);
                if (z) {
                    c(this.g, findViewById, wcjVar);
                } else {
                    c(this.h, findViewById, wcjVar);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            wcj wcjVar2 = new wcj(view);
            if (z) {
                g(wcjVar2);
            } else {
                d(wcjVar2);
            }
            wcjVar2.c.add(this);
            f(wcjVar2);
            if (z) {
                c(this.g, view, wcjVar2);
            } else {
                c(this.h, view, wcjVar2);
            }
        }
    }

    public final void i(boolean z) {
        if (z) {
            ((fl0) this.g.a).clear();
            ((SparseArray) this.g.b).clear();
            ((fub) this.g.c).a();
        } else {
            ((fl0) this.h.a).clear();
            ((SparseArray) this.h.b).clear();
            ((fub) this.h.c).a();
        }
    }

    public gcj j() {
        try {
            gcj gcjVar = (gcj) super.clone();
            gcjVar.u = new ArrayList();
            gcjVar.g = new a7h(4);
            gcjVar.h = new a7h(4);
            gcjVar.k = null;
            gcjVar.l = null;
            gcjVar.y = null;
            gcjVar.s = this;
            gcjVar.t = null;
            return gcjVar;
        } catch (CloneNotSupportedException e) {
            qp7.n(e);
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, wcj wcjVar, wcj wcjVar2) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, wbj] */
    public void l(ViewGroup viewGroup, a7h a7hVar, a7h a7hVar2, ArrayList arrayList, ArrayList arrayList2) {
        boolean z;
        int i;
        boolean z2;
        View view;
        wcj wcjVar;
        Animator animator;
        wcj wcjVar2;
        fl0 q = q();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        if (p().y != null) {
            z = true;
        } else {
            z = false;
        }
        int i2 = 0;
        while (i2 < size) {
            wcj wcjVar3 = (wcj) arrayList.get(i2);
            wcj wcjVar4 = (wcj) arrayList2.get(i2);
            if (wcjVar3 != null && !wcjVar3.c.contains(this)) {
                wcjVar3 = null;
            }
            if (wcjVar4 != null && !wcjVar4.c.contains(this)) {
                wcjVar4 = null;
            }
            if ((wcjVar3 != null || wcjVar4 != null) && (wcjVar3 == null || wcjVar4 == null || v(wcjVar3, wcjVar4))) {
                Animator k = k(viewGroup, wcjVar3, wcjVar4);
                if (k != null) {
                    String str = this.a;
                    if (wcjVar4 != null) {
                        view = wcjVar4.b;
                        String[] r = r();
                        if (r != null && r.length > 0) {
                            wcjVar2 = new wcj(view);
                            wcj wcjVar5 = (wcj) ((fl0) a7hVar2.a).get(view);
                            i = size;
                            z2 = z;
                            if (wcjVar5 != null) {
                                for (String str2 : r) {
                                    wcjVar2.a.put(str2, wcjVar5.a.get(str2));
                                }
                            }
                            int i3 = q.c;
                            int i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    wbj wbjVar = (wbj) q.get((Animator) q.f(i4));
                                    if (wbjVar.c != null && wbjVar.a == view && wbjVar.b.equals(str) && wbjVar.c.equals(wcjVar2)) {
                                        animator = null;
                                        break;
                                    }
                                    i4++;
                                } else {
                                    animator = k;
                                    break;
                                }
                            }
                        } else {
                            i = size;
                            z2 = z;
                            animator = k;
                            wcjVar2 = null;
                        }
                        k = animator;
                        wcjVar = wcjVar2;
                    } else {
                        i = size;
                        z2 = z;
                        view = wcjVar3.b;
                        wcjVar = null;
                    }
                    if (k != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        ?? obj = new Object();
                        obj.a = view;
                        obj.b = str;
                        obj.c = wcjVar;
                        obj.d = windowId;
                        obj.e = this;
                        obj.f = k;
                        if (z2) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(k);
                            k = animatorSet;
                        }
                        q.put(k, obj);
                        this.u.add(k);
                    }
                    i2++;
                    size = i;
                    z = z2;
                }
            }
            i = size;
            z2 = z;
            i2++;
            size = i;
            z = z2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                wbj wbjVar2 = (wbj) q.get((Animator) this.u.get(sparseIntArray.keyAt(i5)));
                wbjVar2.f.setStartDelay(wbjVar2.f.getStartDelay() + (sparseIntArray.valueAt(i5) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.p - 1;
        this.p = i;
        if (i == 0) {
            y(this, ahh.c, false);
            for (int i2 = 0; i2 < ((fub) this.g.c).h(); i2++) {
                View view = (View) ((fub) this.g.c).i(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((fub) this.h.c).h(); i3++) {
                View view2 = (View) ((fub) this.h.c).i(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.r = true;
        }
    }

    public void n(ViewGroup viewGroup) {
        fl0 q = q();
        int i = q.c;
        if (viewGroup != null && i != 0) {
            WindowId windowId = viewGroup.getWindowId();
            b7h b7hVar = new b7h(q);
            q.clear();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                wbj wbjVar = (wbj) b7hVar.j(i2);
                if (wbjVar.a != null && windowId.equals(wbjVar.d)) {
                    ((Animator) b7hVar.f(i2)).end();
                }
            }
        }
    }

    public final wcj o(View view, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ucj ucjVar = this.i;
        if (ucjVar != null) {
            return ucjVar.o(view, z);
        }
        if (z) {
            arrayList = this.k;
        } else {
            arrayList = this.l;
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    wcj wcjVar = (wcj) arrayList.get(i);
                    if (wcjVar != null) {
                        if (wcjVar.b == view) {
                            break;
                        }
                        i++;
                    } else {
                        return null;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                if (z) {
                    arrayList2 = this.l;
                } else {
                    arrayList2 = this.k;
                }
                return (wcj) arrayList2.get(i);
            }
            return null;
        }
        return null;
    }

    public final gcj p() {
        ucj ucjVar = this.i;
        if (ucjVar != null) {
            return ucjVar.p();
        }
        return this;
    }

    public String[] r() {
        return null;
    }

    public final wcj s(View view, boolean z) {
        a7h a7hVar;
        ucj ucjVar = this.i;
        if (ucjVar != null) {
            return ucjVar.s(view, z);
        }
        if (z) {
            a7hVar = this.g;
        } else {
            a7hVar = this.h;
        }
        return (wcj) ((fl0) a7hVar.a).get(view);
    }

    public boolean t() {
        return !this.n.isEmpty();
    }

    public final String toString() {
        return N("");
    }

    public abstract boolean u();

    public boolean v(wcj wcjVar, wcj wcjVar2) {
        if (wcjVar != null && wcjVar2 != null) {
            String[] r = r();
            if (r != null) {
                for (String str : r) {
                    if (x(wcjVar, wcjVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = wcjVar.a.keySet().iterator();
                while (it.hasNext()) {
                    if (x(wcjVar, wcjVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean w(View view) {
        int id = view.getId();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if ((size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view)) {
            return true;
        }
        return false;
    }

    public final void y(gcj gcjVar, ahh ahhVar, boolean z) {
        gcj gcjVar2 = this.s;
        if (gcjVar2 != null) {
            gcjVar2.y(gcjVar, ahhVar, z);
        }
        ArrayList arrayList = this.t;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.t.size();
            fcj[] fcjVarArr = this.m;
            if (fcjVarArr == null) {
                fcjVarArr = new fcj[size];
            }
            this.m = null;
            fcj[] fcjVarArr2 = (fcj[]) this.t.toArray(fcjVarArr);
            for (int i = 0; i < size; i++) {
                fcj fcjVar = fcjVarArr2[i];
                switch (ahhVar.a) {
                    case 10:
                        fcjVar.b(gcjVar);
                        break;
                    case 11:
                        fcjVar.e(gcjVar);
                        break;
                    case 12:
                        fcjVar.d(gcjVar);
                        break;
                    case 13:
                        fcjVar.a();
                        break;
                    default:
                        fcjVar.c();
                        break;
                }
                fcjVarArr2[i] = null;
            }
            this.m = fcjVarArr2;
        }
    }

    public void z(View view) {
        if (!this.r) {
            ArrayList arrayList = this.n;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
            this.o = A;
            for (int i = size - 1; i >= 0; i--) {
                Animator animator = animatorArr[i];
                animatorArr[i] = null;
                animator.pause();
            }
            this.o = animatorArr;
            y(this, ahh.e, false);
            this.q = true;
        }
    }

    public void K() {
    }

    public void f(wcj wcjVar) {
    }
}
