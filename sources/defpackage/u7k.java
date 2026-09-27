package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class u7k extends Lambda implements Function2 {
    public final /* synthetic */ int h;
    public final /* synthetic */ vc9[] i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u7k(vc9[] vc9VarArr, int i) {
        super(2);
        this.h = i;
        this.i = vc9VarArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.h;
        vc9[] vc9VarArr = this.i;
        switch (i) {
            case 0:
                return Float.valueOf(pwn.b((bne) obj, true, vc9VarArr, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(pwn.b((bne) obj, false, vc9VarArr, ((Number) obj2).floatValue()));
        }
    }
}
