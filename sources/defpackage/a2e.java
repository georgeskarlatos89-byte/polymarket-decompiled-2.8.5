package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a2e {
    public final String a;
    public final m9i b;

    public a2e(String str, m9i m9iVar) {
        m9iVar.getClass();
        this.a = str;
        this.b = m9iVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a2e) {
                a2e a2eVar = (a2e) obj;
                if (!Intrinsics.areEqual(this.a, a2eVar.a) || !Intrinsics.areEqual(this.b, a2eVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ToolbarTitleData(text=" + this.a + ", toolbarCustomization=" + this.b + ")";
    }
}
