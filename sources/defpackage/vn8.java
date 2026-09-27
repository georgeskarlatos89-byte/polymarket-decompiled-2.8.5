package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class vn8 {
    public static final ao8 a = new Object();
    public static final bo8 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ao8] */
    static {
        bo8 bo8Var = null;
        try {
            bo8Var = (bo8) go8.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = bo8Var;
    }

    public static final void a(int i, ArrayList arrayList) {
        arrayList.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
