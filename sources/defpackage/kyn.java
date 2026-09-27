package defpackage;

import android.text.TextUtils;
import java.util.UUID;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class kyn {
    public final wwf a;
    public final wwf b;
    public final UUID c;

    public kyn(wwf wwfVar, wwf wwfVar2, UUID uuid) {
        this.a = wwfVar;
        this.b = wwfVar2;
        this.c = uuid;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kyn) {
            kyn kynVar = (kyn) obj;
            if (this.a.equals(kynVar.a) && this.b.equals(kynVar.b) && this.c.equals(kynVar.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003)) * 1000003;
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.a);
    }
}
