package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zib {
    public static c5a a(long j, Object obj) {
        int i;
        c5a c5aVar = (c5a) ovj.h(j, obj);
        if (!((v4) c5aVar).a) {
            int size = c5aVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            bgf c = ((bgf) c5aVar).c(i);
            ovj.o(j, obj, c);
            return c;
        }
        return c5aVar;
    }
}
