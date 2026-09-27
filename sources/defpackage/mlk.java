package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class mlk extends llk {
    public mlk(vlk vlkVar, WindowInsets windowInsets) {
        super(vlkVar, windowInsets);
    }

    @Override // defpackage.slk
    public vlk a() {
        return vlk.h(null, this.c.consumeDisplayCutout());
    }

    @Override // defpackage.klk, defpackage.slk
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlk)) {
            return false;
        }
        mlk mlkVar = (mlk) obj;
        if (Objects.equals(this.c, mlkVar.c) && Objects.equals(this.g, mlkVar.g) && klk.K(this.h, mlkVar.h)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.slk
    public nv6 h() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new nv6(displayCutout);
    }

    @Override // defpackage.slk
    public int hashCode() {
        return this.c.hashCode();
    }

    public mlk(vlk vlkVar, mlk mlkVar) {
        super(vlkVar, mlkVar);
    }
}
