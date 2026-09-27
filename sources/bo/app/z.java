package bo.app;

import java.util.Comparator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class z implements Comparator {
    public final /* synthetic */ y a;

    public z(y yVar) {
        this.a = yVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare = this.a.compare(obj, obj2);
        if (compare != 0) {
            return compare;
        }
        return Long.valueOf(((ke) obj).b).compareTo(Long.valueOf(((ke) obj2).b));
    }
}
