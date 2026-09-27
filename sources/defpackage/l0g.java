package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Bundle;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ll0g;", "Landroid/app/Fragment;", "<init>", "()V", "a", "j0g", "lifecycle-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class l0g extends Fragment {
    public static final j0g a = new j0g(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final k0g Companion = new k0g(null);

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            activity.getClass();
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            activity.getClass();
            j0g j0gVar = l0g.a;
            m6b m6bVar = m6b.ON_CREATE;
            j0gVar.getClass();
            j0g.a(activity, m6bVar);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            j0g j0gVar = l0g.a;
            m6b m6bVar = m6b.ON_RESUME;
            j0gVar.getClass();
            j0g.a(activity, m6bVar);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            j0g j0gVar = l0g.a;
            m6b m6bVar = m6b.ON_START;
            j0gVar.getClass();
            j0g.a(activity, m6bVar);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            activity.getClass();
            j0g j0gVar = l0g.a;
            m6b m6bVar = m6b.ON_DESTROY;
            j0gVar.getClass();
            j0g.a(activity, m6bVar);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            activity.getClass();
            j0g j0gVar = l0g.a;
            m6b m6bVar = m6b.ON_PAUSE;
            j0gVar.getClass();
            j0g.a(activity, m6bVar);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            activity.getClass();
            j0g j0gVar = l0g.a;
            m6b m6bVar = m6b.ON_STOP;
            j0gVar.getClass();
            j0g.a(activity, m6bVar);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            activity.getClass();
            bundle.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            activity.getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        k6b k6bVar = m6b.Companion;
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        k6b k6bVar = m6b.Companion;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        k6b k6bVar = m6b.Companion;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        k6b k6bVar = m6b.Companion;
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        k6b k6bVar = m6b.Companion;
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        k6b k6bVar = m6b.Companion;
    }
}
