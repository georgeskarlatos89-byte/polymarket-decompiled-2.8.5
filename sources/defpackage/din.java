package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class din {
    public static final void a(boolean z, Function2 function2, pq4 pq4Var, int i) {
        int i2;
        int i3;
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(1818896922);
        if (sr8Var.i(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (sr8Var.j(function2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) == 18 && sr8Var.F()) {
            sr8Var.Y();
        } else {
            hrn.b(z, function2, sr8Var, i5 & WebSocketProtocol.PAYLOAD_SHORT);
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new rz(z, function2, i);
        }
    }

    public static Object b(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return y6.g(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static ArrayList c(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return y6.i(bundle, str, cls);
        }
        return bundle.getParcelableArrayList(str);
    }

    public static Serializable d(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return y6.l(bundle, str, cls);
        }
        Serializable serializable = bundle.getSerializable(str);
        if (cls.isInstance(serializable)) {
            return serializable;
        }
        return null;
    }
}
