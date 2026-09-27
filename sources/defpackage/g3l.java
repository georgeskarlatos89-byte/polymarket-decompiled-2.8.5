package defpackage;

import android.content.Intent;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class g3l extends l3l {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ i7b b;

    public g3l(Intent intent, i7b i7bVar) {
        this.a = intent;
        this.b = i7bVar;
    }

    @Override // defpackage.l3l
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
