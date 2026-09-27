package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class d57 {
    public static final HashMap a;
    public static final HashMap b;

    static {
        c57 c57Var;
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        c57 c57Var2 = c57.d;
        hashMap.put(1L, c57Var2);
        hashMap2.put(c57Var2, Collections.singletonList(1L));
        hashMap.put(2L, c57.e);
        hashMap2.put((c57) hashMap.get(2L), Collections.singletonList(2L));
        c57 c57Var3 = c57.f;
        hashMap.put(4L, c57Var3);
        hashMap2.put(c57Var3, Collections.singletonList(4L));
        c57 c57Var4 = c57.g;
        hashMap.put(8L, c57Var4);
        hashMap2.put(c57Var4, Collections.singletonList(8L));
        List asList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = asList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c57Var = c57.h;
            if (!hasNext) {
                break;
            }
            a.put((Long) it.next(), c57Var);
        }
        b.put(c57Var, asList);
        List asList2 = Arrays.asList(Long.valueOf(RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE), 2048L, 256L, 512L);
        Iterator it2 = asList2.iterator();
        while (true) {
            boolean hasNext2 = it2.hasNext();
            c57 c57Var5 = c57.i;
            if (hasNext2) {
                a.put((Long) it2.next(), c57Var5);
            } else {
                b.put(c57Var5, asList2);
                return;
            }
        }
    }

    public static Long a(c57 c57Var, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) b.get(c57Var);
        if (list != null) {
            Set j = h84.j(dynamicRangeProfiles);
            for (Long l : list) {
                if (j.contains(l)) {
                    return l;
                }
            }
            return null;
        }
        return null;
    }
}
