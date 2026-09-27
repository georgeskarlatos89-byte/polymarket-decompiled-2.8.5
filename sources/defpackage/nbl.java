package defpackage;

import io.ably.lib.util.AgentHeaderCreator;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class nbl {
    public final String a;
    public final Class b;
    public final boolean c;
    public final boolean d;
    public final long e;

    public nbl(String str, Class cls, boolean z, boolean z2) {
        if (!str.isEmpty()) {
            char charAt = str.charAt(0);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                for (int i = 1; i < str.length(); i++) {
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && ((charAt2 < '0' || charAt2 > '9') && charAt2 != '_'))) {
                        dmk.v("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                        throw null;
                    }
                }
                this.a = str;
                this.b = cls;
                this.c = z;
                this.d = z2;
                int identityHashCode = System.identityHashCode(this);
                long j = 0;
                for (int i2 = 0; i2 < 5; i2++) {
                    j |= 1 << (identityHashCode & 63);
                    identityHashCode >>>= 6;
                }
                this.e = j;
                return;
            }
            dmk.v("identifier must start with an ASCII letter: ".concat(str));
            throw null;
        }
        dmk.v("identifier must not be empty");
        throw null;
    }

    public void a(Iterator it, mfl mflVar) {
        while (it.hasNext()) {
            b(it.next(), mflVar);
        }
    }

    public void b(Object obj, mfl mflVar) {
        mflVar.a(this.a, obj);
    }

    public final String toString() {
        String name = getClass().getName();
        return sv6.p(sv6.t(name, AgentHeaderCreator.AGENT_DIVIDER), this.a, "[", this.b.getName(), "]");
    }
}
