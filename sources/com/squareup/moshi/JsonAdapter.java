package com.squareup.moshi;

import defpackage.bda;
import defpackage.dmk;
import defpackage.i9d;
import defpackage.jq1;
import defpackage.kq1;
import defpackage.lga;
import defpackage.nga;
import defpackage.sfa;
import defpackage.ucd;
import defpackage.wga;
import defpackage.wk0;
import java.io.IOException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class JsonAdapter<T> {
    public final JsonAdapter<T> failOnUnknown() {
        return new bda(this, 2);
    }

    public abstract Object fromJson(JsonReader jsonReader);

    /* JADX WARN: Type inference failed for: r0v0, types: [tp1, java.lang.Object, kq1] */
    public final T fromJson(String str) {
        ?? obj = new Object();
        obj.E0(str);
        lga lgaVar = new lga((kq1) obj);
        T t = (T) fromJson(lgaVar);
        if (!isLenient() && lgaVar.p() != sfa.END_DOCUMENT) {
            throw new RuntimeException("JSON document was not fully consumed.");
        }
        return t;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.moshi.JsonReader, uga] */
    public final T fromJsonValue(Object obj) {
        ?? jsonReader = new JsonReader();
        int[] iArr = jsonReader.b;
        int i = jsonReader.a;
        iArr[i] = 7;
        Object[] objArr = new Object[32];
        jsonReader.g = objArr;
        jsonReader.a = i + 1;
        objArr[i] = obj;
        try {
            return (T) fromJson((JsonReader) jsonReader);
        } catch (IOException e) {
            dmk.i(e);
            return null;
        }
    }

    public JsonAdapter<T> indent(String str) {
        if (str != null) {
            return new wk0(this, str);
        }
        dmk.s("indent == null");
        return null;
    }

    public boolean isLenient() {
        return false;
    }

    public final JsonAdapter<T> lenient() {
        return new bda(this, 1);
    }

    public final JsonAdapter<T> nonNull() {
        if (this instanceof i9d) {
            return this;
        }
        return new i9d(this);
    }

    public final JsonAdapter<T> nullSafe() {
        if (this instanceof ucd) {
            return this;
        }
        return new ucd(this);
    }

    public final JsonAdapter<T> serializeNulls() {
        return new bda(this, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [tp1, java.lang.Object, jq1] */
    public final String toJson(T t) {
        ?? obj = new Object();
        try {
            toJson((jq1) obj, t);
            return obj.R();
        } catch (IOException e) {
            dmk.i(e);
            return null;
        }
    }

    public abstract void toJson(wga wgaVar, Object obj);

    /* JADX WARN: Type inference failed for: r0v0, types: [wga, vga] */
    public final Object toJsonValue(T t) {
        ?? wgaVar = new wga();
        wgaVar.j = new Object[32];
        wgaVar.K(6);
        try {
            toJson((wga) wgaVar, t);
            int i = wgaVar.a;
            if (i <= 1 && (i != 1 || wgaVar.b[i - 1] == 7)) {
                return wgaVar.j[0];
            }
            throw new IllegalStateException("Incomplete document");
        } catch (IOException e) {
            dmk.i(e);
            return null;
        }
    }

    public final void toJson(jq1 jq1Var, T t) {
        toJson(new nga(jq1Var), t);
    }

    public final T fromJson(kq1 kq1Var) {
        return (T) fromJson(new lga(kq1Var));
    }
}
