package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class j6f {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(f6f.DEFAULT, 0);
        hashMap.put(f6f.VERY_LOW, 1);
        hashMap.put(f6f.HIGHEST, 2);
        for (f6f f6fVar : hashMap.keySet()) {
            a.append(((Integer) b.get(f6fVar)).intValue(), f6fVar);
        }
    }

    public static int a(f6f f6fVar) {
        Integer num = (Integer) b.get(f6fVar);
        if (num != null) {
            return num.intValue();
        }
        fi9.q(f6fVar, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static f6f b(int i) {
        f6f f6fVar = (f6f) a.get(i);
        if (f6fVar != null) {
            return f6fVar;
        }
        dmk.v(ace.f(i, "Unknown Priority for value "));
        return null;
    }
}
