package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class l4g {
    public final Resources a;
    public final Resources.Theme b;

    public l4g(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l4g.class == obj.getClass()) {
            l4g l4gVar = (l4g) obj;
            if (this.a.equals(l4gVar.a) && Objects.equals(this.b, l4gVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
