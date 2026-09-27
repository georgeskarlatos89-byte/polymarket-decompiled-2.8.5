package defpackage;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import io.sentry.e6;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class hwe implements e6, sx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ double b;

    public /* synthetic */ hwe(double d, int i) {
        this.a = i;
        this.b = d;
    }

    @Override // defpackage.sx6
    public double c(double d) {
        switch (this.a) {
            case 1:
                if (d < ConstantsKt.UNSET) {
                    d = 0.0d;
                }
                return Math.pow(d, 1.0d / this.b);
            default:
                if (d < ConstantsKt.UNSET) {
                    d = 0.0d;
                }
                return Math.pow(d, this.b);
        }
    }
}
