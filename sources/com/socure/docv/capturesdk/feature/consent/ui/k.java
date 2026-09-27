package com.socure.docv.capturesdk.feature.consent.ui;

import defpackage.qp8;
import defpackage.sp8;
import defpackage.zfd;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class k implements zfd, sp8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ k(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof zfd) || !(obj instanceof sp8)) {
                    return false;
                }
                return Intrinsics.areEqual(function1, ((sp8) obj).getFunctionDelegate());
            case 1:
                if (!(obj instanceof zfd) || !(obj instanceof sp8)) {
                    return false;
                }
                return Intrinsics.areEqual(function1, ((sp8) obj).getFunctionDelegate());
            default:
                if (!(obj instanceof zfd) || !(obj instanceof sp8)) {
                    return false;
                }
                return Intrinsics.areEqual(function1, ((sp8) obj).getFunctionDelegate());
        }
    }

    @Override // defpackage.sp8
    public final qp8 getFunctionDelegate() {
        int i = this.a;
        return this.b;
    }

    public final int hashCode() {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                return function1.hashCode();
            case 1:
                return function1.hashCode();
            default:
                return function1.hashCode();
        }
    }

    @Override // defpackage.zfd
    public final /* synthetic */ void onChanged(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(obj);
                return;
            case 1:
                function1.invoke(obj);
                return;
            default:
                function1.invoke(obj);
                return;
        }
    }
}
