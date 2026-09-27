package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class gre implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qqc b;
    public final /* synthetic */ String c;

    public /* synthetic */ gre(qqc qqcVar, String str, int i) {
        this.a = i;
        this.b = qqcVar;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        int i = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i) {
            case 0:
                if (booleanValue) {
                    str = this.c;
                } else {
                    str = null;
                }
                this.b.setValue(str);
                return Unit.INSTANCE;
            default:
                if (booleanValue) {
                    str2 = this.c;
                } else {
                    str2 = null;
                }
                this.b.setValue(str2);
                return Unit.INSTANCE;
        }
    }
}
