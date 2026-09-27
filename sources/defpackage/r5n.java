package defpackage;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class r5n extends lbl {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r5n(String str, int i) {
        super(str);
        this.c = i;
    }

    @Override // defpackage.lbl
    public final ndl e(a7h a7hVar, List list) {
        int i = this.c;
        gel gelVar = ndl.e1;
        switch (i) {
            case 0:
                return gelVar;
            case 1:
            case 2:
                return this;
            case 3:
                return new pal(Double.valueOf(ConstantsKt.UNSET));
            default:
                return gelVar;
        }
    }
}
