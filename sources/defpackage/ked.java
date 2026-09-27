package defpackage;

import kotlin.jvm.functions.Function1;
import skip.foundation.OSAllocatedUnfairLock;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ked implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OSAllocatedUnfairLock b;

    public /* synthetic */ ked(OSAllocatedUnfairLock oSAllocatedUnfairLock, int i) {
        this.a = i;
        this.b = oSAllocatedUnfairLock;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        OSAllocatedUnfairLock oSAllocatedUnfairLock = this.b;
        switch (i) {
            case 0:
                return OSAllocatedUnfairLock.a(oSAllocatedUnfairLock, obj);
            case 1:
                return OSAllocatedUnfairLock.i(oSAllocatedUnfairLock, obj);
            default:
                return OSAllocatedUnfairLock.e(oSAllocatedUnfairLock, obj);
        }
    }
}
