package kotlin.text;

import defpackage.dmk;
import defpackage.l2i;
import defpackage.pwg;
import defpackage.r2i;
import defpackage.scb;
import defpackage.tl0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class c extends l2i {
    public static String b(String str) {
        return pwg.l(pwg.n(new tl0(str, 6), new scb("    ", 20)), "\n", null, 62);
    }

    public static final String c(String str) {
        int i;
        Comparable comparable;
        int i2;
        String str2;
        str.getClass();
        List<String> lines = StringsKt__StringsKt.lines(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : lines) {
            if (!StringsKt.T((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.w(arrayList));
        Iterator it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            int length = str3.length();
            while (true) {
                if (i < length) {
                    if (!CharsKt.c(str3.charAt(i))) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                i = str3.length();
            }
            arrayList2.add(Integer.valueOf(i));
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        int length2 = str.length();
        lines.size();
        int size = lines.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : lines) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str4 = (String) obj2;
            if ((i == 0 || i == size) && StringsKt.T(str4)) {
                str2 = null;
            } else {
                str2 = r2i.C(i2, str4);
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i = i3;
        }
        StringBuilder sb = new StringBuilder(length2);
        CollectionsKt.M(arrayList3, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    public static String d(String str) {
        String substring;
        str.getClass();
        if (!StringsKt.T("|")) {
            List<String> lines = StringsKt__StringsKt.lines(str);
            int length = str.length();
            lines.size();
            int size = lines.size() - 1;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : lines) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str2 = (String) obj;
                if ((i == 0 || i == size) && StringsKt.T(str2)) {
                    str2 = null;
                } else {
                    int length2 = str2.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            if (!CharsKt.c(str2.charAt(i3))) {
                                break;
                            }
                            i3++;
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    if (i3 == -1 || !e.t(i3, str2, false, "|")) {
                        substring = null;
                    } else {
                        substring = str2.substring("|".length() + i3);
                    }
                    if (substring != null) {
                        str2 = substring;
                    }
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                i = i2;
            }
            StringBuilder sb = new StringBuilder(length);
            CollectionsKt.M(arrayList, sb, "\n", null, null, null, 124);
            return sb.toString();
        }
        dmk.v("marginPrefix must be non-blank string.");
        return null;
    }
}
