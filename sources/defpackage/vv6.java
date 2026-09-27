package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vv6 implements p9h {
    public final Context a;

    public vv6(Context context) {
        this.a = context;
    }

    @Override // defpackage.p9h
    public final Object d(Continuation continuation) {
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        bt6 bt6Var = new bt6(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new b9h(bt6Var, bt6Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vv6) {
            if (Intrinsics.areEqual(this.a, ((vv6) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
