package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a10 {
    public static final a10 a = new Object();

    public final void a(View view, lse lseVar) {
        PointerIcon systemIcon;
        Context context = view.getContext();
        if (lseVar instanceof p40) {
            systemIcon = PointerIcon.getSystemIcon(context, ((p40) lseVar).b);
        } else {
            systemIcon = PointerIcon.getSystemIcon(context, 1000);
        }
        if (!Intrinsics.areEqual(view.getPointerIcon(), systemIcon)) {
            view.setPointerIcon(systemIcon);
        }
    }
}
