package defpackage;

import io.ably.lib.rest.Auth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lna {
    public static final lna c = new lna("COMPOSITION");
    public final List a;
    public mna b;

    public lna(lna lnaVar) {
        this.a = new ArrayList(lnaVar.a);
        this.b = lnaVar.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0088 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i, String str) {
        boolean z;
        boolean z2;
        List list = this.a;
        if (i < list.size()) {
            if (i == list.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            String str2 = (String) list.get(i);
            if (!str2.equals("**")) {
                if (!str2.equals(str) && !str2.equals(Auth.WILDCARD_CLIENTID)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if ((z || (i == list.size() - 2 && ((String) list.get(list.size() - 1)).equals("**"))) && z2) {
                    return true;
                }
            } else if (!z && ((String) list.get(i + 1)).equals(str)) {
                if (i == list.size() - 2 || (i == list.size() - 3 && ((String) list.get(list.size() - 1)).equals("**"))) {
                }
            } else {
                if (!z) {
                    int i2 = i + 1;
                    if (i2 >= list.size() - 1) {
                        return ((String) list.get(i2)).equals(str);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int b(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.a;
        if (!((String) list.get(i)).equals("**")) {
            return 1;
        }
        if (i == list.size() - 1 || !((String) list.get(i + 1)).equals(str)) {
            return 0;
        }
        return 2;
    }

    public final boolean c(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.a;
        if (i >= list.size()) {
            return false;
        }
        if (((String) list.get(i)).equals(str) || ((String) list.get(i)).equals("**") || ((String) list.get(i)).equals(Auth.WILDCARD_CLIENTID)) {
            return true;
        }
        return false;
    }

    public final boolean d(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.a;
        if (i < list.size() - 1 || ((String) list.get(i)).equals("**")) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lna.class == obj.getClass()) {
            lna lnaVar = (lna) obj;
            if (!this.a.equals(lnaVar.a)) {
                return false;
            }
            mna mnaVar = this.b;
            mna mnaVar2 = lnaVar.b;
            if (mnaVar != null) {
                return mnaVar.equals(mnaVar2);
            }
            if (mnaVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        mna mnaVar = this.b;
        if (mnaVar != null) {
            i = mnaVar.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.a);
        sb.append(",resolved=");
        if (this.b != null) {
            z = true;
        } else {
            z = false;
        }
        return hdi.t(sb, z, '}');
    }

    public lna(String... strArr) {
        this.a = Arrays.asList(strArr);
    }
}
