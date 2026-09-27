package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wcj {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList c = new ArrayList();

    public wcj(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wcj) {
            wcj wcjVar = (wcj) obj;
            if (this.b == wcjVar.b && this.a.equals(wcjVar.a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder t = sv6.t("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        t.append(this.b);
        t.append("\n");
        String concat = t.toString().concat("    values:");
        HashMap hashMap = this.a;
        for (String str : hashMap.keySet()) {
            concat = concat + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return concat;
    }
}
