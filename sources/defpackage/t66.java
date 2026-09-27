package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class t66 implements h7b {
    private final DefaultLifecycleObserver a;
    private final h7b b;

    public t66(DefaultLifecycleObserver defaultLifecycleObserver, h7b h7bVar) {
        this.a = defaultLifecycleObserver;
        this.b = h7bVar;
    }

    @Override // defpackage.h7b
    public final void y(LifecycleOwner lifecycleOwner, m6b m6bVar) {
        switch (s66.a[m6bVar.ordinal()]) {
            case 1:
                this.a.onCreate(lifecycleOwner);
                break;
            case 2:
                this.a.onStart(lifecycleOwner);
                break;
            case 3:
                this.a.onResume(lifecycleOwner);
                break;
            case 4:
                this.a.onPause(lifecycleOwner);
                break;
            case 5:
                this.a.onStop(lifecycleOwner);
                break;
            case 6:
                this.a.onDestroy(lifecycleOwner);
                break;
            case 7:
                dmk.v("ON_ANY must not been send by anybody");
                return;
            default:
                dmk.a();
                return;
        }
        h7b h7bVar = this.b;
        if (h7bVar != null) {
            h7bVar.y(lifecycleOwner, m6bVar);
        }
    }
}
