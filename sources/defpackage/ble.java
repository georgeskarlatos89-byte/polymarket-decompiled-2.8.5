package defpackage;

import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ble {
    public CharSequence a;
    public IconCompat b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ble)) {
            return false;
        }
        ble bleVar = (ble) obj;
        String str = this.d;
        String str2 = bleVar.d;
        if (str == null && str2 == null) {
            if (!Objects.equals(Objects.toString(this.a), Objects.toString(bleVar.a)) || !Objects.equals(this.c, bleVar.c) || !Boolean.valueOf(this.e).equals(Boolean.valueOf(bleVar.e)) || !Boolean.valueOf(this.f).equals(Boolean.valueOf(bleVar.f))) {
                return false;
            }
            return true;
        }
        return Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.a, this.c, Boolean.valueOf(this.e), Boolean.valueOf(this.f));
    }
}
