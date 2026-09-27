package defpackage;

import com.polymarket.designtokens.DesignTokens;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class sfh implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DesignTokens.Padding b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ sfh(DesignTokens.Padding padding, int i, int i2, int i3) {
        this.a = i3;
        this.b = padding;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pq4 pq4Var = (pq4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ufh.b(this.b, pq4Var, rtn.a(this.c | 1), this.d);
                return Unit.INSTANCE;
            default:
                ufh.a(this.b, pq4Var, rtn.a(this.c | 1), this.d);
                return Unit.INSTANCE;
        }
    }
}
