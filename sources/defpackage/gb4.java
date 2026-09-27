package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class gb4 extends fb4 {
    public static void f(List list) {
        list.getClass();
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void g(List list, Comparator comparator) {
        list.getClass();
        comparator.getClass();
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
