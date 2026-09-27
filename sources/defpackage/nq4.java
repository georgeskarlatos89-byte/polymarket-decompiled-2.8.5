package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nq4 implements ijc, vz9 {
    public final Function1 a;
    public zz9 b;
    public final Function3 c;

    public nq4(Function1 function1, Function3 function3) {
        this.a = function1;
        this.c = function3;
    }

    @Override // defpackage.vz9
    public final Sequence getInspectableElements() {
        zz9 zz9Var = this.b;
        if (zz9Var == null) {
            zz9Var = new zz9();
            this.a.invoke(zz9Var);
        }
        this.b = zz9Var;
        return zz9Var.c;
    }

    @Override // defpackage.vz9
    public final String getNameFallback() {
        zz9 zz9Var = this.b;
        if (zz9Var == null) {
            zz9Var = new zz9();
            this.a.invoke(zz9Var);
        }
        this.b = zz9Var;
        return zz9Var.a;
    }
}
