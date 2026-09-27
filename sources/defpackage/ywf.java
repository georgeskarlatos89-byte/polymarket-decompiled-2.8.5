package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ywf extends tr9 {
    public final transient mr9 d;
    public final transient Object[] e;
    public final transient int f;

    public ywf(mr9 mr9Var, Object[] objArr, int i) {
        this.d = mr9Var;
        this.e = objArr;
        this.f = i;
    }

    @Override // defpackage.xq9
    public final int b(int i, Object[] objArr) {
        return a().b(i, objArr);
    }

    @Override // defpackage.xq9, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xq9
    public final boolean h() {
        return true;
    }

    @Override // defpackage.xq9
    public final tuj i() {
        return a().q(0);
    }

    @Override // defpackage.tr9
    public final jr9 n() {
        return new xwf(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }
}
