package defpackage;

import java.util.Calendar;
import java.util.Date;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class k6l extends w84 {
    public final j6l c;

    public k6l(n2o n2oVar, int i, j6l j6lVar) {
        super(n2oVar, i);
        char c;
        this.c = j6lVar;
        StringBuilder sb = new StringBuilder("%");
        n2oVar.d(sb);
        if (true != n2oVar.c()) {
            c = 't';
        } else {
            c = 'T';
        }
        sb.append(c);
        sb.append(j6lVar.b());
    }

    @Override // defpackage.w84
    public final void G(rc0 rc0Var, Object obj) {
        char c;
        n2o n2oVar = (n2o) this.b;
        StringBuilder sb = (StringBuilder) rc0Var.g;
        boolean z = obj instanceof Date;
        j6l j6lVar = this.c;
        if (!z && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            char b = j6lVar.b();
            StringBuilder sb2 = new StringBuilder(String.valueOf(b).length() + 2);
            sb2.append("%t");
            sb2.append(b);
            rc0.j(sb, obj, sb2.toString());
            return;
        }
        StringBuilder sb3 = new StringBuilder("%");
        n2oVar.d(sb3);
        if (true != n2oVar.c()) {
            c = 't';
        } else {
            c = 'T';
        }
        sb3.append(c);
        sb3.append(j6lVar.b());
        sb.append(String.format(q2o.a, sb3.toString(), obj));
    }
}
