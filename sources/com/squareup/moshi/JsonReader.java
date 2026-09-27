package com.squareup.moshi;

import defpackage.bib;
import defpackage.ix2;
import defpackage.ozm;
import defpackage.qfa;
import defpackage.rfa;
import defpackage.sfa;
import defpackage.sv6;
import defpackage.vda;
import defpackage.xbc;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class JsonReader implements Closeable {
    public int a;
    public int[] b;
    public String[] c;
    public int[] d;
    public boolean e;
    public boolean f;

    public JsonReader(JsonReader jsonReader) {
        this.a = jsonReader.a;
        this.b = (int[]) jsonReader.b.clone();
        this.c = (String[]) jsonReader.c.clone();
        this.d = (int[]) jsonReader.d.clone();
        this.e = jsonReader.e;
        this.f = jsonReader.f;
    }

    public final void A(int i) {
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.c;
                this.c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.d;
                this.d = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new RuntimeException("Nesting too deep at ".concat(e()));
            }
        }
        int[] iArr3 = this.b;
        int i3 = this.a;
        this.a = i3 + 1;
        iArr3[i3] = i;
    }

    public final Object D() {
        switch (qfa.a[p().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                beginArray();
                while (hasNext()) {
                    arrayList.add(D());
                }
                endArray();
                return arrayList;
            case 2:
                bib bibVar = new bib();
                beginObject();
                while (hasNext()) {
                    String nextName = nextName();
                    Object D = D();
                    Object put = bibVar.put(nextName, D);
                    if (put != null) {
                        StringBuilder s = ix2.s("Map key '", nextName, "' has multiple values at path ");
                        s.append(e());
                        s.append(": ");
                        s.append(put);
                        s.append(" and ");
                        s.append(D);
                        throw new RuntimeException(s.toString());
                    }
                }
                endObject();
                return bibVar;
            case 3:
                return nextString();
            case 4:
                return Double.valueOf(nextDouble());
            case 5:
                return Boolean.valueOf(g());
            case 6:
                o();
                return null;
            default:
                StringBuilder sb = new StringBuilder("Expected a value but was ");
                sb.append(p());
                xbc.r(sb, " at path ", e());
                return null;
        }
    }

    public abstract int G(rfa rfaVar);

    public abstract int K(rfa rfaVar);

    public abstract void N();

    public final void R(String str) {
        StringBuilder t = sv6.t(str, " at path ");
        t.append(e());
        throw new IOException(t.toString());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [vda, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r4v4, types: [vda, java.lang.RuntimeException] */
    public final vda X(Object obj, Object obj2) {
        if (obj == null) {
            return new RuntimeException("Expected " + obj2 + " but was null at path " + e());
        }
        return new RuntimeException("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + e());
    }

    public abstract void beginArray();

    public abstract void beginObject();

    public final String e() {
        return ozm.d(this.a, this.b, this.c, this.d);
    }

    public abstract void endArray();

    public abstract void endObject();

    public abstract boolean g();

    public abstract boolean hasNext();

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract long nextLong();

    public abstract String nextName();

    public abstract String nextString();

    public abstract void o();

    public abstract sfa p();

    public abstract void skipValue();

    public abstract JsonReader y();

    public abstract void z();

    public JsonReader() {
        this.b = new int[32];
        this.c = new String[32];
        this.d = new int[32];
    }
}
