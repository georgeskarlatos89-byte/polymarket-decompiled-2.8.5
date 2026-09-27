package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ndd extends wfj {
    public static final ldd b = new ldd(new ndd(c4j.LAZILY_PARSED_NUMBER), 0);
    public final c4j a;

    public ndd(c4j c4jVar) {
        this.a = c4jVar;
    }

    @Override // defpackage.wfj
    public final Object b(ufa ufaVar) {
        ega R = ufaVar.R();
        int i = mdd.a[R.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                StringBuilder sb = new StringBuilder("Expecting number, got: ");
                sb.append(R);
                String p = ufaVar.p(false);
                sb.append("; at path ");
                sb.append(p);
                throw new RuntimeException(sb.toString());
            }
            return this.a.a(ufaVar);
        }
        ufaVar.G();
        return null;
    }

    @Override // defpackage.wfj
    public final void c(xga xgaVar, Object obj) {
        xgaVar.R((Number) obj);
    }
}
