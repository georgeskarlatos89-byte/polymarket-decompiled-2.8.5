package defpackage;

import android.widget.EditText;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class tyn {
    public static boolean a(EditText editText) {
        if (editText.getInputType() != 0) {
            return true;
        }
        return false;
    }

    public static final kjc b(float f, float f2, kjc kjcVar) {
        if (f == 1.0f && f2 == 1.0f) {
            return kjcVar;
        }
        return cwl.d(kjcVar, f, f2, 0.0f, 0.0f, null, null, 524284);
    }
}
