package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class eib implements Map.Entry {
    public eib a;
    public eib b;
    public eib c;
    public eib d;
    public eib e;
    public final Object f;
    public final boolean g;
    public Object h;
    public int i;

    public eib(boolean z, eib eibVar, Object obj, eib eibVar2, eib eibVar3) {
        this.a = eibVar;
        this.f = obj;
        this.g = z;
        this.i = 1;
        this.d = eibVar2;
        this.e = eibVar3;
        eibVar3.d = this;
        eibVar2.e = this;
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
        if (obj == null && !this.g) {
            dmk.s("value == null");
            return null;
        }
        Object obj2 = this.h;
        this.h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f + "=" + this.h;
    }

    public eib(boolean z) {
        this.f = null;
        this.g = z;
        this.e = this;
        this.d = this;
    }
}
