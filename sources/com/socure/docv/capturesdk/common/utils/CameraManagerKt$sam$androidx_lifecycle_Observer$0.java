package com.socure.docv.capturesdk.common.utils;

import defpackage.qp8;
import defpackage.sp8;
import defpackage.zfd;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CameraManagerKt$sam$androidx_lifecycle_Observer$0 implements zfd, sp8 {
    private final /* synthetic */ Function1 function;

    public CameraManagerKt$sam$androidx_lifecycle_Observer$0(Function1 function1) {
        function1.getClass();
        this.function = function1;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof zfd) && (obj instanceof sp8)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((sp8) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.sp8
    public final qp8 getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // defpackage.zfd
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
