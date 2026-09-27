package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class goa {
    public static final Map a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(foa.b, new HashSet(Arrays.asList(ina.SIGN, ina.VERIFY)));
        hashMap.put(foa.c, new HashSet(Arrays.asList(ina.ENCRYPT, ina.DECRYPT, ina.WRAP_KEY, ina.UNWRAP_KEY)));
        a = Collections.unmodifiableMap(hashMap);
    }
}
