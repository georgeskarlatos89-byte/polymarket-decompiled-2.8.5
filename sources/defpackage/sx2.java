package defpackage;

import android.content.Context;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleRequestExtKt;
import io.sentry.android.core.m0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sx2 {
    public final Context a;
    public final qx2 b;
    public final kw0 c;
    public final o13 d;
    public final b13 e;
    public final qv6 f;
    public final long g;
    public final b23 i;
    public final lz2 j;
    public final k13 k;
    public final HashMap h = new HashMap();
    public final Object l = new Object();
    public ArrayList m = new ArrayList();

    public sx2(Context context, kw0 kw0Var, k13 k13Var, long j, b23 b23Var, qje qjeVar) {
        this.a = context;
        this.c = kw0Var;
        b13 b13Var = new b13(new uhl(context, 16));
        this.e = b13Var;
        this.f = qv6.b(context);
        qx2 qx2Var = new qx2(b13Var);
        this.b = qx2Var;
        o13 o13Var = new o13(qx2Var);
        this.d = o13Var;
        synchronized (qx2Var.a) {
            qx2Var.c.add(o13Var);
        }
        this.g = j;
        this.i = b23Var;
        this.k = k13Var;
        try {
            List asList = Arrays.asList(b13Var.b());
            this.j = new lz2(asList, b13Var, kw0Var.a);
            e(asList);
        } catch (pz2 e) {
            throw new Exception(new Exception(e));
        }
    }

    public final LinkedHashSet a() {
        LinkedHashSet linkedHashSet;
        synchronized (this.l) {
            linkedHashSet = new LinkedHashSet(this.m);
        }
        return linkedHashSet;
    }

    public final ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!str.equals("0") && !str.equals(ModuleRequestExtKt.CAPTURE_DELTA)) {
                if (pkn.a(this.e, str)) {
                    arrayList2.add(str);
                } else {
                    o9n.e(3, "Camera2CameraFactory");
                }
            } else {
                arrayList2.add(str);
            }
        }
        return arrayList2;
    }

    public final fy2 c(String str) {
        synchronized (this.l) {
            if (!this.m.contains(str)) {
                throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
            }
        }
        Context context = this.a;
        b13 b13Var = this.e;
        gy2 d = d(str);
        qx2 qx2Var = this.b;
        o13 o13Var = this.d;
        kw0 kw0Var = this.c;
        return new fy2(context, b13Var, str, d, qx2Var, o13Var, kw0Var.a, kw0Var.b, this.f, this.g, this.i);
    }

    public final gy2 d(String str) {
        HashMap hashMap = this.h;
        try {
            gy2 gy2Var = (gy2) hashMap.get(str);
            if (gy2Var == null) {
                gy2 gy2Var2 = new gy2(this.e, str);
                hashMap.put(str, gy2Var2);
                return gy2Var2;
            }
            return gy2Var;
        } catch (pz2 e) {
            throw new Exception(e);
        }
    }

    public final void e(List list) {
        try {
            ArrayList b = b(tkn.b(this, this.k, new ArrayList(list)));
            synchronized (this.l) {
                try {
                    if (this.m.equals(b)) {
                        return;
                    }
                    Objects.toString(this.m);
                    b.toString();
                    o9n.e(3, "Camera2CameraFactory");
                    this.m = b;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (ov9 e) {
            m0.e("Camera2CameraFactory", "Unable to get backward compatible camera ids", e);
            throw e;
        }
    }
}
