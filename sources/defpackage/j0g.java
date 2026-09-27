package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import defpackage.l0g;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class j0g {
    public j0g(DefaultConstructorMarker defaultConstructorMarker) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, m6b m6bVar) {
        activity.getClass();
        m6bVar.getClass();
        if (activity instanceof LifecycleOwner) {
            p6b lifecycle = ((LifecycleOwner) activity).getLifecycle();
            if (lifecycle instanceof p7b) {
                ((p7b) lifecycle).f(m6bVar);
            }
        }
    }

    public static void b(Activity activity) {
        activity.getClass();
        l0g.a.Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new l0g.a());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new l0g(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
