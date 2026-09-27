package com.launchdarkly.sdk;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonWriter;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.eva;
import defpackage.fva;
import defpackage.hdi;
import defpackage.yfa;
import defpackage.zfa;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@JsonAdapter(LDValueTypeAdapter.class)
/* loaded from: classes3.dex */
public abstract class LDValue implements yfa {
    public static LDValue m(LDValue lDValue) {
        if (lDValue == null) {
            return LDValueNull.INSTANCE;
        }
        return lDValue;
    }

    public static LDValue n(String str) {
        if (str == null) {
            return LDValueNull.INSTANCE;
        }
        return LDValueString.t(str);
    }

    public boolean a() {
        return false;
    }

    public double b() {
        return ConstantsKt.UNSET;
    }

    public LDValue c(int i) {
        return LDValueNull.INSTANCE;
    }

    public LDValue d(String str) {
        return LDValueNull.INSTANCE;
    }

    public abstract fva e();

    public final boolean equals(Object obj) {
        if (obj instanceof LDValue) {
            if (obj != this) {
                LDValue lDValue = (LDValue) obj;
                if (e() == lDValue.e()) {
                    int i = eva.a[e().ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (i == 6 && o() == lDValue.o()) {
                                        for (String str : k()) {
                                            if (!d(str).equals(lDValue.d(str))) {
                                            }
                                        }
                                    }
                                } else if (o() == lDValue.o()) {
                                    for (int i2 = 0; i2 < o(); i2++) {
                                        if (c(i2).equals(lDValue.c(i2))) {
                                        }
                                    }
                                }
                            } else {
                                return p().equals(lDValue.p());
                            }
                        } else if (b() == lDValue.b()) {
                        }
                    } else {
                        return lDValue instanceof LDValueNull;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public int f() {
        return 0;
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return this instanceof LDValueNull;
    }

    public final int hashCode() {
        int i = eva.a[e().ordinal()];
        if (i != 2) {
            if (i == 3) {
                return a() ? 1 : 0;
            }
            if (i != 4) {
                int i2 = 0;
                if (i != 5) {
                    if (i != 6) {
                        return 0;
                    }
                    for (String str : k()) {
                        i2 = hdi.e(i2 * 31, 31, str) + d(str).hashCode();
                    }
                    return i2;
                }
                Iterator it = r().iterator();
                while (it.hasNext()) {
                    i2 = (i2 * 31) + ((LDValue) it.next()).hashCode();
                }
                return i2;
            }
            return p().hashCode();
        }
        return f();
    }

    public boolean i() {
        return this instanceof LDValueNumber;
    }

    public boolean j() {
        return this instanceof LDValueString;
    }

    public Iterable k() {
        return Collections.EMPTY_LIST;
    }

    public long l() {
        return 0L;
    }

    public int o() {
        return 0;
    }

    public String p() {
        return null;
    }

    public String q() {
        return zfa.a.toJson(this);
    }

    public Iterable r() {
        return Collections.EMPTY_LIST;
    }

    public abstract void s(JsonWriter jsonWriter);

    public final String toString() {
        return q();
    }
}
