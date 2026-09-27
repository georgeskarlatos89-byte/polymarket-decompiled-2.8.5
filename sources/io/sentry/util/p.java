package io.sentry.util;

import io.sentry.h0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class p {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static boolean a(String str, List list) {
        boolean matches;
        if (str != null && list != null && !list.isEmpty()) {
            ConcurrentHashMap concurrentHashMap = a;
            if (concurrentHashMap.containsKey(str)) {
                return ((Boolean) concurrentHashMap.get(str)).booleanValue();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((h0) it.next()).a.equalsIgnoreCase(str)) {
                    concurrentHashMap.put(str, Boolean.TRUE);
                    return true;
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    Pattern pattern = ((h0) it2.next()).b;
                    if (pattern == null) {
                        matches = false;
                    } else {
                        matches = pattern.matcher(str).matches();
                    }
                } catch (Throwable unused) {
                }
                if (matches) {
                    concurrentHashMap.put(str, Boolean.TRUE);
                    return true;
                }
                continue;
            }
            concurrentHashMap.put(str, Boolean.FALSE);
        }
        return false;
    }
}
