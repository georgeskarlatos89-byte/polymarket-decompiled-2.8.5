package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.i;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vr6 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ i a;

    public vr6(i iVar) {
        this.a = iVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        i iVar = this.a;
        Dialog dialog = iVar.l;
        if (dialog != null) {
            iVar.onCancel(dialog);
        }
    }
}
