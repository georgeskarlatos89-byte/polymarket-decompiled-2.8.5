package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class a7g implements zx3 {
    public final Function1 a;
    public final String b;

    public a7g(String str, Function1 function1) {
        this.a = function1;
        this.b = "must return ".concat(str);
    }

    @Override // defpackage.zx3
    public final /* bridge */ String a(kba kbaVar) {
        return rnn.a(this, kbaVar);
    }

    @Override // defpackage.zx3
    public final boolean b(kba kbaVar) {
        ita itaVar = kbaVar.g;
        int i = co6.a;
        ujc c = zn6.c(kbaVar);
        c.getClass();
        return Intrinsics.areEqual(itaVar, this.a.invoke(c.b()));
    }

    @Override // defpackage.zx3
    public final String getDescription() {
        return this.b;
    }
}
