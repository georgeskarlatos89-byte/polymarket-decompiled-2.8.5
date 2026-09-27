package defpackage;

import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class hna {
    public static final Logger b = Logger.getLogger(hna.class.getName());
    public final ConcurrentHashMap a;

    public hna(hna hnaVar) {
        this.a = new ConcurrentHashMap(hnaVar.a);
    }

    public final synchronized gna a(String str) {
        if (this.a.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (gna) this.a.get(str);
    }

    public final synchronized void b(eoa eoaVar) {
        if (eoaVar.b().a()) {
            c(new gna(eoaVar));
        } else {
            throw new GeneralSecurityException("failed to register key manager " + eoaVar.getClass() + " as it is not FIPS compatible.");
        }
    }

    public final synchronized void c(gna gnaVar) {
        eoa eoaVar = gnaVar.a;
        Class cls = (Class) eoaVar.d;
        if (!((Map) eoaVar.b).keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException("Given internalKeyMananger " + eoaVar.toString() + " does not support primitive class " + cls.getName());
        }
        String f = eoaVar.f();
        gna gnaVar2 = (gna) this.a.get(f);
        if (gnaVar2 != null && !gnaVar2.a.getClass().equals(gnaVar.a.getClass())) {
            b.warning("Attempted overwrite of a registered key manager for key type ".concat(f));
            throw new GeneralSecurityException("typeUrl (" + f + ") is already registered with " + gnaVar2.a.getClass().getName() + ", cannot be re-registered with " + gnaVar.a.getClass().getName());
        }
        this.a.putIfAbsent(f, gnaVar);
    }

    public hna() {
        this.a = new ConcurrentHashMap();
    }
}
