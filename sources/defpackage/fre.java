package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class fre implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qqc b;
    public final /* synthetic */ String c;

    public /* synthetic */ fre(qqc qqcVar, String str, int i) {
        this.a = i;
        this.b = qqcVar;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean areEqual;
        int i = this.a;
        String str = this.c;
        qqc qqcVar = this.b;
        switch (i) {
            case 0:
                areEqual = Intrinsics.areEqual(qqcVar.getValue(), str);
                break;
            default:
                areEqual = Intrinsics.areEqual(qqcVar.getValue(), str);
                break;
        }
        return Boolean.valueOf(areEqual);
    }
}
