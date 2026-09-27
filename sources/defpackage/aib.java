package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class aib implements Map.Entry {
    public aib a;
    public aib b;
    public aib c;
    public aib d;
    public aib e;
    public final Object f;
    public final int g;
    public Object h;
    public int i;

    public aib(aib aibVar, Object obj, int i, aib aibVar2, aib aibVar3) {
        this.a = aibVar;
        this.f = obj;
        this.g = i;
        this.i = 1;
        this.d = aibVar2;
        this.e = aibVar3;
        aibVar3.d = this;
        aibVar2.e = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i = 0;
        Object obj = this.f;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.h;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.h;
        this.h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f + "=" + this.h;
    }

    public aib() {
        this.f = null;
        this.g = -1;
        this.e = this;
        this.d = this;
    }
}
