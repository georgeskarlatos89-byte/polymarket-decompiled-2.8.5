package defpackage;

import io.ably.lib.rest.Auth;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class y45 {
    public static final y45 e = new y45(Auth.WILDCARD_CLIENTID, Auth.WILDCARD_CLIENTID);
    public final String a;
    public final List b;
    public final String c;
    public final String d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y45(String str, String str2, List list) {
        this(str + '/' + str2, list);
        str.getClass();
        str2.getClass();
        list.getClass();
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
    
        if (r1 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(y45 y45Var) {
        boolean o;
        y45Var.getClass();
        String str = y45Var.c;
        String str2 = y45Var.d;
        if (!Intrinsics.areEqual(str, Auth.WILDCARD_CLIENTID) && !e.o(y45Var.c, this.c, true)) {
            return false;
        }
        if (!Intrinsics.areEqual(str2, Auth.WILDCARD_CLIENTID) && !e.o(str2, this.d, true)) {
            return false;
        }
        for (m59 m59Var : y45Var.b) {
            String str3 = m59Var.a;
            String str4 = m59Var.b;
            if (Intrinsics.areEqual(str3, Auth.WILDCARD_CLIENTID)) {
                if (!Intrinsics.areEqual(str4, Auth.WILDCARD_CLIENTID)) {
                    List list = this.b;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (e.o(((m59) it.next()).b, str4, true)) {
                            }
                        }
                    }
                    o = false;
                }
                o = true;
                break;
            }
            String b = b(str3);
            if (!Intrinsics.areEqual(str4, Auth.WILDCARD_CLIENTID)) {
                o = e.o(b, str4, true);
            }
            if (!o) {
                return false;
            }
        }
        return true;
    }

    public final String b(String str) {
        str.getClass();
        List list = this.b;
        int I = CollectionsKt.I(list);
        if (I >= 0) {
            int i = 0;
            while (true) {
                m59 m59Var = (m59) list.get(i);
                if (e.o(m59Var.a, str, true)) {
                    return m59Var.b;
                }
                if (i != I) {
                    i++;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        if (kotlin.text.e.o(r1.b, r7, true) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y45 c(String str) {
        str.getClass();
        List list = this.b;
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                List<m59> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (m59 m59Var : list2) {
                        if (e.o(m59Var.a, "charset", true) && e.o(m59Var.b, str, true)) {
                            return this;
                        }
                    }
                }
            } else {
                m59 m59Var2 = (m59) list.get(0);
                if (e.o(m59Var2.a, "charset", true)) {
                }
            }
        }
        return new y45(this.c, this.d, this.a, CollectionsKt.plus(list, new m59("charset", str)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y45) {
            y45 y45Var = (y45) obj;
            if (e.o(this.c, y45Var.c, true) && e.o(this.d, y45Var.d, true) && Intrinsics.areEqual(this.b, y45Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.c.toLowerCase(locale);
        lowerCase.getClass();
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.d.toLowerCase(locale);
        lowerCase2.getClass();
        int hashCode2 = lowerCase2.hashCode();
        return (this.b.hashCode() * 31) + hashCode2 + (hashCode * 31) + hashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x011c A[LOOP:1: B:13:0x0047->B:36:0x011c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0120 A[EDGE_INSN: B:37:0x0120->B:73:0x0120 BREAK  A[LOOP:1: B:13:0x0047->B:36:0x011c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        List<m59> list = this.b;
        boolean isEmpty = list.isEmpty();
        String str = this.a;
        if (isEmpty) {
            return str;
        }
        int length = str.length();
        int i = 0;
        for (m59 m59Var : list) {
            i += m59Var.b.length() + m59Var.a.length() + 3;
        }
        StringBuilder sb = new StringBuilder(length + i);
        sb.append(str);
        int size = list.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                m59 m59Var2 = (m59) list.get(i2);
                sb.append("; ");
                sb.append(m59Var2.a);
                sb.append("=");
                String str2 = m59Var2.b;
                Set set = n59.a;
                if (str2.length() != 0) {
                    if (str2.length() >= 2 && r2i.E(str2) == '\"' && r2i.F(str2) == '\"') {
                        int i3 = 1;
                        do {
                            int Q = StringsKt.Q(str2, '\"', i3, 4);
                            if (Q == str2.length() - 1) {
                                break;
                            }
                            int i4 = 0;
                            for (int i5 = Q - 1; str2.charAt(i5) == '\\'; i5--) {
                                i4++;
                            }
                            if (i4 % 2 != 0) {
                                i3 = Q + 1;
                            }
                        } while (i3 < str2.length());
                        sb.append(str2);
                        if (i2 == size) {
                            break;
                        }
                        i2++;
                    }
                    int length2 = str2.length();
                    for (int i6 = 0; i6 < length2; i6++) {
                        if (!n59.a.contains(Character.valueOf(str2.charAt(i6)))) {
                        }
                    }
                    sb.append(str2);
                    if (i2 == size) {
                    }
                }
                StringBuilder sb2 = new StringBuilder("\"");
                int length3 = str2.length();
                for (int i7 = 0; i7 < length3; i7++) {
                    char charAt = str2.charAt(i7);
                    if (charAt != '\t') {
                        if (charAt != '\n') {
                            if (charAt != '\r') {
                                if (charAt != '\"') {
                                    if (charAt != '\\') {
                                        sb2.append(charAt);
                                    } else {
                                        sb2.append("\\\\");
                                    }
                                } else {
                                    sb2.append("\\\"");
                                }
                            } else {
                                sb2.append("\\r");
                            }
                        } else {
                            sb2.append("\\n");
                        }
                    } else {
                        sb2.append("\\t");
                    }
                }
                sb2.append("\"");
                sb.append(sb2.toString());
                if (i2 == size) {
                }
            }
        }
        return sb.toString();
    }

    public y45(String str, List list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public /* synthetic */ y45(String str, String str2) {
        this(str, str2, CollectionsKt.emptyList());
    }

    public y45(String str, String str2, String str3, List list) {
        this(str3, list);
        this.c = str;
        this.d = str2;
    }
}
