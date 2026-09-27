package defpackage;

import io.getstream.chat.android.models.querysort.QuerySortByField;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Formattable;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class rc0 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public Object e;
    public Object f;
    public Object g;

    public rc0(nkl nklVar, Object[] objArr, StringBuilder sb) {
        this.a = 2;
        this.b = 0;
        this.c = -1;
        nfn.f(nklVar, "context");
        this.e = nklVar;
        this.d = 0;
        nfn.f(objArr, "arguments");
        this.f = objArr;
        this.g = sb;
    }

    public static void i(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(bgl.a(obj));
        sb.append("]");
    }

    public static void j(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(q2o.a(obj));
        sb.append("]");
    }

    public void a() {
        this.b = 1;
        this.f = (kfc) this.e;
        this.d = 0;
    }

    public boolean b() {
        hfc b = ((kfc) this.f).b.b();
        int a = b.a(6);
        if ((a != 0 && ((ByteBuffer) b.d).get(a + b.a) != 0) || this.c == 65039) {
            return true;
        }
        return false;
    }

    public void c() {
        if (this.c != 0) {
            HashMap hashMap = ((szn) this.g).d;
            int[] iArr = (int[]) this.e;
            szn sznVar = (szn) hashMap.get(Integer.valueOf(iArr[this.b]));
            while (true) {
                int i = (sznVar.b - sznVar.a) + 1;
                int i2 = this.c;
                if (i <= i2) {
                    int i3 = this.b + i;
                    this.b = i3;
                    this.g = sznVar;
                    int i4 = i2 - i;
                    this.c = i4;
                    if (i4 > 0) {
                        sznVar = (szn) sznVar.d.get(Integer.valueOf(iArr[i3]));
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void d() {
        szn sznVar = ((szn) this.g).c;
        if (sznVar != null) {
            this.g = sznVar;
        } else {
            this.g = (szn) this.f;
            int i = this.c;
            if (i > 0) {
                this.c = i - 1;
            }
            if (this.d > 0) {
                this.b++;
            }
        }
        c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if ((r7 instanceof java.math.BigDecimal) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003f, code lost:
    
        if ((r7 instanceof java.math.BigInteger) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(Object obj, j2o j2oVar, n2o n2oVar) {
        String simpleName;
        int i;
        n2o n2oVar2;
        boolean z;
        StringBuilder sb = (StringBuilder) this.g;
        int ordinal = j2oVar.c().ordinal();
        int i2 = 4;
        int i3 = 1;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            if (!(obj instanceof Double)) {
                                if (!(obj instanceof Float)) {
                                }
                            }
                            z = true;
                        } else {
                            throw null;
                        }
                    } else {
                        if (!(obj instanceof Integer)) {
                            if (!(obj instanceof Long)) {
                                if (!(obj instanceof Byte)) {
                                    if (!(obj instanceof Short)) {
                                    }
                                }
                            }
                        }
                        z = true;
                    }
                } else {
                    if (!(obj instanceof Character)) {
                        if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                            z = Character.isValidCodePoint(((Number) obj).intValue());
                        }
                        z = false;
                    }
                    z = true;
                }
            } else {
                z = obj instanceof Boolean;
            }
            if (!z) {
                j(sb, obj, j2oVar.e());
                return;
            }
        }
        int ordinal2 = j2oVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    if (ordinal2 != 3) {
                        if (ordinal2 == 5) {
                            if (!n2oVar.a()) {
                                int i4 = n2oVar.a;
                                int i5 = i4 & 128;
                                if (i5 != 0) {
                                    if (i5 != i4 || n2oVar.b != -1 || n2oVar.c != -1) {
                                        n2oVar2 = new n2o(i5, -1, -1);
                                    }
                                } else {
                                    n2oVar2 = n2o.e;
                                }
                                if (n2oVar2.equals(n2oVar)) {
                                    Number number = (Number) obj;
                                    Locale locale = q2o.a;
                                    boolean c = n2oVar.c();
                                    long longValue = number.longValue();
                                    if (number instanceof Long) {
                                        q2o.b(sb, longValue, c);
                                        return;
                                    }
                                    if (number instanceof Integer) {
                                        q2o.b(sb, longValue & 4294967295L, c);
                                        return;
                                    }
                                    if (number instanceof Byte) {
                                        q2o.b(sb, longValue & 255, c);
                                        return;
                                    }
                                    if (number instanceof Short) {
                                        q2o.b(sb, longValue & WebSocketProtocol.PAYLOAD_SHORT_MAX, c);
                                        return;
                                    }
                                    if (number instanceof BigInteger) {
                                        String bigInteger = ((BigInteger) number).toString(16);
                                        if (c) {
                                            bigInteger = bigInteger.toUpperCase(q2o.a);
                                        }
                                        sb.append(bigInteger);
                                        return;
                                    }
                                    dmk.n("unsupported number type: ".concat(String.valueOf(number.getClass())));
                                    return;
                                }
                            }
                            n2oVar2 = n2oVar;
                            if (n2oVar2.equals(n2oVar)) {
                            }
                        }
                    }
                } else if (n2oVar.a()) {
                    if (obj instanceof Character) {
                        sb.append(obj);
                        return;
                    }
                    int intValue = ((Number) obj).intValue();
                    if ((intValue >>> 16) == 0) {
                        sb.append((char) intValue);
                        return;
                    } else {
                        sb.append(Character.toChars(intValue));
                        return;
                    }
                }
            }
            if (n2oVar.a()) {
                sb.append(obj);
                return;
            }
        } else if (!(obj instanceof Formattable)) {
            if (n2oVar.a()) {
                sb.append(q2o.a(obj));
                return;
            }
        } else {
            Formattable formattable = (Formattable) obj;
            Locale locale2 = q2o.a;
            int i6 = n2oVar.a;
            int i7 = i6 & 162;
            if (i7 != 0) {
                if ((i6 & 32) == 0) {
                    i3 = 0;
                }
                if ((i6 & 128) != 0) {
                    i = 2;
                } else {
                    i = 0;
                }
                if ((i6 & 2) == 0) {
                    i2 = 0;
                }
                i7 = i3 | i | i2;
            }
            int length = sb.length();
            Formatter formatter = new Formatter(sb, q2o.a);
            try {
                formattable.formatTo(formatter, i7, n2oVar.b, n2oVar.c);
                return;
            } catch (RuntimeException e) {
                sb.setLength(length);
                try {
                    Appendable out = formatter.out();
                    try {
                        simpleName = e.toString();
                    } catch (RuntimeException e2) {
                        simpleName = e2.getClass().getSimpleName();
                    }
                    out.append(q2o.c(formattable, simpleName));
                    return;
                } catch (IOException unused) {
                    return;
                }
            }
        }
        String e3 = j2oVar.e();
        if (!n2oVar.a()) {
            int b = j2oVar.b();
            if (n2oVar.c()) {
                b &= 65503;
            }
            StringBuilder sb2 = new StringBuilder("%");
            n2oVar.d(sb2);
            sb2.append((char) b);
            e3 = sb2.toString();
        }
        sb.append(String.format(q2o.a, e3, obj));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if ((r7 instanceof java.math.BigDecimal) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003f, code lost:
    
        if ((r7 instanceof java.math.BigInteger) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(Object obj, tel telVar, wel welVar) {
        String simpleName;
        int i;
        wel welVar2;
        boolean z;
        StringBuilder sb = (StringBuilder) this.g;
        int ordinal = telVar.d().ordinal();
        int i2 = 4;
        int i3 = 1;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            if (!(obj instanceof Double)) {
                                if (!(obj instanceof Float)) {
                                }
                            }
                            z = true;
                        } else {
                            throw null;
                        }
                    } else {
                        if (!(obj instanceof Integer)) {
                            if (!(obj instanceof Long)) {
                                if (!(obj instanceof Byte)) {
                                    if (!(obj instanceof Short)) {
                                    }
                                }
                            }
                        }
                        z = true;
                    }
                } else {
                    if (!(obj instanceof Character)) {
                        if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                            z = Character.isValidCodePoint(((Number) obj).intValue());
                        }
                        z = false;
                    }
                    z = true;
                }
            } else {
                z = obj instanceof Boolean;
            }
            if (!z) {
                i(sb, obj, telVar.e());
                return;
            }
        }
        int ordinal2 = telVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    if (ordinal2 != 3) {
                        if (ordinal2 == 5) {
                            if (!welVar.b()) {
                                int i4 = welVar.a;
                                int i5 = i4 & 128;
                                if (i5 != 0) {
                                    if (i5 != i4 || welVar.b != -1 || welVar.c != -1) {
                                        welVar2 = new wel(i5, -1, -1);
                                    }
                                } else {
                                    welVar2 = wel.e;
                                }
                                if (welVar2.equals(welVar)) {
                                    Number number = (Number) obj;
                                    Locale locale = bgl.a;
                                    boolean c = welVar.c();
                                    long longValue = number.longValue();
                                    if (number instanceof Long) {
                                        bgl.c(sb, longValue, c);
                                        return;
                                    }
                                    if (number instanceof Integer) {
                                        bgl.c(sb, longValue & 4294967295L, c);
                                        return;
                                    }
                                    if (number instanceof Byte) {
                                        bgl.c(sb, longValue & 255, c);
                                        return;
                                    }
                                    if (number instanceof Short) {
                                        bgl.c(sb, longValue & WebSocketProtocol.PAYLOAD_SHORT_MAX, c);
                                        return;
                                    }
                                    if (number instanceof BigInteger) {
                                        String bigInteger = ((BigInteger) number).toString(16);
                                        if (c) {
                                            bigInteger = bigInteger.toUpperCase(bgl.a);
                                        }
                                        sb.append(bigInteger);
                                        return;
                                    }
                                    dmk.n("unsupported number type: ".concat(String.valueOf(number.getClass())));
                                    return;
                                }
                            }
                            welVar2 = welVar;
                            if (welVar2.equals(welVar)) {
                            }
                        }
                    }
                } else if (welVar.b()) {
                    if (obj instanceof Character) {
                        sb.append(obj);
                        return;
                    }
                    int intValue = ((Number) obj).intValue();
                    if ((intValue >>> 16) == 0) {
                        sb.append((char) intValue);
                        return;
                    } else {
                        sb.append(Character.toChars(intValue));
                        return;
                    }
                }
            }
            if (welVar.b()) {
                sb.append(obj);
                return;
            }
        } else if (!(obj instanceof Formattable)) {
            if (welVar.b()) {
                sb.append(bgl.a(obj));
                return;
            }
        } else {
            Formattable formattable = (Formattable) obj;
            Locale locale2 = bgl.a;
            int i6 = welVar.a;
            int i7 = i6 & 162;
            if (i7 != 0) {
                if ((i6 & 32) == 0) {
                    i3 = 0;
                }
                if ((i6 & 128) != 0) {
                    i = 2;
                } else {
                    i = 0;
                }
                if ((i6 & 2) == 0) {
                    i2 = 0;
                }
                i7 = i3 | i | i2;
            }
            int length = sb.length();
            Formatter formatter = new Formatter(sb, bgl.a);
            try {
                formattable.formatTo(formatter, i7, welVar.b, welVar.c);
                return;
            } catch (RuntimeException e) {
                sb.setLength(length);
                try {
                    Appendable out = formatter.out();
                    try {
                        simpleName = e.toString();
                    } catch (RuntimeException e2) {
                        simpleName = e2.getClass().getSimpleName();
                    }
                    out.append(bgl.b(formattable, simpleName));
                    return;
                } catch (IOException unused) {
                    return;
                }
            }
        }
        String e3 = telVar.e();
        if (!welVar.b()) {
            int a = telVar.a();
            if (welVar.c()) {
                a &= 65503;
            }
            StringBuilder sb2 = new StringBuilder("%");
            welVar.a(sb2);
            sb2.append((char) a);
            e3 = sb2.toString();
        }
        sb.append(String.format(bgl.a, e3, obj));
    }

    public void g(szn sznVar, StringBuilder sb) {
        for (szn sznVar2 : sznVar.d.values()) {
            sb.append("  ");
            sb.append(sznVar);
            sb.append(" -> ");
            sb.append(sznVar2);
            sb.append(" [label=\"");
            int[] iArr = (int[]) this.e;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, sznVar2.a, Math.min(iArr.length, sznVar2.b + 1))));
            sb.append("\"]\n");
            g(sznVar2, sb);
        }
    }

    public boolean h(int i, int i2, int i3, int i4) {
        if (i >= 0 && i3 >= 0) {
            int[] iArr = (int[]) this.e;
            int length = iArr.length;
            int min = Math.min(length, i2);
            if (min - i == Math.min(length, i4) - i3) {
                for (int i5 = i; i5 <= min; i5++) {
                    if (iArr[i5] != iArr[(i3 + i5) - i]) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sb = new StringBuilder("digraph {\n");
                g((szn) this.f, sb);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public rc0(n5l n5lVar, Object[] objArr, StringBuilder sb) {
        this.a = 4;
        this.b = 0;
        this.c = -1;
        tbn.c(n5lVar, "context");
        this.e = n5lVar;
        this.d = 0;
        this.f = objArr;
        this.g = sb;
    }

    public rc0(int[] iArr) {
        this.a = 3;
        this.e = iArr;
        szn sznVar = new szn(-1, -1);
        this.f = sznVar;
        this.g = sznVar;
    }

    public rc0() {
        this.a = 0;
        this.b = 30;
        this.f = "";
        this.g = new QuerySortByField();
        this.c = 30;
    }

    public rc0(kfc kfcVar) {
        this.a = 1;
        this.b = 1;
        this.e = kfcVar;
        this.f = kfcVar;
    }
}
