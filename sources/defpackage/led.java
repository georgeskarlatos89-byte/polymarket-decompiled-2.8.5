package defpackage;

import kotlin.jvm.functions.Function0;
import skip.foundation.OSAllocatedUnfairLock;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class led implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OSAllocatedUnfairLock b;

    public /* synthetic */ led(OSAllocatedUnfairLock oSAllocatedUnfairLock, int i) {
        this.a = i;
        this.b = oSAllocatedUnfairLock;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        OSAllocatedUnfairLock oSAllocatedUnfairLock = this.b;
        switch (i) {
            case 0:
                return OSAllocatedUnfairLock.h(oSAllocatedUnfairLock);
            case 1:
                return OSAllocatedUnfairLock.f(oSAllocatedUnfairLock);
            case 2:
                return OSAllocatedUnfairLock.g(oSAllocatedUnfairLock);
            case 3:
                return OSAllocatedUnfairLock.d(oSAllocatedUnfairLock);
            case 4:
                return OSAllocatedUnfairLock.b(oSAllocatedUnfairLock);
            default:
                return OSAllocatedUnfairLock.c(oSAllocatedUnfairLock);
        }
    }
}
