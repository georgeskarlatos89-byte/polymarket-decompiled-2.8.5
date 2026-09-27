package io.sentry.android.replay;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class c0 extends Lambda implements Function1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ View i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(View view, int i) {
        super(1);
        this.h = i;
        this.i = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.h;
        View view = this.i;
        switch (i) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                weakReference.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(weakReference.get(), view));
            default:
                WeakReference weakReference2 = (WeakReference) obj;
                weakReference2.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(weakReference2.get(), view));
        }
    }
}
