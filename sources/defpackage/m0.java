package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class m0 extends eld {
    public static final m0 a = new Object();

    @Override // defpackage.eld
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.eld
    public final boolean b() {
        return false;
    }

    @Override // defpackage.eld
    public final Object c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
