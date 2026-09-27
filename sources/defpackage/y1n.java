package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class y1n {
    public static final String a(ogj ogjVar) {
        StringBuilder sb = new StringBuilder("type: " + ogjVar);
        sb.append('\n');
        sb.append("hashCode: " + ogjVar.hashCode());
        sb.append('\n');
        sb.append("javaClass: " + ogjVar.getClass().getCanonicalName());
        sb.append('\n');
        for (tw5 f = ogjVar.f(); f != null; f = f.e()) {
            sb.append("fqName: ".concat(nn6.a.w(f)));
            sb.append('\n');
            sb.append("javaClass: " + f.getClass().getCanonicalName());
            sb.append('\n');
        }
        return sb.toString();
    }

    public static xna b(String str) {
        Map unmodifiableMap;
        AtomicReference atomicReference = swf.a;
        synchronized (swf.class) {
            unmodifiableMap = Collections.unmodifiableMap(swf.d);
        }
        xna xnaVar = (xna) unmodifiableMap.get(str);
        if (xnaVar != null) {
            return xnaVar;
        }
        throw new GeneralSecurityException(k84.g("cannot find key template: ", str));
    }
}
