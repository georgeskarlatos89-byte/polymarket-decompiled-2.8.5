package bo.app;

import android.content.SharedPreferences;
import defpackage.aqc;
import defpackage.b69;
import defpackage.fq5;
import defpackage.krn;
import defpackage.n1l;
import defpackage.pm1;
import defpackage.w3h;
import defpackage.y1f;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class v5 {
    public final y1f a(w3h w3hVar, y1f y1fVar) {
        String str = "";
        w3hVar.getClass();
        y1fVar.getClass();
        fq5 fq5Var = fq5.LEGACY_DEVICE_ID;
        if (((aqc) y1fVar).a.containsKey(krn.f(fq5Var.b()))) {
            return y1fVar;
        }
        try {
            aqc c = y1fVar.c();
            String b = fq5.DEVICE_ID.b();
            b.getClass();
            SharedPreferences sharedPreferences = w3hVar.a;
            w3hVar.a(b);
            String string = sharedPreferences.getString(b, "");
            if (string != null) {
                str = string;
            }
            c.i(krn.f(fq5Var.b()), str);
            return c;
        } catch (Exception e) {
            b69.h(this, pm1.E, e, false, new n1l(9), 4);
            return y1fVar;
        }
    }

    public static final String a() {
        return "Failed to migrate legacy device id to DataStore.";
    }
}
