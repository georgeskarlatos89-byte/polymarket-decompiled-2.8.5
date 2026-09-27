package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Luo8;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class uo8 extends RuntimeException {
    public final vo8 a;
    public final Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo8(vo8 vo8Var, Throwable th) {
        super(th);
        vo8Var.getClass();
        this.a = vo8Var;
        this.b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.b;
    }
}
