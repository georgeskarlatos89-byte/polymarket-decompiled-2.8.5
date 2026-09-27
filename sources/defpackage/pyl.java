package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class pyl implements qd7 {
    public static final iml d = new iml(9);
    public final /* synthetic */ int a;
    public final HashMap b;
    public final HashMap c;

    public pyl(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new HashMap();
                this.c = new HashMap();
                return;
            case 2:
                this.b = new HashMap();
                this.c = new HashMap();
                return;
            case 3:
                this.b = new HashMap();
                this.c = new HashMap();
                return;
            default:
                this.b = new HashMap();
                this.c = new HashMap();
                return;
        }
    }

    public void a(d6f d6fVar) {
        if (d6fVar != null) {
            Class b = d6fVar.b();
            HashMap hashMap = this.c;
            if (hashMap.containsKey(b)) {
                d6f d6fVar2 = (d6f) hashMap.get(b);
                if (d6fVar2.equals(d6fVar) && d6fVar.equals(d6fVar2)) {
                    return;
                } else {
                    throw new GeneralSecurityException(ace.j(b, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type"));
                }
            }
            hashMap.put(b, d6fVar);
            return;
        }
        dmk.s("wrapper must be non-null");
    }

    @Override // defpackage.qd7
    public /* bridge */ /* synthetic */ qd7 registerEncoder(Class cls, dfd dfdVar) {
        int i = this.a;
        HashMap hashMap = this.c;
        HashMap hashMap2 = this.b;
        switch (i) {
            case 0:
                hashMap2.put(cls, dfdVar);
                hashMap.remove(cls);
                return this;
            case 1:
            default:
                hashMap2.put(cls, dfdVar);
                hashMap.remove(cls);
                return this;
            case 2:
                hashMap2.put(cls, dfdVar);
                hashMap.remove(cls);
                return this;
        }
    }

    public pyl(u5f u5fVar) {
        this.a = 1;
        this.b = new HashMap(u5fVar.a);
        this.c = new HashMap(u5fVar.b);
    }
}
