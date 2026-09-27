package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class sjb {
    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static String b(List list, String str, Function1 function1, int i) {
        String str2;
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str3 = "";
        if ((i & 2) != 0) {
            str2 = "";
        } else {
            str2 = "[\n\t";
        }
        if ((i & 4) == 0) {
            str3 = "\n]";
        }
        if ((i & 32) != 0) {
            function1 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            boolean z = true;
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (function1 != null) {
                sb.append((CharSequence) function1.invoke(obj));
            } else {
                if (obj != null) {
                    z = obj instanceof CharSequence;
                }
                if (z) {
                    sb.append((CharSequence) obj);
                } else if (obj instanceof Character) {
                    sb.append(((Character) obj).charValue());
                } else {
                    sb.append((CharSequence) obj.toString());
                }
            }
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static final Void c(String str) {
        throw new NoSuchElementException(str);
    }

    public static final void d(String str) {
        throw new UnsupportedOperationException(str);
    }
}
