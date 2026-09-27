package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class b8c implements k05 {
    public final /* synthetic */ c27 a;
    public final /* synthetic */ gnb b;
    public final /* synthetic */ l7c c;
    public final /* synthetic */ IOException d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ b8c(c27 c27Var, gnb gnbVar, l7c l7cVar, IOException iOException, boolean z) {
        this.a = c27Var;
        this.b = gnbVar;
        this.c = l7cVar;
        this.d = iOException;
        this.e = z;
    }

    @Override // defpackage.k05
    public final void accept(Object obj) {
        d8c d8cVar = (d8c) obj;
        c27 c27Var = this.a;
        d8cVar.g(c27Var.a, c27Var.b, this.b, this.c, this.d, this.e);
    }
}
