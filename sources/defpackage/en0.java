package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class en0 extends Lambda implements Function0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Function0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ en0(Function0 function0, int i) {
        super(0);
        this.h = i;
        this.i = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.h) {
            case 0:
                return this.i.invoke();
            default:
                return this.i.invoke();
        }
    }
}
