package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c4c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ c4c(MaterialButton materialButton, Drawable drawable, int i) {
        this.a = i;
        this.b = materialButton;
        this.c = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Drawable drawable = this.c;
        MaterialButton materialButton = this.b;
        switch (i) {
            case 0:
                int[] iArr = MaterialButton.N;
                materialButton.setIcon(drawable);
                return;
            default:
                int[] iArr2 = MaterialButton.N;
                materialButton.setIcon(drawable);
                return;
        }
    }
}
