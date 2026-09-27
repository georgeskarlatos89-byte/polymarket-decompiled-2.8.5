package bo.app;

import defpackage.m51;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class yd {
    public final zd a;
    public final String b;

    public yd(zd zdVar, String str) {
        str.getClass();
        this.a = zdVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd)) {
            return false;
        }
        yd ydVar = (yd) obj;
        if (this.a == ydVar.a && Intrinsics.areEqual(this.b, ydVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemotePath(pathType=");
        sb.append(this.a);
        sb.append(", remoteUrl=");
        return m51.m(sb, this.b, ')');
    }
}
