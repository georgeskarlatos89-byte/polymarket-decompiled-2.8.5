package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bt0 {
    public boolean a;
    public boolean b;
    public boolean c;

    public ct0 a() {
        if (!this.a && (this.b || this.c)) {
            dmk.n("Secondary offload attribute fields are true but primary isFormatSupported is false");
            return null;
        }
        return new ct0(this);
    }

    public boolean b() {
        if ((this.c || this.b) && this.a) {
            return true;
        }
        return false;
    }

    public void c(ArrayList arrayList) {
        if ((this.a || this.b || this.c) && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((gi6) it.next()).a();
            }
            o9n.e(3, "ForceCloseDeferrableSurface");
        }
    }
}
