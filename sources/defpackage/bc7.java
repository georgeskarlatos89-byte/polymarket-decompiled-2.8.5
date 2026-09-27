package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bc7 extends hb7 implements Runnable {
    public final WeakReference a;

    public bc7(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // defpackage.hb7
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.a.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        cc7.a((EditText) this.a.get(), 1);
    }
}
