package defpackage;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a0;
import androidx.fragment.app.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ao8 extends bo8 {
    public static boolean z(Transition transition) {
        if (bo8.k(transition.getTargetIds()) && bo8.k(transition.getTargetNames()) && bo8.k(transition.getTargetTypes())) {
            return false;
        }
        return true;
    }

    public final void A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        int size;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                A(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (!z(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                size = 0;
            } else {
                size = arrayList2.size();
            }
            while (i < size) {
                transition.addTarget((View) arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget((View) arrayList.get(size2));
            }
        }
    }

    @Override // defpackage.bo8
    public final void a(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // defpackage.bo8
    public final void b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    b(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
                return;
            }
            if (!z(transition) && bo8.k(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    @Override // defpackage.bo8
    public final void e(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // defpackage.bo8
    public final boolean g(Object obj) {
        return obj instanceof Transition;
    }

    @Override // defpackage.bo8
    public final Object h(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // defpackage.bo8
    public final boolean l() {
        if (a0.L(4)) {
            Log.i("FragmentManager", "Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
            return false;
        }
        return false;
    }

    @Override // defpackage.bo8
    public final boolean m(Object obj) {
        if (a0.L(2)) {
            Objects.toString(obj);
            return false;
        }
        return false;
    }

    @Override // defpackage.bo8
    public final Object n(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // defpackage.bo8
    public final Object o(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // defpackage.bo8
    public final void p(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new xn8(view, arrayList));
    }

    @Override // defpackage.bo8
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new yn8(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.bo8
    public final void s(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            bo8.j(rect, view);
            ((Transition) obj).setEpicenterCallback(new wn8(0, rect));
        }
    }

    @Override // defpackage.bo8
    public final void t(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new wn8(1, rect));
    }

    @Override // defpackage.bo8
    public final void u(o oVar, Object obj, f11 f11Var, Runnable runnable) {
        ((Transition) obj).addListener(new zn8(runnable));
    }

    @Override // defpackage.bo8
    public final void w(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bo8.f(targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // defpackage.bo8
    public final void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            A(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // defpackage.bo8
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}
