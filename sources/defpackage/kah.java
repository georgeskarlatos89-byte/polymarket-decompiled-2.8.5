package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kah implements zec {
    public final ArrayList a;

    public kah(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((jah) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((jah) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((jah) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        pfn.b(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kah.class == obj.getClass()) {
            return this.a.equals(((kah) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }
}
