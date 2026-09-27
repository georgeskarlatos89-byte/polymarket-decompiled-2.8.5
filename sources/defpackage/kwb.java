package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kwb {
    public final mvb a;
    public final Throwable b;

    public kwb(mvb mvbVar) {
        this.a = mvbVar;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kwb) {
            kwb kwbVar = (kwb) obj;
            mvb mvbVar = this.a;
            if (mvbVar != null && mvbVar == kwbVar.a) {
                return true;
            }
            Throwable th = this.b;
            if (th != null && kwbVar.b != null) {
                return th.toString().equals(th.toString());
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public kwb(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
