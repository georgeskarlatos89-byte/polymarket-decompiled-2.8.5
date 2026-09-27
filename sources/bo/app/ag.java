package bo.app;

import defpackage.yj9;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ag implements yj9 {
    public final UUID a;
    public final String b;

    public ag(UUID uuid) {
        uuid.getClass();
        this.a = uuid;
        String uuid2 = uuid.toString();
        uuid2.getClass();
        this.b = uuid2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ag) && Intrinsics.areEqual(this.a, ((ag) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.yj9
    public final Object forJsonPut() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.b;
    }
}
