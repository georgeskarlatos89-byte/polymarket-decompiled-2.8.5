package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class gc7 implements dt9 {
    public final boolean a;

    public gc7(boolean z) {
        this.a = z;
    }

    @Override // defpackage.dt9
    public final z8d b() {
        return null;
    }

    @Override // defpackage.dt9
    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.a) {
            str = "Active";
        } else {
            str = "New";
        }
        return m51.m(sb, str, '}');
    }
}
