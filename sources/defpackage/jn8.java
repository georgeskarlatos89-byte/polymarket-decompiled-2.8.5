package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jn8 {
    public CopyOnWriteArrayList a;

    public static void a(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
        } else {
            throw m51.g(it);
        }
    }
}
