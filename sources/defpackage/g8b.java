package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class g8b {
    public static final List b = CollectionsKt.listOf(new g8b(1), new g8b(2), new g8b(4));
    public final int a;

    public /* synthetic */ g8b(int i) {
        this.a = i;
    }

    public static String a(int i) {
        if (i == 1) {
            return "CR";
        }
        if (i == 2) {
            return "LF";
        }
        if (i == 4) {
            return "CRLF";
        }
        List list = b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if ((((g8b) obj).a | i) == i) {
                arrayList.add(obj);
            }
        }
        return arrayList.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g8b) {
            if (this.a != ((g8b) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
