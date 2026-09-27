package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ff7 {
    public final h8h a;
    public final Executor b;

    public ff7(h8h h8hVar, Executor executor) {
        this.a = h8hVar;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ff7) || this.a != ((ff7) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
