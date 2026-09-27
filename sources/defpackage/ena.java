package defpackage;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ena extends jjc implements dna {
    public Function1 o;
    public Function1 p;

    @Override // defpackage.dna
    public final boolean Y(KeyEvent keyEvent) {
        Function1 function1 = this.p;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new yma(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.dna
    public final boolean e0(KeyEvent keyEvent) {
        Function1 function1 = this.o;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new yma(keyEvent))).booleanValue();
        }
        return false;
    }
}
