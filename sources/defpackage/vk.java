package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class vk extends zh {
    public final int a;
    public final uk b;

    public vk(int i, uk ukVar) {
        this.a = i;
        this.b = ukVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vk) {
            vk vkVar = (vk) obj;
            if (vkVar.a == this.a && vkVar.b == this.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.b);
        sb.append(", ");
        return ix2.i(this.a, "-byte key)", sb);
    }
}
