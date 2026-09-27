package io.sentry.protocol;

import com.socure.docv.capturesdk.api.Keys;
import io.sentry.j2;
import io.sentry.l3;
import io.sentry.n5;
import io.sentry.x0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class u implements j2 {
    public String a;
    public String b;
    public CopyOnWriteArraySet c;
    public CopyOnWriteArraySet d;
    public HashMap e;

    public u(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.a.equals(uVar.a) && this.b.equals(uVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // io.sentry.j2
    public final void serialize(l3 l3Var, x0 x0Var) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) l3Var;
        cVar.n();
        cVar.u(Keys.KEY_NAME);
        cVar.D(this.a);
        cVar.u("version");
        cVar.D(this.b);
        CopyOnWriteArraySet copyOnWriteArraySet = this.c;
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = n5.d().b;
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.d;
        if (copyOnWriteArraySet2 == null) {
            copyOnWriteArraySet2 = n5.d().a;
        }
        if (!copyOnWriteArraySet.isEmpty()) {
            cVar.u("packages");
            cVar.A(x0Var, copyOnWriteArraySet);
        }
        if (!copyOnWriteArraySet2.isEmpty()) {
            cVar.u("integrations");
            cVar.A(x0Var, copyOnWriteArraySet2);
        }
        HashMap hashMap = this.e;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                com.fingerprintjs.android.fpjs_pro.g.y(this.e, str, cVar, str, x0Var);
            }
        }
        cVar.p();
    }
}
