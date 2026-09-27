package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.polymarket.android.R;
import io.sentry.android.core.m0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class k9k {
    public static WeakHashMap a;
    public static final int[] b = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final b9k c = new b9k();

    public static void a(View view, ViewGroup viewGroup) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        view2.getClass();
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    public static fbk b(View view) {
        WeakHashMap weakHashMap = a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            a = weakHashMap;
        }
        fbk fbkVar = (fbk) weakHashMap.get(view);
        if (fbkVar == null) {
            fbk fbkVar2 = new fbk(view);
            a.put(view, fbkVar2);
            return fbkVar2;
        }
        return fbkVar;
    }

    public static vlk c(View view, vlk vlkVar) {
        WindowInsets g = vlkVar.g();
        if (g != null) {
            WindowInsets a2 = j9k.a(view, g);
            if (!a2.equals(g)) {
                return vlk.h(view, a2);
            }
        }
        return vlkVar;
    }

    public static void d(View view) {
        n6 n6Var;
        View.AccessibilityDelegate a2 = i9k.a(view);
        if (a2 == null) {
            n6Var = null;
        } else if (a2 instanceof m6) {
            n6Var = ((m6) a2).a;
        } else {
            n6Var = new n6(a2);
        }
        if (n6Var == null) {
            n6Var = new n6();
        }
        j(view, n6Var);
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static void f(View view, int i) {
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (h9k.a(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            int i2 = 32;
            if (view.getAccessibilityLiveRegion() == 0 && !z) {
                if (i == 32) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    view.onInitializeAccessibilityEvent(obtain);
                    obtain.setEventType(32);
                    obtain.setContentChangeTypes(i);
                    obtain.setSource(view);
                    view.onPopulateAccessibilityEvent(obtain);
                    obtain.getText().add(h9k.a(view));
                    accessibilityManager.sendAccessibilityEvent(obtain);
                    return;
                }
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e) {
                        m0.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            if (!z) {
                i2 = 2048;
            }
            obtain2.setEventType(i2);
            obtain2.setContentChangeTypes(i);
            if (z) {
                obtain2.getText().add(h9k.a(view));
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
            }
            view.sendAccessibilityEventUnchecked(obtain2);
        }
    }

    public static vlk g(View view, vlk vlkVar) {
        WindowInsets g = vlkVar.g();
        if (g != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(g);
            if (!onApplyWindowInsets.equals(g)) {
                return vlk.h(view, onApplyWindowInsets);
            }
        }
        return vlkVar;
    }

    public static void h(View view, int i) {
        ArrayList e = e(view);
        for (int i2 = 0; i2 < e.size(); i2++) {
            if (((x6) e.get(i2)).a() == i) {
                e.remove(i2);
                return;
            }
        }
    }

    public static void i(View view, x6 x6Var, v7 v7Var) {
        x6 x6Var2 = new x6(null, x6Var.b, null, v7Var, x6Var.c);
        d(view);
        h(view, x6Var2.a());
        e(view).add(x6Var2);
        f(view, 0);
    }

    public static void j(View view, n6 n6Var) {
        View.AccessibilityDelegate bridge;
        if (n6Var == null && (i9k.a(view) instanceof m6)) {
            n6Var = new n6();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (n6Var == null) {
            bridge = null;
        } else {
            bridge = n6Var.getBridge();
        }
        view.setAccessibilityDelegate(bridge);
    }

    public static void k(View view, CharSequence charSequence) {
        boolean z;
        new a9k(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 0).f(view, charSequence);
        b9k b9kVar = c;
        if (charSequence != null) {
            WeakHashMap weakHashMap = b9kVar.a;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(b9kVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(b9kVar);
                return;
            }
            return;
        }
        b9kVar.a.remove(view);
        view.removeOnAttachStateChangeListener(b9kVar);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(b9kVar);
    }
}
