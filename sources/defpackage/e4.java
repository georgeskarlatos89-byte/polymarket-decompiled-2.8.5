package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class e4 implements Map.Entry {
    public final /* synthetic */ int a;

    public /* synthetic */ e4(int i) {
        this.a = i;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (ckn.a(getKey(), entry.getKey()) && ckn.a(getValue(), entry.getValue())) {
                        return true;
                    }
                }
                return false;
            case 1:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry2 = (Map.Entry) obj;
                    if (ghn.c(getKey(), entry2.getKey()) && ghn.c(getValue(), entry2.getValue())) {
                        return true;
                    }
                }
                return false;
            case 2:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry3 = (Map.Entry) obj;
                    if (jhn.c(getKey(), entry3.getKey()) && jhn.c(getValue(), entry3.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry4 = (Map.Entry) obj;
                    if (mcn.d(getKey(), entry4.getKey()) && mcn.d(getValue(), entry4.getValue())) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        switch (this.a) {
            case 0:
                Object key = getKey();
                Object value = getValue();
                if (key == null) {
                    hashCode = 0;
                } else {
                    hashCode = key.hashCode();
                }
                if (value != null) {
                    i = value.hashCode();
                }
                return hashCode ^ i;
            case 1:
                Object key2 = getKey();
                Object value2 = getValue();
                if (key2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = key2.hashCode();
                }
                if (value2 != null) {
                    i = value2.hashCode();
                }
                return hashCode2 ^ i;
            case 2:
                Object key3 = getKey();
                Object value3 = getValue();
                if (key3 == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = key3.hashCode();
                }
                if (value3 != null) {
                    i = value3.hashCode();
                }
                return hashCode3 ^ i;
            default:
                Object key4 = getKey();
                Object value4 = getValue();
                if (key4 == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = key4.hashCode();
                }
                if (value4 != null) {
                    i = value4.hashCode();
                }
                return hashCode4 ^ i;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return getKey() + "=" + getValue();
            case 1:
                return sv6.n(String.valueOf(getKey()), "=", String.valueOf(getValue()));
            case 2:
                return getKey() + "=" + getValue();
            default:
                return sv6.n(String.valueOf(getKey()), "=", String.valueOf(getValue()));
        }
    }

    public /* synthetic */ e4(boolean z, int i) {
        this.a = i;
    }
}
