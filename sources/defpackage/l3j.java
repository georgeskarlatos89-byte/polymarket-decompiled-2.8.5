package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class l3j {
    public static final l3j c = new l3j(0, 0);
    public final int a;
    public final int b;

    public l3j(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return (this.b * 60) + (this.a * 3600);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l3j.class == obj.getClass()) {
            l3j l3jVar = (l3j) obj;
            if (this.a == l3jVar.a && this.b == l3jVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimezoneOffset{hours=");
        sb.append(this.a);
        sb.append(", minutes=");
        return sv6.o(sb, this.b, '}');
    }
}
