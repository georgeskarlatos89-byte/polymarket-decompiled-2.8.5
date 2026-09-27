package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lw6 extends Lambda implements Function0 {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ lgg i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw6(boolean z, lgg lggVar, String str) {
        super(0);
        this.h = z;
        this.i = lggVar;
        this.j = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.h) {
            lgg lggVar = this.i;
            String str = this.j;
            mad madVar = lggVar.a;
            synchronized (((pf5) madVar.g)) {
            }
        }
        return Unit.INSTANCE;
    }
}
