package defpackage;

import android.content.Context;
import android.os.Looper;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class yc0 extends bd0 {
    public cd0 buildClient(Context context, Looper looper, r64 r64Var, Object obj, gw4 gw4Var, eid eidVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    @Deprecated
    public cd0 buildClient(Context context, Looper looper, r64 r64Var, Object obj, bx8 bx8Var, cx8 cx8Var) {
        return buildClient(context, looper, r64Var, obj, (gw4) bx8Var, (eid) cx8Var);
    }
}
