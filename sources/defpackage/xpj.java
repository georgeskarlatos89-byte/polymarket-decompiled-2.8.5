package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class xpj implements eb8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ xdh d;
    public final /* synthetic */ qf8 e;

    public /* synthetic */ xpj(boolean z, int i, xdh xdhVar, qf8 qf8Var, int i2) {
        this.a = i2;
        this.b = z;
        this.c = i;
        this.d = xdhVar;
        this.e = qf8Var;
    }

    @Override // defpackage.eb8
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        qf8 qf8Var = this.e;
        xdh xdhVar = this.d;
        int i2 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                if (z && intValue != i2) {
                    if (xdhVar != null) {
                        ((hk6) xdhVar).a();
                    }
                    qf8.a(qf8Var);
                }
                return Unit.INSTANCE;
            default:
                int intValue2 = ((Number) obj).intValue();
                if (z && intValue2 != i2) {
                    if (xdhVar != null) {
                        ((hk6) xdhVar).a();
                    }
                    qf8.a(qf8Var);
                }
                return Unit.INSTANCE;
        }
    }
}
