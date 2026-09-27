package com.google.android.libraries.places.widget;

import defpackage.qp8;
import defpackage.sp8;
import defpackage.zfd;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzbi implements zfd, sp8 {
    private final /* synthetic */ Function1 zza;

    public zzbi(Function1 function1) {
        function1.getClass();
        this.zza = function1;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof zfd) && (obj instanceof sp8)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((sp8) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.sp8
    public final qp8 getFunctionDelegate() {
        return this.zza;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // defpackage.zfd
    public final /* synthetic */ void onChanged(Object obj) {
        this.zza.invoke(obj);
    }
}
