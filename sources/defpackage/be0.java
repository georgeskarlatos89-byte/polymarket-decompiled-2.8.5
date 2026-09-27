package defpackage;

import com.google.android.gms.common.api.Status;
import com.socure.docv.capturesdk.api.Keys;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class be0 {
    public final Object a;
    public final Status b;

    public be0(Object obj, Status status) {
        this.a = obj;
        this.b = status;
    }

    public final String toString() {
        ss9 ss9Var = new ss9(this);
        ss9Var.R(this.b, "status");
        ss9Var.R(this.a, Keys.KEY_SOCURE_RESULT);
        return ss9Var.toString();
    }
}
