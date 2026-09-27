package io.sentry.protocol;

import com.socure.docv.capturesdk.api.Keys;
import io.sentry.j2;
import io.sentry.l3;
import io.sentry.x0;
import java.util.AbstractMap;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class k implements j2 {
    public String a;
    public String b;
    public String c;
    public w d;
    public w e;
    public String f;
    public AbstractMap g;

    public k(String str) {
        if (str.length() > 4096) {
            this.a = str.substring(0, 4096);
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k) {
                k kVar = (k) obj;
                if (io.sentry.util.b.j(this.a, kVar.a) && io.sentry.util.b.j(this.b, kVar.b) && io.sentry.util.b.j(this.c, kVar.c) && io.sentry.util.b.j(this.d, kVar.d) && io.sentry.util.b.j(this.e, kVar.e) && io.sentry.util.b.j(this.f, kVar.f) && io.sentry.util.b.j(this.g, kVar.g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g});
    }

    @Override // io.sentry.j2
    public final void serialize(l3 l3Var, x0 x0Var) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) l3Var;
        cVar.n();
        cVar.u("message");
        cVar.D(this.a);
        if (this.b != null) {
            cVar.u("contact_email");
            cVar.D(this.b);
        }
        if (this.c != null) {
            cVar.u(Keys.KEY_NAME);
            cVar.D(this.c);
        }
        if (this.d != null) {
            cVar.u("associated_event_id");
            this.d.serialize(cVar, x0Var);
        }
        if (this.e != null) {
            cVar.u("replay_id");
            this.e.serialize(cVar, x0Var);
        }
        if (this.f != null) {
            cVar.u("url");
            cVar.D(this.f);
        }
        AbstractMap abstractMap = this.g;
        if (abstractMap != null) {
            for (String str : abstractMap.keySet()) {
                Object obj = this.g.get(str);
                cVar.u(str);
                cVar.A(x0Var, obj);
            }
        }
        cVar.p();
    }

    public final String toString() {
        return "Feedback{message='" + this.a + "', contactEmail='" + this.b + "', name='" + this.c + "', associatedEventId=" + this.d + ", replayId=" + this.e + ", url='" + this.f + "', unknown=" + this.g + '}';
    }
}
