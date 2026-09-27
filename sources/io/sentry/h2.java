package io.sentry;

import java.io.Reader;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class h2 implements k3 {
    public final io.sentry.vendor.gson.stream.a a;
    public final ArrayDeque b = new ArrayDeque();
    public int c = 0;

    public h2(Reader reader) {
        this.a = new io.sentry.vendor.gson.stream.a(reader);
    }

    @Override // io.sentry.k3
    public final TimeZone B(x0 x0Var) {
        if (this.a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            o();
            return null;
        }
        try {
            return TimeZone.getTimeZone(nextString());
        } catch (Exception e) {
            x0Var.d(p5.ERROR, "Error when deserializing TimeZone", e);
            return null;
        }
    }

    @Override // io.sentry.k3
    public final Double M() {
        if (this.a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            o();
            return null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // io.sentry.k3
    public final Date P(x0 x0Var) {
        if (this.a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            o();
            return null;
        }
        String nextString = nextString();
        if (nextString == null) {
            return null;
        }
        try {
            try {
                return io.sentry.config.a.k0(nextString);
            } catch (Exception e) {
                x0Var.d(p5.ERROR, "Error when deserializing millis timestamp format.", e);
                return null;
            }
        } catch (Exception unused) {
            return io.sentry.config.a.l0(nextString);
        }
    }

    @Override // io.sentry.k3
    public final Boolean S() {
        io.sentry.vendor.gson.stream.a aVar = this.a;
        if (aVar.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            o();
            return null;
        }
        boolean z = aVar.z();
        g();
        return Boolean.valueOf(z);
    }

    @Override // io.sentry.k3
    public final Object V(x0 x0Var, w1 w1Var) {
        if (this.a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            o();
            return null;
        }
        return w1Var.a(this, x0Var);
    }

    @Override // io.sentry.k3
    public final Float V0() {
        if (this.a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            o();
            return null;
        }
        return Float.valueOf(nextFloat());
    }

    @Override // io.sentry.k3
    public final Object Z0() {
        f2 f2Var = new f2();
        boolean z = false;
        while (!z) {
            int[] iArr = y1.a;
            io.sentry.vendor.gson.stream.a aVar = this.a;
            int i = iArr[aVar.peek().ordinal()];
            ArrayList arrayList = f2Var.a;
            switch (i) {
                case 1:
                    beginArray();
                    arrayList.add(new b2());
                    break;
                case 2:
                    endArray();
                    z = f2Var.b();
                    break;
                case 3:
                    beginObject();
                    arrayList.add(new c2());
                    break;
                case 4:
                    endObject();
                    z = f2Var.b();
                    break;
                case 5:
                    arrayList.add(new d2(aVar.nextName()));
                    break;
                case 6:
                    z = f2Var.c(new x1(this, 0));
                    break;
                case 7:
                    z = f2Var.c(new x1(f2Var, this));
                    break;
                case 8:
                    z = f2Var.c(new x1(this, 2));
                    break;
                case 9:
                    o();
                    z = f2Var.c(new com.appsflyer.internal.l(2));
                    break;
                case 10:
                    z = true;
                    break;
            }
        }
        a2 a = f2Var.a();
        if (a != null) {
            return a.getValue();
        }
        return null;
    }

    @Override // io.sentry.k3
    public final void beginArray() {
        this.a.beginArray();
        g();
        this.c++;
    }

    @Override // io.sentry.k3
    public final void beginObject() {
        this.a.beginObject();
        g();
        this.c++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final void e(g2 g2Var) {
        if (g2Var == null) {
            return;
        }
        ArrayDeque arrayDeque = this.b;
        if (!arrayDeque.isEmpty() && arrayDeque.peekLast() == g2Var) {
            arrayDeque.removeLast();
        } else {
            arrayDeque.remove(g2Var);
        }
    }

    @Override // io.sentry.k3
    public final void endArray() {
        this.a.endArray();
        this.c--;
    }

    @Override // io.sentry.k3
    public final void endObject() {
        this.a.endObject();
        this.c--;
    }

    public final void g() {
        g2 g2Var = (g2) this.b.peekLast();
        if (g2Var != null) {
            g2Var.c = true;
        }
    }

    @Override // io.sentry.k3
    public final ArrayList g1(x0 x0Var, w1 w1Var) {
        boolean z;
        io.sentry.vendor.gson.stream.a aVar = this.a;
        if (aVar.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            o();
            return null;
        }
        beginArray();
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (!aVar.hasNext()) {
                break;
            }
            g2 g2Var = new g2(this.c, aVar.peek());
            this.b.addLast(g2Var);
            try {
                try {
                    arrayList.add(w1Var.a(this, x0Var));
                } catch (Exception e) {
                    x0Var.d(p5.WARNING, "Failed to deserialize object in list.", e);
                    try {
                        p(g2Var);
                        z = true;
                    } catch (Exception e2) {
                        x0Var.d(p5.ERROR, "Stream unrecoverable, aborting list deserialization.", e2);
                        z = false;
                    }
                    if (!z) {
                        e(g2Var);
                        break;
                    }
                }
                e(g2Var);
            } catch (Throwable th) {
                e(g2Var);
                throw th;
            }
        }
        endArray();
        return arrayList;
    }

    @Override // io.sentry.k3
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // io.sentry.k3
    public final Integer n0() {
        if (this.a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            o();
            return null;
        }
        return Integer.valueOf(nextInt());
    }

    @Override // io.sentry.k3
    public final double nextDouble() {
        double nextDouble = this.a.nextDouble();
        g();
        return nextDouble;
    }

    @Override // io.sentry.k3
    public final float nextFloat() {
        double nextDouble = this.a.nextDouble();
        g();
        return (float) nextDouble;
    }

    @Override // io.sentry.k3
    public final int nextInt() {
        char c;
        String G;
        int parseInt;
        io.sentry.vendor.gson.stream.a aVar = this.a;
        int i = aVar.h;
        if (i == 0) {
            i = aVar.g();
        }
        if (i == 15) {
            long j = aVar.i;
            parseInt = (int) j;
            if (j == parseInt) {
                aVar.h = 0;
                int[] iArr = aVar.o;
                int i2 = aVar.m - 1;
                iArr[i2] = iArr[i2] + 1;
            } else {
                throw new NumberFormatException("Expected an int but was " + aVar.i + aVar.y());
            }
        } else {
            if (i == 16) {
                aVar.k = new String(aVar.c, aVar.d, aVar.j);
                aVar.d += aVar.j;
            } else {
                if (i != 8 && i != 9 && i != 10) {
                    StringBuilder sb = new StringBuilder("Expected an int but was ");
                    sb.append(aVar.peek());
                    com.appsflyer.internal.l.m(sb, aVar.y());
                    return 0;
                }
                if (i == 10) {
                    G = aVar.K();
                    aVar.k = G;
                } else {
                    if (i == 8) {
                        c = '\'';
                    } else {
                        c = '\"';
                    }
                    G = aVar.G(c);
                    aVar.k = G;
                }
                try {
                    parseInt = Integer.parseInt(G);
                    aVar.h = 0;
                    int[] iArr2 = aVar.o;
                    int i3 = aVar.m - 1;
                    iArr2[i3] = iArr2[i3] + 1;
                } catch (NumberFormatException unused) {
                }
            }
            aVar.h = 11;
            double parseDouble = Double.parseDouble(aVar.k);
            parseInt = (int) parseDouble;
            if (parseInt == parseDouble) {
                aVar.k = null;
                aVar.h = 0;
                int[] iArr3 = aVar.o;
                int i4 = aVar.m - 1;
                iArr3[i4] = iArr3[i4] + 1;
            } else {
                com.appsflyer.internal.l.j(aVar.k, aVar.y(), "Expected an int but was ");
                return 0;
            }
        }
        g();
        return parseInt;
    }

    @Override // io.sentry.k3
    public final long nextLong() {
        char c;
        String G;
        long j;
        io.sentry.vendor.gson.stream.a aVar = this.a;
        int i = aVar.h;
        if (i == 0) {
            i = aVar.g();
        }
        if (i == 15) {
            aVar.h = 0;
            int[] iArr = aVar.o;
            int i2 = aVar.m - 1;
            iArr[i2] = iArr[i2] + 1;
            j = aVar.i;
        } else {
            if (i == 16) {
                aVar.k = new String(aVar.c, aVar.d, aVar.j);
                aVar.d += aVar.j;
            } else {
                if (i != 8 && i != 9 && i != 10) {
                    StringBuilder sb = new StringBuilder("Expected a long but was ");
                    sb.append(aVar.peek());
                    com.appsflyer.internal.l.m(sb, aVar.y());
                    return 0L;
                }
                if (i == 10) {
                    G = aVar.K();
                    aVar.k = G;
                } else {
                    if (i == 8) {
                        c = '\'';
                    } else {
                        c = '\"';
                    }
                    G = aVar.G(c);
                    aVar.k = G;
                }
                try {
                    long parseLong = Long.parseLong(G);
                    aVar.h = 0;
                    int[] iArr2 = aVar.o;
                    int i3 = aVar.m - 1;
                    iArr2[i3] = iArr2[i3] + 1;
                    j = parseLong;
                } catch (NumberFormatException unused) {
                }
            }
            aVar.h = 11;
            double parseDouble = Double.parseDouble(aVar.k);
            long j2 = (long) parseDouble;
            if (j2 == parseDouble) {
                aVar.k = null;
                aVar.h = 0;
                int[] iArr3 = aVar.o;
                int i4 = aVar.m - 1;
                iArr3[i4] = iArr3[i4] + 1;
                j = j2;
            } else {
                com.appsflyer.internal.l.j(aVar.k, aVar.y(), "Expected a long but was ");
                return 0L;
            }
        }
        g();
        return j;
    }

    @Override // io.sentry.k3
    public final String nextName() {
        return this.a.nextName();
    }

    @Override // io.sentry.k3
    public final String nextString() {
        String nextString = this.a.nextString();
        g();
        return nextString;
    }

    public final void o() {
        this.a.D();
        g();
    }

    public final void p(g2 g2Var) {
        io.sentry.vendor.gson.stream.a aVar;
        while (true) {
            int i = this.c;
            int i2 = g2Var.a;
            aVar = this.a;
            if (i <= i2) {
                break;
            }
            io.sentry.vendor.gson.stream.b peek = aVar.peek();
            if (peek == io.sentry.vendor.gson.stream.b.END_OBJECT) {
                endObject();
            } else if (peek == io.sentry.vendor.gson.stream.b.END_ARRAY) {
                endArray();
            } else {
                skipValue();
            }
        }
        if (!g2Var.c && aVar.peek() == g2Var.b) {
            skipValue();
        }
    }

    @Override // io.sentry.k3
    public final io.sentry.vendor.gson.stream.b peek() {
        return this.a.peek();
    }

    @Override // io.sentry.k3
    public final Long r0() {
        if (this.a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            o();
            return null;
        }
        return Long.valueOf(nextLong());
    }

    @Override // io.sentry.k3
    public final void setLenient(boolean z) {
        this.a.b = z;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x009d. Please report as an issue. */
    @Override // io.sentry.k3
    public final void skipValue() {
        io.sentry.vendor.gson.stream.a aVar;
        int i = 0;
        do {
            aVar = this.a;
            int i2 = aVar.h;
            if (i2 == 0) {
                i2 = aVar.g();
            }
            if (i2 == 3) {
                aVar.N(1);
            } else if (i2 == 1) {
                aVar.N(3);
            } else {
                if (i2 == 4) {
                    aVar.m--;
                } else if (i2 == 2) {
                    aVar.m--;
                } else {
                    if (i2 != 14 && i2 != 10) {
                        if (i2 != 8 && i2 != 12) {
                            if (i2 != 9 && i2 != 13) {
                                if (i2 == 16) {
                                    aVar.d += aVar.j;
                                }
                            } else {
                                aVar.X('\"');
                            }
                        } else {
                            aVar.X('\'');
                        }
                    } else {
                        do {
                            int i3 = 0;
                            while (true) {
                                int i4 = aVar.d + i3;
                                if (i4 < aVar.e) {
                                    char c = aVar.c[i4];
                                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                                        if (c != '#') {
                                            if (c != ',') {
                                                if (c != '/' && c != '=') {
                                                    if (c != '{' && c != '}' && c != ':') {
                                                        if (c != ';') {
                                                            switch (c) {
                                                                case '[':
                                                                case ']':
                                                                    break;
                                                                case '\\':
                                                                    break;
                                                                default:
                                                                    i3++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    aVar.d = i4;
                                }
                            }
                            aVar.e();
                            aVar.d += i3;
                        } while (aVar.o(1));
                    }
                    aVar.h = 0;
                }
                i--;
                aVar.h = 0;
            }
            i++;
            aVar.h = 0;
        } while (i != 0);
        int[] iArr = aVar.o;
        int i5 = aVar.m - 1;
        iArr[i5] = iArr[i5] + 1;
        aVar.n[i5] = "null";
        g();
    }

    @Override // io.sentry.k3
    public final String w0() {
        if (this.a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            o();
            return null;
        }
        return nextString();
    }

    @Override // io.sentry.k3
    public final void x(x0 x0Var, AbstractMap abstractMap, String str) {
        g2 g2Var;
        g2 g2Var2 = null;
        try {
            try {
                g2Var = new g2(this.c, this.a.peek());
                this.b.addLast(g2Var);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            abstractMap.put(str, Z0());
            e(g2Var);
        } catch (Exception e2) {
            e = e2;
            g2Var2 = g2Var;
            x0Var.b(p5.ERROR, e, "Error deserializing unknown key: %s", str);
            if (g2Var2 != null) {
                try {
                    p(g2Var2);
                } catch (Exception e3) {
                    x0Var.d(p5.ERROR, "Stream unrecoverable after unknown key deserialization failure.", e3);
                }
            }
            e(g2Var2);
        } catch (Throwable th2) {
            th = th2;
            g2Var2 = g2Var;
            e(g2Var2);
            throw th;
        }
    }

    @Override // io.sentry.k3
    public final HashMap z0(x0 x0Var, w1 w1Var) {
        boolean z;
        io.sentry.vendor.gson.stream.a aVar = this.a;
        if (aVar.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            o();
            return null;
        }
        beginObject();
        HashMap hashMap = new HashMap();
        if (aVar.hasNext()) {
            while (true) {
                String nextName = aVar.nextName();
                g2 g2Var = new g2(this.c, aVar.peek());
                this.b.addLast(g2Var);
                try {
                    try {
                        hashMap.put(nextName, w1Var.a(this, x0Var));
                    } catch (Exception e) {
                        x0Var.d(p5.WARNING, "Failed to deserialize object in map.", e);
                        try {
                            p(g2Var);
                            z = true;
                        } catch (Exception e2) {
                            x0Var.d(p5.ERROR, "Stream unrecoverable, aborting map deserialization.", e2);
                            z = false;
                        }
                        if (!z) {
                            e(g2Var);
                            break;
                        }
                    }
                    e(g2Var);
                    if (aVar.peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && aVar.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        break;
                    }
                } catch (Throwable th) {
                    e(g2Var);
                    throw th;
                }
            }
        }
        endObject();
        return hashMap;
    }
}
