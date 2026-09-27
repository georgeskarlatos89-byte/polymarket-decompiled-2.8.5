package defpackage;

import com.appsflyer.internal.l;
import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class xga implements Closeable, Flushable {
    public static final Pattern l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] m = new String[128];
    public static final String[] n;
    public final Writer a;
    public int[] b;
    public int c;
    public gl8 d;
    public String e;
    public String f;
    public boolean g;
    public g1i h;
    public boolean i;
    public String j;
    public boolean k;

    static {
        for (int i = 0; i <= 31; i++) {
            m[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public xga(Writer writer) {
        int[] iArr = new int[32];
        this.b = iArr;
        this.c = 0;
        if (iArr.length == 0) {
            iArr = Arrays.copyOf(iArr, 0);
            this.b = iArr;
        }
        int i = this.c;
        this.c = i + 1;
        iArr[i] = 6;
        this.h = g1i.LEGACY_STRICT;
        this.k = true;
        Objects.requireNonNull(writer, "out == null");
        this.a = writer;
        A(gl8.d);
    }

    public final void A(gl8 gl8Var) {
        boolean z;
        Objects.requireNonNull(gl8Var);
        this.d = gl8Var;
        this.f = ",";
        if (gl8Var.c) {
            this.e = ": ";
            if (gl8Var.a.isEmpty()) {
                this.f = ", ";
            }
        } else {
            this.e = ":";
        }
        if (this.d.a.isEmpty() && this.d.b.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
    }

    public final void D(g1i g1iVar) {
        Objects.requireNonNull(g1iVar);
        this.h = g1iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(String str) {
        String[] strArr;
        String str2;
        if (this.i) {
            strArr = n;
        } else {
            strArr = m;
        }
        Writer writer = this.a;
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
                if (i < i2) {
                    writer.write(str, i, i2 - i);
                }
                writer.write(str2);
                i = i2 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                }
                writer.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            writer.write(str, i, length - i);
        }
        writer.write(34);
    }

    public void K(double d) {
        a0();
        if (this.h != g1i.LENIENT && (Double.isNaN(d) || Double.isInfinite(d))) {
            l.h(d, "Numeric values must be finite, but was ");
        } else {
            e();
            this.a.append((CharSequence) Double.toString(d));
        }
    }

    public void N(long j) {
        a0();
        e();
        this.a.write(Long.toString(j));
    }

    public void R(Number number) {
        if (number == null) {
            y();
            return;
        }
        a0();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
                if (cls != Float.class && cls != Double.class && !l.matcher(obj).matches()) {
                    ahh.j("String created by ", cls, " is not a valid JSON number: ", obj);
                    return;
                }
            } else if (this.h != g1i.LENIENT) {
                dmk.v("Numeric values must be finite, but was ".concat(obj));
                return;
            }
        }
        e();
        this.a.append((CharSequence) obj);
    }

    public void X(String str) {
        if (str == null) {
            y();
            return;
        }
        a0();
        e();
        G(str);
    }

    public void Y(boolean z) {
        String str;
        a0();
        e();
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        this.a.write(str);
    }

    public final void a0() {
        if (this.j != null) {
            int z = z();
            if (z == 5) {
                this.a.write(this.f);
            } else if (z != 3) {
                dmk.n("Nesting problem.");
                return;
            }
            p();
            this.b[this.c - 1] = 4;
            G(this.j);
            this.j = null;
        }
    }

    public void beginArray() {
        a0();
        e();
        int i = this.c;
        int[] iArr = this.b;
        if (i == iArr.length) {
            iArr = Arrays.copyOf(iArr, i * 2);
            this.b = iArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        iArr[i2] = 1;
        this.a.write(91);
    }

    public void beginObject() {
        a0();
        e();
        int i = this.c;
        int[] iArr = this.b;
        if (i == iArr.length) {
            iArr = Arrays.copyOf(iArr, i * 2);
            this.b = iArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        iArr[i2] = 3;
        this.a.write(123);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
        int i = this.c;
        if (i <= 1 && (i != 1 || this.b[i - 1] == 7)) {
            this.c = 0;
        } else {
            dmk.x("Incomplete document");
        }
    }

    public final void e() {
        int z = z();
        if (z != 1) {
            Writer writer = this.a;
            if (z != 2) {
                if (z != 4) {
                    if (z != 6) {
                        if (z == 7) {
                            if (this.h != g1i.LENIENT) {
                                dmk.n("JSON must have only one top-level value.");
                                return;
                            }
                        } else {
                            dmk.n("Nesting problem.");
                            return;
                        }
                    }
                    this.b[this.c - 1] = 7;
                    return;
                }
                writer.append((CharSequence) this.e);
                this.b[this.c - 1] = 5;
                return;
            }
            writer.append((CharSequence) this.f);
            p();
            return;
        }
        this.b[this.c - 1] = 2;
        p();
    }

    public void endArray() {
        g(']', 1, 2);
    }

    public void endObject() {
        g('}', 3, 5);
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.c != 0) {
            this.a.flush();
        } else {
            dmk.n("JsonWriter is closed.");
        }
    }

    public final void g(char c, int i, int i2) {
        int z = z();
        if (z != i2 && z != i) {
            dmk.n("Nesting problem.");
            return;
        }
        if (this.j == null) {
            this.c--;
            if (z == i2) {
                p();
            }
            this.a.write(c);
            return;
        }
        omf.q(this.j, "Dangling name: ");
    }

    public void o(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.j == null) {
            int z = z();
            if (z != 3 && z != 5) {
                dmk.n("Please begin an object before writing a name.");
                return;
            } else {
                this.j = str;
                return;
            }
        }
        dmk.n("Already wrote a name, expecting a value.");
    }

    public final void p() {
        if (!this.g) {
            String str = this.d.a;
            Writer writer = this.a;
            writer.write(str);
            int i = this.c;
            for (int i2 = 1; i2 < i; i2++) {
                writer.write(this.d.b);
            }
        }
    }

    public xga y() {
        if (this.j != null) {
            if (this.k) {
                a0();
            } else {
                this.j = null;
                return this;
            }
        }
        e();
        this.a.write("null");
        return this;
    }

    public final int z() {
        int i = this.c;
        if (i != 0) {
            return this.b[i - 1];
        }
        dmk.n("JsonWriter is closed.");
        return 0;
    }
}
