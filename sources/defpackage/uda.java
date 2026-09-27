package defpackage;

import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class uda implements qd7 {
    public static final sda f;
    public static final sda g;
    public final HashMap a;
    public final HashMap b;
    public final rda c;
    public boolean d;
    public static final rda e = new rda(0);
    public static final tda h = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [sda] */
    /* JADX WARN: Type inference failed for: r0v2, types: [sda] */
    /* JADX WARN: Type inference failed for: r0v3, types: [tda, java.lang.Object] */
    static {
        final int i = 0;
        f = new n3k() { // from class: sda
            @Override // defpackage.nd7
            public final void encode(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((o3k) obj2).add((String) obj);
                        return;
                    default:
                        ((o3k) obj2).add(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
        final int i2 = 1;
        g = new n3k() { // from class: sda
            @Override // defpackage.nd7
            public final void encode(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((o3k) obj2).add((String) obj);
                        return;
                    default:
                        ((o3k) obj2).add(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
    }

    public uda() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        this.c = e;
        this.d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, h);
        hashMap.remove(Date.class);
    }

    @Override // defpackage.qd7
    public final qd7 registerEncoder(Class cls, dfd dfdVar) {
        this.a.put(cls, dfdVar);
        this.b.remove(cls);
        return this;
    }
}
