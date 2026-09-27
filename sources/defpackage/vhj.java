package defpackage;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import io.ably.lib.rest.Auth;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class vhj implements igj {
    public abstract e4k a();

    public abstract ita b();

    public abstract boolean c();

    public abstract vhj d(ota otaVar);

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vhj) {
                vhj vhjVar = (vhj) obj;
                if (c() != vhjVar.c() || a() != vhjVar.a() || !b().equals(vhjVar.b())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = a().hashCode();
        if (mij.m(b())) {
            return (hashCode2 * 31) + 19;
        }
        int i = hashCode2 * 31;
        if (c()) {
            hashCode = 17;
        } else {
            hashCode = b().hashCode();
        }
        return i + hashCode;
    }

    public final String toString() {
        if (c()) {
            return Auth.WILDCARD_CLIENTID;
        }
        if (a() == e4k.INVARIANT) {
            return b().toString();
        }
        return a() + ApiConstant.SPACE + b();
    }
}
