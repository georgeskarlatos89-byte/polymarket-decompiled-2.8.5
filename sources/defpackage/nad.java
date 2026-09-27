package defpackage;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nad {
    public final Bundle a;
    public IconCompat b;
    public final azf[] c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final CharSequence h;
    public final PendingIntent i;

    public nad(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, azf[] azfVarArr, boolean z, boolean z2, boolean z3) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null) {
            int i = iconCompat.a;
            if ((i == -1 ? ((Icon) iconCompat.b).getType() : i) == 2) {
                this.g = iconCompat.c();
            }
        }
        this.h = tad.b(charSequence);
        this.i = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.c = azfVarArr;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }
}
