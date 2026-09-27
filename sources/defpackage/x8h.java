package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class x8h extends tr9 {
    public final transient Object d;

    public x8h(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // defpackage.tr9, defpackage.xq9
    public final jr9 a() {
        return jr9.s(this.d);
    }

    @Override // defpackage.xq9
    public final int b(int i, Object[] objArr) {
        objArr[i] = this.d;
        return i + 1;
    }

    @Override // defpackage.xq9, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // defpackage.xq9
    public final boolean h() {
        return false;
    }

    @Override // defpackage.tr9, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // defpackage.xq9
    public final tuj i() {
        return new n9a(this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.d.toString() + ']';
    }
}
