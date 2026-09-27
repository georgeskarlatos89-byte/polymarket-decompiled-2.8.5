package defpackage;

import java.util.Calendar;
import java.util.Date;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class upl extends w84 {
    public final ppl c;

    public upl(wel welVar, int i, ppl pplVar) {
        super(welVar, i);
        char c;
        this.c = pplVar;
        StringBuilder sb = new StringBuilder("%");
        welVar.a(sb);
        if (true != welVar.c()) {
            c = 't';
        } else {
            c = 'T';
        }
        sb.append(c);
        sb.append(pplVar.a());
    }

    @Override // defpackage.w84
    public final void H(rc0 rc0Var, Object obj) {
        char c;
        wel welVar = (wel) this.b;
        StringBuilder sb = (StringBuilder) rc0Var.g;
        boolean z = obj instanceof Date;
        ppl pplVar = this.c;
        if (!z && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            rc0.i(sb, obj, "%t" + pplVar.a());
            return;
        }
        StringBuilder sb2 = new StringBuilder("%");
        welVar.a(sb2);
        if (true != welVar.c()) {
            c = 't';
        } else {
            c = 'T';
        }
        sb2.append(c);
        sb2.append(pplVar.a());
        sb.append(String.format(bgl.a, sb2.toString(), obj));
    }
}
