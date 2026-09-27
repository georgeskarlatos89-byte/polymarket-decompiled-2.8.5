package defpackage;

import java.util.Collections;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class c1c extends b1c {
    public static int a(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return bd0.API_PRIORITY_OTHER;
    }

    public static Map b(Pair pair) {
        pair.getClass();
        Map singletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        singletonMap.getClass();
        return singletonMap;
    }
}
