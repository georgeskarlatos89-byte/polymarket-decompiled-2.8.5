package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.o;
import com.polymarket.android.R;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class go8 extends bo8 {
    @Override // defpackage.bo8
    public final void a(View view, Object obj) {
        ((gcj) obj).b(view);
    }

    @Override // defpackage.bo8
    public final void b(Object obj, ArrayList arrayList) {
        gcj gcjVar = (gcj) obj;
        if (gcjVar != null) {
            int i = 0;
            if (gcjVar instanceof ucj) {
                ucj ucjVar = (ucj) gcjVar;
                int size = ucjVar.E.size();
                while (i < size) {
                    b(ucjVar.P(i), arrayList);
                    i++;
                }
                return;
            }
            if (bo8.k(gcjVar.e) && bo8.k(gcjVar.f)) {
                int size2 = arrayList.size();
                while (i < size2) {
                    gcjVar.b((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    @Override // defpackage.bo8
    public final void c(Object obj) {
        ((bcj) obj).g();
    }

    @Override // defpackage.bo8
    public final void d(Object obj, vd5 vd5Var) {
        bcj bcjVar = (bcj) obj;
        bcjVar.g = vd5Var;
        if (!bcjVar.b) {
            bcjVar.d = 2;
        } else {
            bcjVar.h();
            bcjVar.e.a(0.0f);
        }
    }

    @Override // defpackage.bo8
    public final void e(ViewGroup viewGroup, Object obj) {
        scj.a(viewGroup, (gcj) obj);
    }

    @Override // defpackage.bo8
    public final boolean g(Object obj) {
        return obj instanceof gcj;
    }

    @Override // defpackage.bo8
    public final Object h(Object obj) {
        if (obj != null) {
            return ((gcj) obj).j();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [rcj, android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    @Override // defpackage.bo8
    public final Object i(ViewGroup viewGroup, Object obj) {
        gcj gcjVar = (gcj) obj;
        ArrayList arrayList = scj.c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut() && Build.VERSION.SDK_INT >= 34) {
            if (gcjVar.u()) {
                arrayList.add(viewGroup);
                gcj j = gcjVar.j();
                ucj ucjVar = new ucj();
                ucjVar.O(j);
                scj.c(viewGroup, ucjVar);
                viewGroup.setTag(R.id.transition_current_scene, null);
                ?? obj2 = new Object();
                obj2.a = ucjVar;
                obj2.b = viewGroup;
                viewGroup.addOnAttachStateChangeListener(obj2);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(obj2);
                viewGroup.invalidate();
                bcj bcjVar = new bcj(ucjVar);
                ucjVar.y = bcjVar;
                ucjVar.a(bcjVar);
                return ucjVar.y;
            }
            dmk.v("The Transition must support seeking.");
        }
        return null;
    }

    @Override // defpackage.bo8
    public final boolean l() {
        return true;
    }

    @Override // defpackage.bo8
    public final boolean m(Object obj) {
        boolean u = ((gcj) obj).u();
        if (!u) {
            Objects.toString(obj);
        }
        return u;
    }

    @Override // defpackage.bo8
    public final Object n(Object obj, Object obj2, Object obj3) {
        gcj gcjVar = (gcj) obj;
        gcj gcjVar2 = (gcj) obj2;
        gcj gcjVar3 = (gcj) obj3;
        if (gcjVar != null && gcjVar2 != null) {
            ucj ucjVar = new ucj();
            ucjVar.O(gcjVar);
            ucjVar.O(gcjVar2);
            ucjVar.F = false;
            gcjVar = ucjVar;
        } else if (gcjVar == null) {
            if (gcjVar2 != null) {
                gcjVar = gcjVar2;
            } else {
                gcjVar = null;
            }
        }
        if (gcjVar3 != null) {
            ucj ucjVar2 = new ucj();
            if (gcjVar != null) {
                ucjVar2.O(gcjVar);
            }
            ucjVar2.O(gcjVar3);
            return ucjVar2;
        }
        return gcjVar;
    }

    @Override // defpackage.bo8
    public final Object o(Object obj, Object obj2) {
        ucj ucjVar = new ucj();
        if (obj != null) {
            ucjVar.O((gcj) obj);
        }
        ucjVar.O((gcj) obj2);
        return ucjVar;
    }

    @Override // defpackage.bo8
    public final void p(Object obj, View view, ArrayList arrayList) {
        ((gcj) obj).a(new do8(view, arrayList));
    }

    @Override // defpackage.bo8
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((gcj) obj).a(new eo8(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.bo8
    public final void r(Object obj, float f) {
        bcj bcjVar = (bcj) obj;
        boolean z = bcjVar.b;
        if (z) {
            ucj ucjVar = bcjVar.h;
            long j = ucjVar.x;
            long j2 = f * ((float) j);
            if (j2 == 0) {
                j2 = 1;
            }
            if (j2 == j) {
                j2 = j - 1;
            }
            if (bcjVar.e == null) {
                long j3 = bcjVar.a;
                if (j2 != j3 && z) {
                    if (!bcjVar.c) {
                        if (j2 == 0 && j3 > 0) {
                            j2 = -1;
                        } else if (j2 == j && j3 < j) {
                            j2 = j + 1;
                        }
                        if (j2 != j3) {
                            ucjVar.F(j2, j3);
                            bcjVar.a = j2;
                        }
                    }
                    vt1 vt1Var = bcjVar.f;
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    int i = (vt1Var.c + 1) % 20;
                    vt1Var.c = i;
                    ((long[]) vt1Var.b)[i] = currentAnimationTimeMillis;
                    ((float[]) vt1Var.d)[i] = (float) j2;
                    return;
                }
                return;
            }
            dmk.n("setCurrentPlayTimeMillis() called after animation has been started");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, co8] */
    @Override // defpackage.bo8
    public final void s(View view, Object obj) {
        if (view != null) {
            bo8.j(new Rect(), view);
            ((gcj) obj).H(new Object());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, co8] */
    @Override // defpackage.bo8
    public final void t(Object obj, Rect rect) {
        ((gcj) obj).H(new Object());
    }

    @Override // defpackage.bo8
    public final void u(o oVar, Object obj, f11 f11Var, Runnable runnable) {
        v(obj, f11Var, null, runnable);
    }

    @Override // defpackage.bo8
    public final void v(Object obj, f11 f11Var, y85 y85Var, Runnable runnable) {
        gcj gcjVar = (gcj) obj;
        gy gyVar = new gy(y85Var, gcjVar, runnable, 6);
        synchronized (f11Var) {
            while (f11Var.b) {
                try {
                    try {
                        f11Var.wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (((gy) f11Var.c) != gyVar) {
                f11Var.c = gyVar;
                if (f11Var.a) {
                    Runnable runnable2 = (Runnable) gyVar.b;
                    gcj gcjVar2 = (gcj) gyVar.c;
                    Runnable runnable3 = (Runnable) gyVar.d;
                    if (runnable2 == null) {
                        gcjVar2.cancel();
                        runnable3.run();
                    } else {
                        runnable2.run();
                    }
                }
            }
        }
        gcjVar.a(new fo8(runnable));
    }

    @Override // defpackage.bo8
    public final void w(Object obj, View view, ArrayList arrayList) {
        ucj ucjVar = (ucj) obj;
        ArrayList arrayList2 = ucjVar.f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bo8.f(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(ucjVar, arrayList);
    }

    @Override // defpackage.bo8
    public final void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        ucj ucjVar = (ucj) obj;
        if (ucjVar != null) {
            ArrayList arrayList3 = ucjVar.f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            z(ucjVar, arrayList, arrayList2);
        }
    }

    @Override // defpackage.bo8
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        ucj ucjVar = new ucj();
        ucjVar.O((gcj) obj);
        return ucjVar;
    }

    public final void z(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        int size;
        gcj gcjVar = (gcj) obj;
        int i = 0;
        if (gcjVar instanceof ucj) {
            ucj ucjVar = (ucj) gcjVar;
            int size2 = ucjVar.E.size();
            while (i < size2) {
                z(ucjVar.P(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (bo8.k(gcjVar.e)) {
            ArrayList arrayList3 = gcjVar.f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i < size) {
                    gcjVar.b((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    gcjVar.C((View) arrayList.get(size3));
                }
            }
        }
    }
}
