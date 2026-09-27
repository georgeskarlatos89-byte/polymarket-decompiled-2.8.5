package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class jnj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qqc b;

    public /* synthetic */ jnj(int i, qqc qqcVar) {
        this.a = i;
        this.b = qqcVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        boolean z = true;
        qqc qqcVar = this.b;
        switch (i) {
            case 0:
                qqcVar.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                qqcVar.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 2:
                qqcVar.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 3:
                if (((Number) ((Function0) qqcVar.getValue()).invoke()).floatValue() <= 0.0f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                qqcVar.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 5:
                qqcVar.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 6:
                qqcVar.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 7:
                qqcVar.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 8:
                qqcVar.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 9:
                qqcVar.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 10:
                qqcVar.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 11:
                qqcVar.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 12:
                qqcVar.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 13:
                qqcVar.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 14:
                qqcVar.setValue(Boolean.valueOf(!((Boolean) qqcVar.getValue()).booleanValue()));
                return Unit.INSTANCE;
            default:
                qqcVar.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}
