package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lc5g;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class c5g extends IllegalStateException {
    public final transient gh9 a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c5g(gh9 gh9Var, String str) {
        super(m51.m(r0, str, '\"'));
        gh9Var.getClass();
        str.getClass();
        StringBuilder sb = new StringBuilder("Bad response: ");
        sb.append(gh9Var);
        sb.append(". Text: \"");
        this.a = gh9Var;
    }
}
