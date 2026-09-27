package defpackage;

import io.getstream.chat.android.models.User;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class ey3 {
    public boolean a;

    public /* synthetic */ ey3(boolean z) {
        this.a = z;
    }

    public abstract String a();

    public abstract String b();

    public String c() {
        if (this instanceof tdh) {
            return e.s(((tdh) this).d.getId(), "!", "");
        }
        if (this instanceof udh) {
            return ((udh) this).d.getId();
        }
        dmk.a();
        return null;
    }

    public abstract User d();
}
