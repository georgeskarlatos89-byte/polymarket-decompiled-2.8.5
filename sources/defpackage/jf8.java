package defpackage;

import android.graphics.Rect;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jf8 extends Lambda implements Function1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ kf8 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf8(kf8 kf8Var, int i) {
        super(1);
        this.h = i;
        this.i = kf8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        zrf zrfVar;
        int i = this.h;
        kf8 kf8Var = this.i;
        switch (i) {
            case 0:
                f23 f23Var = (f23) obj;
                View b = znl.b(kf8Var);
                if (!b.isFocused() && !b.hasFocus()) {
                    wf8 focusOwner = nj6.i(kf8Var).getFocusOwner();
                    View b2 = mvn.b(kf8Var);
                    Integer c = nf8.c(f23Var.a);
                    int[] iArr = new int[2];
                    b2.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    b.getLocationOnScreen(iArr2);
                    yg8 a = jol.a(((ag8) focusOwner).c);
                    Rect rect = null;
                    if (a != null) {
                        zrfVar = jol.b(a);
                    } else {
                        zrfVar = null;
                    }
                    if (zrfVar != null) {
                        int i2 = (int) zrfVar.a;
                        int i3 = iArr[0];
                        int i4 = iArr2[0];
                        int i5 = (int) zrfVar.b;
                        int i6 = iArr[1];
                        int i7 = iArr2[1];
                        rect = new Rect((i2 + i3) - i4, (i5 + i6) - i7, (((int) zrfVar.c) + i3) - i4, (((int) zrfVar.d) + i6) - i7);
                    }
                    if (!nf8.b(b, c, rect)) {
                        f23Var.b = true;
                    }
                }
                return Unit.INSTANCE;
            default:
                znl.b(kf8Var);
                return Unit.INSTANCE;
        }
    }
}
