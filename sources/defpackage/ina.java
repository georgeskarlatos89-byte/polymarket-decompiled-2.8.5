package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum ina {
    SIGN("sign"),
    VERIFY("verify"),
    ENCRYPT("encrypt"),
    DECRYPT("decrypt"),
    WRAP_KEY("wrapKey"),
    UNWRAP_KEY("unwrapKey"),
    DERIVE_KEY("deriveKey"),
    DERIVE_BITS("deriveBits");

    private final String identifier;

    ina(String str) {
        this.identifier = str;
    }

    public static LinkedHashSet b(List list) {
        ina inaVar;
        if (list == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                ina[] values = values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        inaVar = values[i];
                        if (str.equals(inaVar.identifier)) {
                            break;
                        }
                        i++;
                    } else {
                        inaVar = null;
                        break;
                    }
                }
                if (inaVar != null) {
                    linkedHashSet.add(inaVar);
                } else {
                    fi9.g("Invalid JWK operation: ".concat(str));
                    return null;
                }
            }
        }
        return linkedHashSet;
    }

    public final String a() {
        return this.identifier;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.identifier;
    }
}
