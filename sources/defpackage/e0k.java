package defpackage;

import io.intercom.android.sdk.m5.home.ui.components.WrapReportingTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class e0k implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qqc b;

    public /* synthetic */ e0k(int i, qqc qqcVar) {
        this.a = i;
        this.b = qqcVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        qqc qqcVar = this.b;
        switch (i) {
            case 0:
                qqcVar.setValue((Double) obj);
                return Unit.INSTANCE;
            default:
                return WrapReportingTextKt.d(qqcVar, (t35) obj);
        }
    }
}
