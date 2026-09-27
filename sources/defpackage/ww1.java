package defpackage;

import kotlin.jvm.functions.Function1;
import skip.lib.CGPoint;
import skip.lib.CGRect;
import skip.lib.CGSize;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ww1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CGRect b;

    public /* synthetic */ ww1(CGRect cGRect, int i) {
        this.a = i;
        this.b = cGRect;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        CGRect cGRect = this.b;
        switch (i) {
            case 0:
                return CGRect.a(cGRect, (CGSize) obj);
            default:
                return CGRect.b(cGRect, (CGPoint) obj);
        }
    }
}
