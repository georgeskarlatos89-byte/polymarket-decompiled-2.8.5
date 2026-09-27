package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class eb4 {
    public static rib a(rib ribVar) {
        ribVar.h();
        ribVar.c = true;
        if (ribVar.b > 0) {
            return ribVar;
        }
        return rib.e;
    }

    public static rib b() {
        return new rib(0, 1, null);
    }

    public static List c(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }
}
