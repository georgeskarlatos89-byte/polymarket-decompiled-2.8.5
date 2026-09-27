package io.sentry.vendor.gson.stream;

import defpackage.dmk;
import defpackage.omf;
import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class c implements Closeable, Flushable {
    public static final String[] i = new String[128];
    public final Writer a;
    public int[] b;
    public int c;
    public String d;
    public String e;
    public boolean f;
    public String g;
    public final boolean h;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            i[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = i;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArr = new int[8];
        this.b = iArr;
        this.c = 0;
        if (iArr.length == 0) {
            iArr = Arrays.copyOf(iArr, 0);
            this.b = iArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        iArr[i2] = 6;
        this.e = ":";
        this.h = true;
        this.a = writer;
    }

    public final void A() {
        if (this.g != null) {
            int y = y();
            if (y == 5) {
                this.a.write(44);
            } else if (y != 3) {
                dmk.n("Nesting problem.");
                return;
            }
            o();
            this.b[this.c - 1] = 4;
            z(this.g);
            this.g = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        int i2 = this.c;
        if (i2 <= 1 && (i2 != 1 || this.b[i2 - 1] == 7)) {
            this.c = 0;
        } else {
            dmk.x("Incomplete document");
        }
    }

    public final void e() {
        int y = y();
        if (y != 1) {
            Writer writer = this.a;
            if (y != 2) {
                if (y != 4) {
                    if (y != 6) {
                        if (y == 7) {
                            if (!this.f) {
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
            writer.append(',');
            o();
            return;
        }
        this.b[this.c - 1] = 2;
        o();
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.c != 0) {
            this.a.flush();
        } else {
            dmk.n("JsonWriter is closed.");
        }
    }

    public final void g(char c, int i2, int i3) {
        int y = y();
        if (y != i3 && y != i2) {
            dmk.n("Nesting problem.");
            return;
        }
        if (this.g == null) {
            this.c--;
            if (y == i3) {
                o();
            }
            this.a.write(c);
            return;
        }
        omf.q(this.g, "Dangling name: ");
    }

    public final void o() {
        if (this.d != null) {
            Writer writer = this.a;
            writer.write(10);
            int i2 = this.c;
            for (int i3 = 1; i3 < i2; i3++) {
                writer.write(this.d);
            }
        }
    }

    public final void p() {
        if (this.g != null) {
            if (this.h) {
                A();
            } else {
                this.g = null;
                return;
            }
        }
        e();
        this.a.write("null");
    }

    public final int y() {
        int i2 = this.c;
        if (i2 != 0) {
            return this.b[i2 - 1];
        }
        dmk.n("JsonWriter is closed.");
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(String str) {
        String str2;
        Writer writer = this.a;
        writer.write(34);
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                str2 = i[charAt];
                if (str2 == null) {
                }
                if (i2 < i3) {
                    writer.write(str, i2, i3 - i2);
                }
                writer.write(str2);
                i2 = i3 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i3) {
                }
                writer.write(str2);
                i2 = i3 + 1;
            }
        }
        if (i2 < length) {
            writer.write(str, i2, length - i2);
        }
        writer.write(34);
    }
}
